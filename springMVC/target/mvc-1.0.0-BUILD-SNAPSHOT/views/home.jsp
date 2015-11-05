<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="../resources/jquery-easyui-1.4.4/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="../resources/jquery-easyui-1.4.4/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="../resources/jquery-easyui-1.4.4/demo/demo.css">
	<title>Home</title>
	
		<style type="text/css">
		#fm{
			margin:0;
			padding:10px 30px;
		}
		.ftitle{
			font-size:14px;
			font-weight:bold;
			color:#666;
			padding:5px 0;
			margin-bottom:10px;
			border-bottom:1px solid #ccc;
		}
		.fitem{
			margin-bottom:5px;
		}
		.fitem label{
			display:inline-block;
			width:80px;
		}
	</style>
</head>
<body onload="init()">
<script type="text/javascript" src="../resources/jquery-easyui-1.4.4/jquery.min.js"></script>
<script type="text/javascript" src="../resources/jquery-easyui-1.4.4/jquery.easyui.min.js"></script>

<script type="text/javascript">
 function init(){
	$('#dg').datagrid('hideColumn', 'id');
 } 
function doSearch(){
	var ids = [];
	var rows = $('#dg').datagrid('getSelections');
	for(var i=0; i<rows.length; i++){
		ids.push(rows[i].id);
	}
	alert(ids.join(','));
	
	alert($('#itemid').val());
	alert($('#productid').val());
	
	$('#dg').datagrid('load',{
		itemid: $('#itemid').val(),
		productid: $('#productid').val()
	});
	
	$('#dg').datagrid('hideColumn', id);
}
</script>

<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<table id="dg" title="My Users" class="easyui-datagrid"
			url="getUser.do"
			toolbar="#toolbar" pagination="true" idField="id" 
			rownumbers="true" fitColumns="true">
	<thead>
		<tr>
			<th field="ck" checkbox="true"></th>
			<th field="id" width="10">id</th>
			<th field="name" width="50">First Name</th>
			<th field="age" width="40">Last Name</th>

		</tr>
	</thead>
</table>



<div id="toolbar">
	<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="newUser()">New User</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editUser()">Edit User</a>
	<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="destroyUser()">Remove User</a>
		<div id="tb" style="padding:3px">
		<span>Item ID:</span>
		<select name="cars" id="itemid">
<option value="1">Volvo</option>
<option value="2">Saab</option>
<option value="3" selected="selected">Fiat</option>
<option value="4">Audi</option>
</select>
		<span>Product ID:</span>
		<input id="productid">
		<a href="#" class="easyui-linkbutton" iconCls="icon-search" onclick="doSearch()">Search</a>
	</div>
</div>


</body>
</html>
