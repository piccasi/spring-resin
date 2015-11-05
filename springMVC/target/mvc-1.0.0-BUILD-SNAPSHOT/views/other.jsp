<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GB18030">
<title>Insert title here</title>
</head>
<body>
${message}

<form action="command.do" method="get"> 
<input name="name" value="张三"/>
<input name="age" value="20"/>
<input type="submit" value="提交表单"/> 
</form>

</body>
</html>