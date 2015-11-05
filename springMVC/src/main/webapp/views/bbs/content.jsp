<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!-- <div id="content" style="position:absolute;top:100px;left:20%;height:80%;">
 -->
 <form:form action="manage.do" method="post" commandName="userFrom">
    <table>
    	<tr>
            <td>hidden:</td><td><form:hidden path="id"/></td>
        </tr>
        <tr>
            <td>Name:</td><td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Age:</td><td><form:input path="age"/></td>
        </tr>
        <tr>  
            <td>Male:</td>
            <td>
            	<form:radiobutton path="sex" value="1"/>男  
				<form:radiobutton path="sex" value="0"/>女  
            </td>
        </tr>
        <tr>  
           <td>Roles:</td>  
            <td>  
               <form:checkboxes path="roles" items="${roleList}"/>   
            </td>  
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="提交"/></td>
        </tr>
    </table>
</form:form>
<p>test:</p>
${userForm}

<p>session</p>
<%-- <%=request.getSession(false).toString() %> --%>

<p>session.user</p>
${user}

<p id="piccasi">fail</p>

<!-- </div> -->