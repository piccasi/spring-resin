/*
 * JSP generated by Resin Professional 3.1.10 (built Tue, 23 Feb 2010 02:58:10 PST)
 */

package _jsp._views;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _layout__jsp extends com.caucho.jsp.JavaPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    javax.servlet.ServletContext application = _jsp_application;
    com.caucho.jsp.PageContextImpl pageContext = _jsp_application.getJspApplicationContext().allocatePageContext(this, _jsp_application, request, response, null, null, 8192, true, false);
    javax.servlet.jsp.PageContext _jsp_parentContext = pageContext;
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    response.setContentType("text/html; charset=UTF-8");
    request.setCharacterEncoding("UTF-8");
    com.caucho.jsp.IteratorLoopSupportTag _jsp_loop_0 = null;
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      if (_jsp_loop_0 == null)
        _jsp_loop_0 = new com.caucho.jsp.IteratorLoopSupportTag();
      java.lang.Object _jsp_items_1 = _caucho_expr_0.evalObject(_jsp_env);
      java.util.Iterator _jsp_iter_1 = com.caucho.jstl.rt.CoreForEachTag.getIterator(_jsp_items_1);
      _jsp_loop_0.init(0, Integer.MAX_VALUE, 1);
      Object _jsp_oldVar_1 = pageContext.getAttribute("entry");
      while (_jsp_iter_1.hasNext()) {
        Object _jsp_i_1 = _jsp_iter_1.next();
        pageContext.setAttribute("entry", _jsp_i_1);
        _jsp_loop_0.setCurrent(_jsp_i_1, _jsp_iter_1.hasNext());
        out.write(_jsp_string1, 0, _jsp_string1.length);
        _caucho_expr_1.print(out, _jsp_env, false);
        out.write(_jsp_string2, 0, _jsp_string2.length);
        _caucho_expr_2.print(out, _jsp_env, false);
        out.write(_jsp_string3, 0, _jsp_string3.length);
        _caucho_expr_1.print(out, _jsp_env, false);
        out.write(_jsp_string4, 0, _jsp_string4.length);
      }
      pageContext.pageSetOrRemove("entry", _jsp_oldVar_1);
      out.write(_jsp_string5, 0, _jsp_string5.length);
      if (_jsp_loop_0 == null)
        _jsp_loop_0 = new com.caucho.jsp.IteratorLoopSupportTag();
      java.lang.Object _jsp_items_2 = _caucho_expr_0.evalObject(_jsp_env);
      java.util.Iterator _jsp_iter_2 = com.caucho.jstl.rt.CoreForEachTag.getIterator(_jsp_items_2);
      _jsp_loop_0.init(0, Integer.MAX_VALUE, 1);
      Object _jsp_oldVar_2 = pageContext.getAttribute("entry");
      while (_jsp_iter_2.hasNext()) {
        Object _jsp_i_2 = _jsp_iter_2.next();
        pageContext.setAttribute("entry", _jsp_i_2);
        _jsp_loop_0.setCurrent(_jsp_i_2, _jsp_iter_2.hasNext());
        out.write(_jsp_string1, 0, _jsp_string1.length);
        _caucho_expr_1.print(out, _jsp_env, false);
        out.write(_jsp_string2, 0, _jsp_string2.length);
        _caucho_expr_2.print(out, _jsp_env, false);
        out.write(_jsp_string3, 0, _jsp_string3.length);
        _caucho_expr_1.print(out, _jsp_env, false);
        out.write(_jsp_string4, 0, _jsp_string4.length);
      }
      pageContext.pageSetOrRemove("entry", _jsp_oldVar_2);
      out.write(_jsp_string6, 0, _jsp_string6.length);
      if (_jsp_loop_0 == null)
        _jsp_loop_0 = new com.caucho.jsp.IteratorLoopSupportTag();
      java.lang.Object _jsp_items_3 = _caucho_expr_0.evalObject(_jsp_env);
      java.util.Iterator _jsp_iter_3 = com.caucho.jstl.rt.CoreForEachTag.getIterator(_jsp_items_3);
      _jsp_loop_0.init(0, Integer.MAX_VALUE, 1);
      Object _jsp_oldVar_3 = pageContext.getAttribute("entry");
      while (_jsp_iter_3.hasNext()) {
        Object _jsp_i_3 = _jsp_iter_3.next();
        pageContext.setAttribute("entry", _jsp_i_3);
        _jsp_loop_0.setCurrent(_jsp_i_3, _jsp_iter_3.hasNext());
        out.write(_jsp_string1, 0, _jsp_string1.length);
        _caucho_expr_1.print(out, _jsp_env, false);
        out.write(_jsp_string2, 0, _jsp_string2.length);
        _caucho_expr_2.print(out, _jsp_env, false);
        out.write(_jsp_string3, 0, _jsp_string3.length);
        _caucho_expr_1.print(out, _jsp_env, false);
        out.write(_jsp_string4, 0, _jsp_string4.length);
      }
      pageContext.pageSetOrRemove("entry", _jsp_oldVar_3);
      out.write(_jsp_string7, 0, _jsp_string7.length);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_application.getJspApplicationContext().freePageContext(pageContext);
    }
  }

  private java.util.ArrayList _caucho_depends = new java.util.ArrayList();

  public java.util.ArrayList _caucho_getDependList()
  {
    return _caucho_depends;
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    super._caucho_addDepend(depend);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;
    if (com.caucho.server.util.CauchoSystem.getVersionId() != 7394374792971521532L)
      return true;
    for (int i = _caucho_depends.size() - 1; i >= 0; i--) {
      com.caucho.vfs.Dependency depend;
      depend = (com.caucho.vfs.Dependency) _caucho_depends.get(i);
      if (depend.isModified())
        return true;
    }
    return false;
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void init(ServletConfig config)
    throws ServletException
  {
    com.caucho.server.webapp.WebApp webApp
      = (com.caucho.server.webapp.WebApp) config.getServletContext();
    super.init(config);
    com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
    manager.addTaglibFunctions(_jsp_functionMap, "c", "http://java.sun.com/jstl/core");
    com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.PageContextImpl(webApp, this);
    _caucho_expr_0 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${__menu_list}");
    _caucho_expr_1 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${entry.key}");
    _caucho_expr_2 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${entry.value}");
  }

  public void destroy()
  {
      _caucho_isDead = true;
      super.destroy();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("views/layout.jsp"), -4364730582831327854L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  static {
    try {
    } catch (Exception e) {
      e.printStackTrace();
      throw new RuntimeException(e);
    }
  }
  private static com.caucho.el.Expr _caucho_expr_0;
  private static com.caucho.el.Expr _caucho_expr_1;
  private static com.caucho.el.Expr _caucho_expr_2;

  private final static char []_jsp_string6;
  private final static char []_jsp_string3;
  private final static char []_jsp_string4;
  private final static char []_jsp_string1;
  private final static char []_jsp_string7;
  private final static char []_jsp_string5;
  private final static char []_jsp_string0;
  private final static char []_jsp_string2;
  static {
    _jsp_string6 = "\n					</ul>\n				</div>\n\n				<div title=\"\u63a7\u4ef62\" icon=\"icon-sys\">\n					<ul>\n						".toCharArray();
    _jsp_string3 = "')\">".toCharArray();
    _jsp_string4 = "</a></li>\n						".toCharArray();
    _jsp_string1 = "\n							<li><a href=\"javascript:void(0)\"\n								onclick=\"addTab('".toCharArray();
    _jsp_string7 = "\n					</ul>\n				</div>\n			</div>\n		</div>\n\n		<div id=\"tt\" class=\"easyui-tabs\" region=\"center\" split=\"true\">\n			<!-- <div title=\"Home\" iconCls=\"icon-page\" style=\"padding:20px;overflow:hidden;\"></div> -->\n		</div>\n\n		<!-- <div region=\"east\" split=\"true\" title=\"east\" style=\"width: 150px;\">\n			<p>say something</p>\n		</div> -->\n\n		<div region=\"south\" split=\"true\" border=\"false\" style=\"height: 60px;\">\n			<div id=\"foot\" class=\"foot\">\n				<p>\n					<a href=\"http://help.tianya.cn/about/about.html\" rel=\"nofollow\"\n						target=\"_blank\">\u5173\u4e8e\u5929\u6daf</a> | <a\n						href=\"http://help.tianya.cn/about/service.html\" rel=\"nofollow\"\n						target=\"_blank\">\u5e7f\u544a\u670d\u52a1</a> |\n					<a href=\"http://service.tianya.cn/\" rel=\"nofollow\" target=\"_blank\">\u5929\u6daf\u5ba2\u670d</a>\n					| <a href=\"http://help.tianya.cn/about/ystl.html\" rel=\"nofollow\"\n						target=\"_blank\">\u9690\u79c1\u548c\u7248\u6743</a> | <a\n						href=\"http://help.tianya.cn/about/contact.html\" rel=\"nofollow\"\n						target=\"_blank\">\u8054\u7cfb\u6211\u4eec</a> | <a href=\"http://join.tianya.cn\"\n						rel=\"nofollow\" target=\"_blank\">\u52a0\u5165\u5929\u6daf</a> | <a\n						href=\"http://www.tianya.cn/mobile/\" rel=\"nofollow\" target=\"_blank\">\u624b\u673a\u7248</a>\n					| <a href=\"http://service.tianya.cn/jbts.html\" rel=\"nofollow\"\n						target=\"_blank\">\u4e3e\u62a5\u6295\u8bc9</a>\n				</p>\n				<p class=\"copyright\">All rights reserved \u00a9 1999 - 2015 \u5929\u6daf\u793e\u533a</p>\n			</div>\n		</div>\n	</div>\n\n\n	<script type=\"text/javascript\"\n		src=\"../resources/jquery-easyui-1.4.4/jquery.min.js\"></script>\n	<script type=\"text/javascript\"\n		src=\"../resources/jquery-easyui-1.4.4/jquery.easyui.min.js\"></script>\n	<script>\n		/* $(function () {\n			$('#myaccrdion').accordion();\n		  }); */\n		  \n\n		function addTab(title, url) {\n			if ($('#tt').tabs('exists', title)) {\n				$('#tt').tabs('select', title);\n			} else {\n				var tabCount = $('#tt').tabs('tabs').length;\n				//alert(tabCount);\n				if (tabCount > 1) {\n					confirm(\"\u60a8\u5f53\u524d\u6253\u5f00\u7684\u7a97\u53e3\u6570\u5df2\u7ecf\u8fbe\u52305\u4e2a\uff0c\u786e\u5b9a\u8981\u6253\u5f00\u8be5\u7a97\u53e3\u5c06\u5173\u95ed\u7b2c\u4e00\u4e2a\u7a97\u53e3\u3002\");\n					$('#tt').tabs('close', 0);\n				}\n\n				var content = '<iframe scrolling=\"auto\" frameborder=\"0\"  src=\"'\n						+ url + '\" style=\"width:100%;height:100%;\"></iframe>';\n				$('#tt').tabs('add', {\n					title : title,\n					content : content,\n					closable : true\n				});\n			}\n		}\n	</script>\n</body>\n</html>".toCharArray();
    _jsp_string5 = "\n					</ul>\n				</div>\n\n				<div title=\"\u63a7\u4ef61\" icon=\"icon-sys\">\n					<ul>\n						".toCharArray();
    _jsp_string0 = "\n\n\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n<title>\u5929\u6daf\u7248\u4e3b\u7ba1\u7406\u7cfb\u7edf</title>\n<link rel=\"stylesheet\" type=\"text/css\"\n	href=\"../resources/jquery-easyui-1.4.4/themes/default/easyui.css\">\n<link rel=\"stylesheet\" type=\"text/css\"\n	href=\"../resources/jquery-easyui-1.4.4/themes/icon.css\">\n<style type=\"text/css\">\ndiv.foot {\n	border-top: 4px; padding-top : 6px;\n	margin-top: 10px;\n	padding-top: 6px;\n}\n\ndiv.top {\n	border-top: 4px; padding-top : 6px;\n	margin-top: 6px;\n	padding-top: 6px;\n}\n\ndiv.foot p {\n	text-align: center;\n	margin: 3px;\n	font-size: 12px;\n	color: #555;\n	font-family: Arial\n}\n\ndiv.top p {\n	text-align: center;\n	margin: 3px;\n	font-size: 22px;\n	color: #555;\n	font-family: Arial\n}\n\n.top {\n    text-align: center;\n    margin: 3px;\n    font-size: 22px;\n    color: #555;\n    font-family: Arial\n}\n\ndiv.foot p a:link a:visited a:hover {\n	color: #2965b1;\n	font-size: 12px;\n	margin: 0px 4px\n}\n\n</style>\n</head>\n<body>\n	<div class=\"easyui-layout\" fit=\"true\">\n		<div region=\"north\" split=\"true\" style=\"height: 60px;\">\n			<div id=\"top\" class=\"top\">\n				<p>\u5929\u6daf\u7248\u4e3b\u7ba1\u7406\u5e73\u53f0</p>\n			</div>\n		</div>\n\n		<div region=\"west\" split=\"true\" title=\"\u83dc\u5355\u680f\" style=\"width: 150px;\">\n			<p style=\"padding: 5px; margin: 0;\">Select language:</p>\n\n			<div id=\"myaccrdion\" fit=\"true\" class=\"easyui-accordion\">\n				<div title=\"\u63a7\u4ef6\u4f7f\u7528\" icon=\"icon-sys\"\n					style=\"overflow: auto; padding: 10px;\">\n					<ul>\n						<!-- <li><a href=\"javascript:void(0)\" onclick=\"addTab('admin','hello.do')\">admin</a></li>\n				<li><a href=\"javascript:void(0)\" onclick=\"addTab('sina','http://sina.com/')\">sina</a></li>\n				<li><a href=\"javascript:void(0)\" onclick=\"addTab('qq','http://qq.com/')\">qq</a></li> -->\n\n						".toCharArray();
    _jsp_string2 = "','".toCharArray();
  }
}
