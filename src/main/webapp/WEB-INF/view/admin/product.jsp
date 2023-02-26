<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>SB Admin 2 - Dashboard</title>

<!-- Custom fonts for this template-->
<jsp:include page="./common/link-css.jsp" />
<style>
.btn-edit, .btn-delete {
	margin: 5px;
}
</style>


</head>

<body id="page-top">

	<!-- Page Wrapper -->
	<div id="wrapper">

		<!-- Sidebar -->
		<jsp:include page="./common/sidebar.jsp" />
		<!-- End of Sidebar -->

		<!-- Content Wrapper -->
		<div id="content-wrapper" class="d-flex flex-column">

			<!-- Main Content -->
			<div id="content">

				<!-- Topbar -->
				<jsp:include page="./common/topbar.jsp" />
				<!-- End of Topbar -->

				<!-- Begin Page Content -->
				<div class="container-fluid">

					<!-- Page Heading -->
					<h1 class="h3 mb-2 text-gray-800">Quản lý phụ kiện </h1>
					<!-- <p class="mb-4">DataTables is a third party plugin that is used to generate the demo table below.
                        For more information about DataTables, please visit the <a target="_blank"
                            href="https://datatables.net">official DataTables documentation</a>.</p> -->

					<!-- DataTales Example -->
					<div class="card shadow mb-4">
						<div class="card-header py-3 row" style="margin: 0">
							<div class="col-4">
								
								<input type="button" value="Add Product"
                           			onclick="window.location.href='showFormForAdd'; return false;" class="add-button"  />
									
							</div>
								
						</div>
						<div class="card-body">
							<div class="table-responsive">
								<table class="table table-bordered table-hover" id="dataTable"
									width="100%" cellspacing="0">
									<thead>
										<tr>
											<th>ID sản phẩm</th>
											<th>Ten sản phẩm</th>
											<th>Mo ta</th>
											<th>So luong</th>
											<th>Giá nhập</th>
											<th>Giá bán</th>
											<th>Thương hiệu</th>
											<th>Image</th>
											<th>Giảm giá</th>
										</tr>
									</thead>
									
									<tbody>
										<c:forEach var="sanPham" items="${dsSanPham}" varStatus="loop">
											<tr>
												
												<td>${sanPham.maSp}</td>
												<td>${sanPham.tenSp}</td>
												<td>${sanPham.moTa}</td>
												<td>${sanPham.soLuongTon}</td>
												<td>${sanPham.giaSP}</td>
												<td>${sanPham.giaMua}</td>
												<td>${sanPham.thuongHieu}</td>
												<td>${sanPham.hinhAnh}</td>
												<td>${sanPham.giamGia}</td>
												<td class="text-center">
													<a href="${pageContext.request.contextPath}/admin/showFormForAdd">Sửa</a>
													<c:url var="deleteUrl"  value="/admin/delete?maSp=${sanPham.maSp}">
														
															<c:param name="maSp" value="${sanPham.maSp} " />
															
														</c:url>
													<a href="${deleteUrl}">Xóa</a>										
												</td>
											</tr>
										</c:forEach>
									</tbody>
									
								</table>
							</div>
						</div>
						<div class="card-footer py-3 row" style="margin: 0">
							
							<div class="col-8" style="text-align: right">
								<jsp:include page="common/page.jsp"></jsp:include>
							</div>
						</div>
					</div>

				</div>
				<!-- /.container-fluid -->

			</div>
			<!-- End of Main Content -->

			<!-- Footer -->
			<jsp:include page="./common/footer.jsp" />
			<!-- End of Footer -->

		</div>
		<!-- End of Content Wrapper -->

	</div>
	<!-- End of Page Wrapper -->

	<!-- Scroll to Top Button-->
	<a class="scroll-to-top rounded" href="#page-top"> <i
		class="fas fa-angle-up"></i>
	</a>


	

	<!-- Logout Modal-->
	<jsp:include page="./common/logout-model.jsp" />

	<!-- Bootstrap core JavaScript-->
	<jsp:include page="./common/link-js.jsp" />

	

	<script>
		$(document).ready(
				function() {
					var modal = new bootstrap.Modal(document
							.getElementById('productModal'), {
						keyboard : false
					});
					$(".btn-edit").click(function() {
						modal.show();
					});
				});
	</script>
</body>

</html>