package com.ongiuaky.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ongiuaky.dao.ProductDao;
import com.ongiuaky.entities.Product;

@WebServlet(urlPatterns = "/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductDao dao = new ProductDao();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		switch (action) {
		case "/new":
			showNewForm(request, response);
			break;
		case "/insert":
			insertProduct(request, response);
			break;
		case "/delete":
			deleteProduct(request, response);
			break;
		case "/edit":
			showEditForm(request, response);
			break;
		case "/update":
			updateUser(request, response);
			break;
		default:
			getProduct(request, response);
			break;
		}
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Product product = new Product();
		product.setProductId(Long.parseLong(request.getParameter("id")));
		product.setProductName(request.getParameter("productName"));
		product.setPrice(Integer.parseInt(request.getParameter("price")));
		dao.updateProduct(product);
		response.sendRedirect("home");
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		Product product = dao.getProductById(id);
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/form.jsp");
		request.setAttribute("product", product);
		dispatcher.forward(request, response);
	}

	private void deleteProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Long id = Long.parseLong(request.getParameter("id"));
		dao.deleteProduct(id);
		response.sendRedirect("home");
	}

	private void insertProduct(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Product product = new Product();
		product.setProductName(request.getParameter("productName"));
		product.setPrice(Integer.parseInt(request.getParameter("price")));
		dao.saveProduct(product);
		response.sendRedirect("home");

	}

	private void getProduct(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Product> products = dao.getProducts();
		request.setAttribute("products", products);
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/home.jsp");
		dispatcher.forward(request, response);
	}

	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("views/form.jsp");
		dispatcher.forward(request, response);
	}

}
