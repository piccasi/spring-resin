<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>spring form</title>
</head>
<body>
<p>myfrom</p>

<form:form action="form/query.do" method="post" commandName="userFrom">
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

${userForm.name}<br/>
${userForm.age}

</body>
</html>