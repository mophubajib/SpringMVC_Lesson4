<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>create</title>
</head>

<body>
<h2>Create details:</h2>
<br>
<br>
<form:form action="get" modelAttribute="modelCustomer">
    Name <form:input path="name"/><form:errors path="name"/>
    <br>
    Age <form:input path="age"/><form:errors path="age"/>
    <br>
    Salary <form:input path="salary"/><form:errors path="salary"/>
    <br>
    Department <form:select path="department">
    <form:options items="${modelCustomer.departments}"/>
    </form:select>
    <br>
    Which car do u want ?
    BMW <form:radiobutton path="carBrand" value="BMW"/>
    Audi <form:radiobutton path="carBrand" value="Audi"/>
    Mercedes-Benz <form:radiobutton path="carBrand" value="Mercedes-Benz"/>
    <br>
    Which language do u know ?
    EN <form:checkbox path="languages" value="English"/>
    DE <form:checkbox path="languages" value="Deutch"/>
    FR <form:checkbox path="languages" value="French"/>
    <br>
    Phone <form:input path="phone"/><form:errors path="phone"/>
    <br>
    Email <form:input path="email"/><form:errors path="email"/>
    <br>
    <input type="submit" value="Ok">
</form:form>
</body>
</html>
