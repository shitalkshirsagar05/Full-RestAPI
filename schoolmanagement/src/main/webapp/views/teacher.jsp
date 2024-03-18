<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <title>Teacher Registration</title>
</head>
<body>
   <form action="/teacher/save">
      <p>
         <input type="text" placeholder="Full Name" name="fullname">
      </p>
      <p>
         <input type="text" placeholder="Salary" name="salary">
      </p>
      <p>
         <input type="text" placeholder="Subject" name="subject">
      </p>
      <p>
         <input type="submit">
      </p>

   </form>
</body>
</html>