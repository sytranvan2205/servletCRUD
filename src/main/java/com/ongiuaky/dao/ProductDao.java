package com.ongiuaky.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ongiuaky.config.HibernateUtil;
import com.ongiuaky.entities.Product;

public class ProductDao {

	public void saveProduct(Product product) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save
			session.save(product);
			// commit
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

	public List<Product> getProducts() {
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			return session.createQuery("from Product", Product.class).list();
		}
	}

	public Product getProductById(Long id) {
		Product product;
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save
			product = session.find(Product.class, id);
			// commit
			transaction.commit();
			return product;
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean updateProduct(Product product) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			Product temp = getProductById(product.getProductId());
			temp.setProductName(product.getProductName());
			temp.setPrice(product.getPrice());
			session.merge(temp);
			transaction.commit();
			return true;
		} catch (Exception e) {
			if (transaction != null) 
				transaction.rollback();
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteProduct(Long id) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			transaction = session.beginTransaction();
			Product productRemove = getProductById(id);
			session.remove(productRemove);
			transaction.commit();
			return true;
		} catch (Exception e) {
			if (transaction != null) 
				transaction.rollback();
			e.printStackTrace();
		}
		return false;
	}
}
