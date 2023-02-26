<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>THONG TIN NGUOI DUNG</title>
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
           
            <form:form  modelAttribute="nguoidung" method="POST" action="${pageContext.request.contextPath}/shop/saveNguoiDung">
                    <!-- need to associate this data with customer id -->
                <form:hidden path="maND" />
                <table>  <tbody>
                        <tr>
                                <td><label>Ten nguoi dung:</label></td>
                                <td><form:input path="tenND"  /></td>
                        </tr>
                        <tr>
                                <td><label>Dia chi:</label></td>
                                <td><form:input path="diaChi" /></td>
                        </tr>
                       
                        <tr>
                                <td><label>So dien thoai:</label></td>
                                <td><form:input  path="sdt" /></td>
                        </tr>
                     <!--     <tr>
                                <td><label>Ten Tai Khoan/Email</label></td>
                                <td><form:input  path="taiKhoan" /></td>
                        </tr>-->
                       
                        <tr>
                                <td><label></label></td>
                                <td><input type="submit" value="Thanh Toan" class="save" /></td>
                        </tr>
                        </tbody>   </table>
            </form:form>
            <div ></div>
            <p>
                    <a href="${pageContext.request.contextPath}/shop/shopping-car">Back to List</a>
            </p>
    </div>
</body>
</html>