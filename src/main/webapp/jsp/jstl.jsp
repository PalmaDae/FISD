`<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--Написать код на JSP/FreeMarker, который генерит html список, использую ArrayList товаров. --%>
<%--Нужно вывести, название, ссылку и цену, если товар из листа акционный.--%>

<h2>Акционные товары</h2>
<c:forEach var="product" items="${list}">
    <c:if test="${product.sale}">
        <tr>
            <td>${product.name}</td>
            <td><a href="${product.link}">${product.link}</a></td>
            <td>${product.cost}</td>
        </tr>
    </c:if>
</c:forEach>