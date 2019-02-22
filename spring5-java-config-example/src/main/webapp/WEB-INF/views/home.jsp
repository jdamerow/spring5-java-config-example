<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<body>
<h1>Hello World!</h1>

We have the following cats:
<ul>
<c:forEach items="${cats}" var="cat">
<li>${cat.name} (${cat.breed})</li>
</c:forEach>
</ul>

<p>
<a href="<c:url value="/cat" />">Add one!</a>
</p>

<c:if test="${not empty date}">
${date}
</c:if>
<c:if test="${empty date}">
See the <a href="<c:url value="/date" />">date</a>.
</c:if>
</body>
</html>