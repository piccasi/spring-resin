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
<style type="text/css">
div.foot {
	border-top: 4px; padding-top : 6px;
	margin-top: 10px;
	padding-top: 6px;
}

div.top {
	border-top: 4px; padding-top : 6px;
	margin-top: 6px;
	padding-top: 6px;
}

div.foot p {
	text-align: center;
	margin: 3px;
	font-size: 12px;
	color: #555;
	font-family: Arial
}

div.top p {
	text-align: center;
	margin: 3px;
	font-size: 22px;
	color: #555;
	font-family: Arial
}

div.foot p a:link a:visited a:hover {
	color: #2965b1;
	font-size: 12px;
	margin: 0px 4px
}

</style>
</head>
<body>
	<div class="easyui-layout" fit="true">
		<div region="north" split="true" style="height: 60px;">
			<div id="top" class="top">
				<p>天涯版主管理平台</p>
			</div>
		</div>

		<div region="west" split="true" title="菜单栏" style="width: 150px;">
			<p style="padding: 5px; margin: 0;">Select language:</p>

			<div id="myaccrdion" fit="true" class="easyui-accordion">
				<div title="控件使用" icon="icon-sys"
					style="overflow: auto; padding: 10px;">
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

		<div id="tt" class="easyui-tabs" region="center" split="true">
			<!-- <div title="Home" iconCls="icon-page" style="padding:20px;overflow:hidden;"></div> -->
		</div>

		<!-- <div region="east" split="true" title="east" style="width: 150px;">
			<p>say something</p>
		</div> -->

		<div region="south" split="true" border="false" style="height: 60px;">
			<div id="foot" class="foot">
				<p>
					<a href="http://help.tianya.cn/about/about.html" rel="nofollow"
						target="_blank">关于天涯</a> | <a
						href="http://help.tianya.cn/about/service.html" rel="nofollow"
						target="_blank">广告服务</a> |
					<a href="http://service.tianya.cn/" rel="nofollow" target="_blank">天涯客服</a>
					| <a href="http://help.tianya.cn/about/ystl.html" rel="nofollow"
						target="_blank">隐私和版权</a> | <a
						href="http://help.tianya.cn/about/contact.html" rel="nofollow"
						target="_blank">联系我们</a> | <a href="http://join.tianya.cn"
						rel="nofollow" target="_blank">加入天涯</a> | <a
						href="http://www.tianya.cn/mobile/" rel="nofollow" target="_blank">手机版</a>
					| <a href="http://service.tianya.cn/jbts.html" rel="nofollow"
						target="_blank">举报投诉</a>
				</p>
				<p class="copyright">All rights reserved © 1999 - 2015 天涯社区</p>
			</div>
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