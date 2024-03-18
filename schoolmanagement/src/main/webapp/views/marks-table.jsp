<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %>

<%
    String name = "Shital";
    String surname = "Kshirsagar";

%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>All Students</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="col-12">
                <h2>All Student's Marks Will be Displayed Here</h2>
                <div class="card">
                    <div class="card-header">
                        <h5 class="card-title d-inline">Student marks Details</h5>
                        <a class="btn btn-info float-end text-white" href="/student/registration"><i class="bi bi-person-plus-fill"></i></a>
                    </div>
                    <div class="card-body">
                        <table class="table">
                            <thead>
                                <tr>
                                    <th>Roll No</th>
                                    <th>Name</th>
                                    <th>Subject 1</th>
                                    <th>Subject 2</th>
                                    <th>Subject 3</th>
                                    <th>Total</th>
                                    <th>Percentage</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach items="${marksList}" var="marks">
                                    <tr>
                                        <td>${marks.student.rollNo}</td>
                                        <td>${marks.student.name}</td>
                                        <td>${marks.subject1}</td>
                                        <td>${marks.subject2}</td>
                                        <td>${marks.subject3}</td>
                                        <td>${marks.subject1+marks.subject2+marks.subject3}</td>
                                        <td>${(marks.subject1+marks.subject2+marks.subject3)/3}</td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>

</html>