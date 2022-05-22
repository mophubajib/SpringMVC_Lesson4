<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>get</title>
</head>
<body>
<h2>Details customer:</h2>

<br>
<br>

name: ${modelCustomer.name}
<br>
age: ${modelCustomer.age}
<br>
department: ${modelCustomer.department}
<br>
salary: ${modelCustomer.salary}
<br>
Car brand: ${modelCustomer.carBrand}
<br>
Languages:
<ul>
    <c:forEach var="lang" items="${modelCustomer.languages}">
        <li> ${lang} </li>
    </c:forEach>
</ul>
<br>
Phone: ${modelCustomer.phone}
<br>
Email: ${modelCustomer.email}
</body>
</html>
