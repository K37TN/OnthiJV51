<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body class="container">
<form action="/dichvu/add" method="post" class="">
    <div class="row">
    <div class="col-md-6 mb-3">
        <label >Tên Dịch Vụ </label>
        <input type="text" name="ten" placeholder="Nhập tên dịch vụ" class="form-control">
    </div>
    </div>
    <div class="row">
    <div class="col-md-6 mb-3">
        <label > Đơn giá </label>
        <input type="text" name="donGia" placeholder="Nhập đơn giá"class="form-control">
    </div>
    </div>
    <div class="row">
    <div class="col-md-6 mb-3">
        <label > Đơn vị tiền </label>
        <input type="text" name="donViTien" placeholder="Nhập đơn vị tiền"class="form-control">
    </div>
    </div>
    <div class="row">
    <div class="mb-3">
<%--        <label > Tên loại dịch vụ </label>--%>
<%--        <select class="form-select" aria-label="Default select example" name="loaiDichVu">--%>
<%--            <c:forEach items="#{listloaidichvu}" var="x">--%>
<%--                <option value="x.id" label="${x.ten}" ${list.loaiDichVu.id == x.id ? "selected" : ""}></option>--%>
<%--            </c:forEach>--%>
<%--        </select>--%>
    <div class="col-md-6 mb-3">
        <label > Ten loai dich vu </label>
        <input type="text" name="loaiDichVu" placeholder="Nhập loại dịch vụ"class="form-control">
    </div>
    </div>
    </div>
    <button type="submit" class="btn btn-primary">ADD</button>
</form>
<br>
<table class="table-striped">
    <thead>
    <tr>
        <th>Tên dịch vụ</th>
        <th>Đơn giá</th>
        <th>Đơn vị tiền</th>
        <th>Tên loại dịch vụ</th>
        <th>Mô tả loại dịch vụ</th>
        <th>Chức năng</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="item">
        <tr>
            <td>${item.ten}</td>
            <td>${item.donGia}</td>
            <td>${item.donViTien}</td>
            <td>${item.loaiDichVu.ten}</td>
            <td>${item.loaiDichVu.mota}</td>
            <td><button type="button" class="btn btn-warning">Detail</button></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>