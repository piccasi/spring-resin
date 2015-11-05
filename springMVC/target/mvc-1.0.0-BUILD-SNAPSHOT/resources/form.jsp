<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>spring form</title>
</head>
<body>

<form action="form/query.do" method="get">
    <table>
        <tr>
            <td>Name:</td><td><input name="name" type="text"/></td>
        </tr>
        <tr>
            <td>Age:</td><td><input name="age" type="text"/></td>
        </tr> 
        <tr>
            <td colspan="2"><input type="submit" value="提交"/></td>
        </tr>
    </table>
</form>

</body>
</html>