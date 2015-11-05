<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>天涯版主管理系统</title>
<link rel="stylesheet" type="text/css"
	href="../resources/jquery-easyui-1.4.4/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="../resources/jquery-easyui-1.4.4/themes/icon.css">
</head>
<body>

	<div class="easyui-layout" fit="true">
		<div region="west" split="true" title="Navigator"
			style="width: 150px;">
			<p style="padding: 5px; margin: 0;">Select language:</p>

			<div id="myaccrdion" fit="true" class="easyui-accordion">
				<div title="控件使用" icon="icon-sys" style="overflow:auto;padding:10px;">
					<ul>
						<!-- <li><a href="javascript:void(0)" onclick="addTab('admin','hello.do')">admin</a></li>
				<li><a href="javascript:void(0)" onclick="addTab('sina','http://sina.com/')">sina</a></li>
				<li><a href="javascript:void(0)" onclick="addTab('qq','http://qq.com/')">qq</a></li> -->

						<c:forEach items="${__menu_list}" var="entry">
							<li><a href="javascript:void(0)"
								onclick="addTab('${entry.key}','${entry.value}')">${entry.key}</a></li>
						</c:forEach>
					</ul>
				</div>
				
				<div title="控件1" icon="icon-sys">
					<ul>
						<c:forEach items="${__menu_list}" var="entry">
							<li><a href="javascript:void(0)"
								onclick="addTab('${entry.key}','${entry.value}')">${entry.key}</a></li>
						</c:forEach>
					</ul>
				</div>
				
				<div title="控件2" icon="icon-sys">
					<ul>
						<c:forEach items="${__menu_list}" var="entry">
							<li><a href="javascript:void(0)"
								onclick="addTab('${entry.key}','${entry.value}')">${entry.key}</a></li>
						</c:forEach>
					</ul>
				</div>
			</div>
		</div>
		<div id="tt" class="easyui-tabs" region="center" fit="true">
			<!-- <div title="Home" iconCls="icon-page" style="padding:20px;overflow:hidden;"></div> -->
		</div>
	</div>


	<script type="text/javascript"
		src="../resources/jquery-easyui-1.4.4/jquery.min.js"></script>
	<script type="text/javascript"
		src="../resources/jquery-easyui-1.4.4/jquery.easyui.min.js"></script>
	<script>
		/* $(function () {
	    	$('#myaccrdion').accordion();
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
						+ url + '" style="width:100%;height:100%;"></iframe>';
				$('#tt').tabs('add', {
					title : title,
					content : content,
					closable : true
				});
			}
		}
	</script>
</body>
</html>