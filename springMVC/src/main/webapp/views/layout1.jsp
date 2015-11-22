<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Complex Layout - jQuery EasyUI Demo</title>
<link rel="stylesheet" type="text/css"
	href="../resources/jquery-easyui-1.4.4/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="../resources/jquery-easyui-1.4.4/themes/icon.css">
<link rel="stylesheet" type="text/css" href="../demo.css">
<script type="text/javascript"
	src="../resources/jquery-easyui-1.4.4/jquery.min.js"></script>
<script type="text/javascript"
	src="../resources/jquery-easyui-1.4.4/jquery.easyui.min.js"></script>
</head>
<body style="margin: 0; overflow: hidden;">
	<div class="easyui-layout" fit="true">
		<div data-options="region:'north'" style="height: 50px"></div>
		<div data-options="region:'south'" style="height: 50px;"></div>
		<!-- <div data-options="region:'east',split:true" title="East" style="width:180px;">
			<ul class="easyui-tree" data-options="url:'tree_data1.json',method:'get',animate:true,dnd:true"></ul>
		</div> -->
		<div data-options="region:'west',split:true" title="West"
			style="width: 100px;">
			<div class="easyui-accordion" data-options="fit:true,border:false,selected:false">
				<div title="Title1" style="padding: 10px;">
					<c:forEach items="${__menu_list}" var="entry">
						<li><a href="javascript:void(0)"
							onclick="addTab('${entry.key}','${entry.value}')">${entry.key}</a></li>
					</c:forEach>
				</div>
				<div title="Title2" style="padding: 10px;">content2</div>
				<div title="Title3" style="padding: 10px">content3</div>
			</div>
		</div>
		<div data-options="region:'center'">
			<div id="tt" class="easyui-tabs"
				data-options="fit:true,border:false,plain:true">
			</div>
		</div>
	</div>
	<script>
		/* $(function () {
			$('#myaccrdion').accordion();
		  }); */

		/* $(function(){
		  $('#tt').tabs({
		      width: $("#tt").parent().width(),  
		      height: "auto"  
		  	})
		  }); */

		function addTab(title, url) {
			if ($('#tt').tabs('exists', title)) {
				$('#tt').tabs('select', title);
			} else {
				var tabCount = $('#tt').tabs('tabs').length;
				//alert(tabCount);
				if (tabCount > 1) {
					confirm("您当前打开的窗口数已经达到5个，确定要打开该窗口将关闭第一个窗口。");
					$('#tt').tabs('close', 0);
				}

				var content = '<iframe scrolling="auto" frameborder="0"  src="'
						+ url
						+ '" style="width:100%;height:100%;marginwidth:0; marginheight:0;" ></iframe>';
				$('#tt').tabs('add', {
					id : 'test',
					title : title,
					content : content,
					closable : true,
				});
			}
		}
	</script>
</body>
</html>