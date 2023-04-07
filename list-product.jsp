<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List-product</title>
</head>
<body>
	<div class="main-content">
		<div class="main-content-inner">
			<div class="breadcrumbs ace-save-state" id="breadcrumbs">
				<ul class="breadcrumb">
					<li><i class="ace-icon fa fa-home home-icon"></i> <a href="#">Trang
							chủ</a></li>
				</ul>
				<!-- /.breadcrumb -->
			</div>
			<div class="page-content">
				<div class="row">
					<div class="col-xs-12">
					<h4>Danh sách sản phẩm</h4>
						<div class="widget-box table-filter">
							<div class="table-btn-controls">
								<div class="pull-right tableTools-container">
									<div class="dt-buttons btn-overlap btn-group">
										<a flag="info"
											class="dt-button buttons-colvis btn btn-white btn-primary btn-bold"
											data-toggle="tooltip" title='Thêm bài viết' href='#'> <span>
												<i class="fa fa-plus-circle bigger-110 purple"></i>
										</span>
										</a>
										<button id="btnDelete" type="button"
											class="dt-button buttons-html5 btn btn-white btn-primary btn-bold"
											data-toggle="tooltip" title='Xóa bài viết'>
											<span> <i class="fa fa-trash-o bigger-110 pink"></i>
											</span>
										</button>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-xs-12">
						<div class="table-responsive">
							<table class="table table-bordered">
								<thead>
									<tr>
										<th>Tên sản phẩm</th>
										<th>Hình ảnh</th>
										<th>Danh mục</th>
										<th>Giá</th>
										<th>Số lượng tồn</th>
										<th>Thao tác</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>Áo hoodie</td>
										<td><img
											src="https://product.hstatic.net/200000255805/product/z3649814080788_0d61b7d4134712ce34629372240084a8_bee11830c10a4ab0925cc89debbb5a93_master.jpg"
											alt="hoodie" width="40" height="40"
											style="vertical-align: center"></td>
										<td>Category</td>
										<td>300$</td>
										<td>21</td>
										<td><a class="btn btn-sm btn-primary btn-edit"
											data-toggle="tooltip" title="Cập nhật bài viết" href='#'><i
												class="fa fa-pencil-square-o" aria-hidden="true"></i> </a></td>
									</tr>
									<tr>
										<td>Áo hoodie</td>
										<td><img
											src="https://product.hstatic.net/200000255805/product/z3649814080788_0d61b7d4134712ce34629372240084a8_bee11830c10a4ab0925cc89debbb5a93_master.jpg"
											alt="hoodie" width="40" height="40"
											style="vertical-align: center"></td>
										<td>Category</td>
										<td>300$</td>
										<td>21</td>
										<td><a class="btn btn-sm btn-primary btn-edit"
											data-toggle="tooltip" title="Cập nhật bài viết" href='#'><i
												class="fa fa-pencil-square-o" aria-hidden="true"></i> </a></td>
									</tr>
									<tr>
										<td>Áo hoodie</td>
										<td><img
											src="https://product.hstatic.net/200000255805/product/z3649814080788_0d61b7d4134712ce34629372240084a8_bee11830c10a4ab0925cc89debbb5a93_master.jpg"
											alt="hoodie" width="40" height="40"
											style="vertical-align: center"></td>
										<td>Category</td>
										<td>300$</td>
										<td>21</td>
										<td><a class="btn btn-sm btn-primary btn-edit"
											data-toggle="tooltip" title="Cập nhật bài viết" href='#'><i
												class="fa fa-pencil-square-o" aria-hidden="true"></i> </a></td>
									</tr>
								</tbody>
							</table>
							<ul class="pagination" id="pagination"></ul>
							<input type="hidden" value="" id="page" name="page" /> <input
								type="hidden" value="" id="limit" name="limit" />
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- /.main-content -->
</body>
</html>