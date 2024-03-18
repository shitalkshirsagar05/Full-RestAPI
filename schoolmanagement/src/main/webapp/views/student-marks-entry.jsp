<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
</head>
<body>
    <section>
        <div class="container">
            <div class="row">
                <div class="col-12">
                    <div class="card">
                        <div class="card-header">
                            <h5 class="card-title">Marks Entry Form</h5>
                        </div>
                        <div class="card-body">
                            <form action="/marks/save" method="post">
                                <div class="mb-3">
                                    <label for="name" class="form-label">Select Student</label>
                                    <select name="rollNo" id="rollNo" class="form-select">
                                        <c:forEach items="${studentList}" var="student">
                                            <option value="${student.rollNo}">${student.name}</option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="mb-3">
                                    <label for="subject1" class="form-label">Subject 1</label>
                                    <input type="text" class="form-control" id="subject1" name="subject1">
                                </div>
                                <div class="mb-3">
                                    <label for="subject2" class="form-label">Subject 2</label>
                                    <input type="text" class="form-control" id="subject2" name="subject2">
                                </div>
                                <div class="mb-3">
                                    <label for="subject3" class="form-label">Subject 3</label>
                                    <input type="text" class="form-control" id="subject3" name="subject3">
                                </div>
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</html>