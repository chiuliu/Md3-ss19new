<%--
  Created by IntelliJ IDEA.
  User: lequangtiep
  Date: 9/8/24
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <title>Title</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

<div class="container">

    <form action="<%=request.getContextPath()%>/add" method="post">
        <div class="form-group">
            <label for="fullname">FullName</label>
            <input type="text"
                   class="form-control" name="fullname" id="fullname"  placeholder="fullname">
        </div>
        <div class="form-group">
            <label for="email">Email</label>
            <input type="text"
                   class="form-control" name="email" id="email"  placeholder="email">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input type="text"
                   class="form-control" name="password" id="password" placeholder="password">
        </div>
        <div class="form-group">
            <label >Gender</label>
            <input type="radio" name="gender" value="true" id="genderTrue"> <label for="genderTrue">Nam</label>
            <input type="radio" name="gender" value="false" id="genderFalse"> <label for="genderFalse">Nữ</label>
        </div>
        <div class="form-group">
            <label >Status</label>
            <input type="radio" name="status" value="true" id="statusTrue"> <label for="statusTrue">Hoạt động</label>
            <input type="radio" name="status" value="false" id="statusFalse"> <label for="statusFalse">Không hoạt động</label>
        </div>
        <button type="submit">ADD</button>
    </form>


</div>

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
        crossorigin="anonymous"></script>
</body>
</html>
