<h2>Акционные товары</h2>
<ul>
    <#list products as p>
        <#if p.sale>
            <li>
                <a href="${p.link}">${p.name}</a> — ${p.price} руб.
            </li>
        </#if>
    </#list>
</ul>