<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %> 


<div style="position:absolute;top:100px;left:0px;width:20%;height:80%;">
<ol>
<c:forEach items="${__menu_list}" var="entry">
<li><a href="${entry.value}" target="iframe_a">${entry.key}</a></li>
</c:forEach>
</ol>
</div>