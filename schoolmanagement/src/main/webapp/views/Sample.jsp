<%
    int x = 1000;
    int y = 500;

%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>
<p>
    <a href="/about">About</a>
    <a href="/contact">Contact</a>
    <a href="/services">Services</a>
</p>
<h3>Welcome to Spring Boot <% out.println(x+y); %></h3>
<p>
    This is a first page we are loading on the spring boot framework
</p>

</body>
</html>