<%@ page import="java.util.ArrayList" %>
<%@ page import="entity.Product" %>

<%
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product("Телефон", "/phone", 19999, true));
    products.add(new Product("Ноутбук", "/laptop", 49999, false));
    products.add(new Product("Наушники", "/headphones", 2999, true));
%>

<h2>Акционные товары</h2>
<ul>
    <%
        for(Product p : products){
            if(p.sale){ %>
    <li>
        <a href="<%= p.link %>"><%= p.name %></a> — <%= p.cost %>
    </li>
    <%      }
    }
    %>
</ul>
