<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
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
<body>
	<div id="wrapper">
        <div id="header">
                <h2>THEM SAN PHAM</h2>
        </div>
    </div>
    <div id="container">
            <h3>Save </h3>
           
            <form:form  modelAttribute="product" method="POST" action="${pageContext.request.contextPath}/admin/saveProduct">
                    <!-- need to associate this data with customer id -->
                <form:hidden path="maSp" />
                <table>  <tbody>
                        <tr>
                                <td><label>Ten sản phẩm:</label></td>
                                <td><form:input path="tenSp"  /></td>
                        </tr>
                        <tr>
                                <td><label>Mo ta:</label></td>
                                <td><form:input path="moTa" /></td>
                        </tr>
                        <tr>
                                <td><label>So luong:</label></td>
                                <td><form:input path="soLuongTon" /></td>
                        </tr>
                        <tr>
                                <td><label>Gia nhap:</label></td>
                                <td><form:input type="number" path="giaSP" /></td>
                        </tr>
                        <tr>
                                <td><label>Gia ban:</label></td>
                                <td><form:input type="number" path="giaMua" /></td>
                        </tr>
                        <tr>
                                <td><label>Thuong hieu:</label></td>
                                <td><form:input path="thuongHieu" /></td>
                        </tr>
                        <tr>
							<td>Up Load Image</td>
							<td><form:input path="hinhAnh" type="file" class="custom-file-label" for="validatedCustomFile"/></td>
						</tr>
						<tr>
                                <td><label>Giam gia</label></td>
                                <td><form:input type="number" path="giamGia" /></td>
                        </tr>
                        <tr>
                                <td><label></label></td>
                                <td><input type="submit" value="Save" class="save" /></td>
                        </tr>
                        </tbody>   </table>
            </form:form>
            <div ></div>
            <p>
                    <a href="${pageContext.request.contextPath}/admin/product">Back to List</a>
            </p>
    </div>
</body>
</html>