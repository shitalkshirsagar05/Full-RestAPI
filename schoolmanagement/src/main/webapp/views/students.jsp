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
</head>
<body>
    <h2>All Students Will be Displayed Here</h2>
    <c:forEach items="${studentList}" var="student">
        <div>
                    ${student.rollNo}
                    ${student.name}
                    ${student.city}
                    ${student.mobileNo}
        </div>
    </c:forEach>
    <!--div>
            ${studentList[0].rollNo}
            ${studentList[0].name}
            ${studentList[0].city}
            ${studentList[0].mobileNo}
    </div>
    <div>
            ${studentList[1].rollNo}
            ${studentList[1].name}
            ${studentList[1].city}
            ${studentList[1].mobileNo}
    </div-->
</body>
</html>