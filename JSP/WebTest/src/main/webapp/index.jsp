<%@ page import="com.example.controller.DB" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    if(application.getAttribute("db")==null){
        DB db = new DB();
        application.setAttribute("db",db);
    }

%>
<!DOCTYPE html>
<html>
<head>
    <title>User Registration</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<%--<form method="POST" action="SignUp" >--%>
<%--    <span>Email</span>--%>
<%--    <input type="text" name="email" placeholder="Enter email here."/>--%>
<%--    <br/>--%>
<%--    <span>User Name</span>--%>
<%--    <input type="text" name="uname" placeholder="Enter Username Here"/>--%>
<%--    <br/>--%>
<%--    <span>Password</span>--%>
<%--    <input type="password" name="password" placeholder="Enter password here"/>--%>
<%--    <br/>--%>
<%--    <input type="submit" value="Submit"/>--%>
<%--</form>--%>
<form method="post" action="SignUp">
    <div class="mb-3">
        <label for="email" class="form-label">Email address</label>
        <input type="email" class="form-control" name="email" placeholder="Enter email here." aria-describedby="emailHelp"/>
        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
    </div>
    <div class="mb-3">
        <label for="uname" class="form-label">UserName</label>
        <input type="text" class="form-control" name="uname" placeholder="Enter Username Here">
    </div>
    <div class="mb-3">
        <label for="password" class="form-label">Password</label>
        <input type="password" class="form-control" name="password" placeholder="Enter password here">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>
<p class="py-2">Already have an account? <a href="Login.jsp">Sign in</a></p>

</body>
</html>