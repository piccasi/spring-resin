/*
 * JSP generated by Resin Professional 3.1.10 (built Tue, 23 Feb 2010 02:58:10 PST)
 */

package _jsp._views;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _home__jsp extends com.caucho.jsp.JavaPage
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
    try {
      out.write(_jsp_string0, 0, _jsp_string0.length);
      _caucho_expr_0.print(out, _jsp_env, false);
      out.write(_jsp_string1, 0, _jsp_string1.length);
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
    manager.addTaglibFunctions(_jsp_functionMap, "c", "http://java.sun.com/jsp/jstl/core");
    com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.PageContextImpl(webApp, this);
    _caucho_expr_0 = com.caucho.jsp.JspUtil.createExpr(pageContext.getELContext(), "${serverTime}");
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("views/home.jsp"), -1739391591213885030L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }
  private static com.caucho.el.Expr _caucho_expr_0;

  private final static char []_jsp_string0;
  private final static char []_jsp_string1;
  static {
    _jsp_string0 = "\n\n\n<html>\n<head>\n	<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/jquery-easyui-1.4.4/themes/default/easyui.css\">\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/jquery-easyui-1.4.4/themes/icon.css\">\n	<link rel=\"stylesheet\" type=\"text/css\" href=\"../resources/jquery-easyui-1.4.4/demo/demo.css\">\n	<title>Home</title>\n	\n		<style type=\"text/css\">\n		/*\n		#fm{\n			margin:0;\n			padding:10px 30px;\n		}\n		.ftitle{\n			font-size:14px;\n			font-weight:bold;\n			color:#666;\n			padding:5px 0;\n			margin-bottom:10px;\n			border-bottom:1px solid #ccc;\n		}\n		.fitem{\n			margin-bottom:5px;\n		}\n		.fitem label{\n			display:inline-block;\n			width:80px;\n		}*/\n	</style>\n</head>\n<body>\n<script type=\"text/javascript\" src=\"../resources/jquery-easyui-1.4.4/jquery.min.js\"></script>\n<script type=\"text/javascript\" src=\"../resources/jquery-easyui-1.4.4/jquery.easyui.min.js\"></script>\n\n<script type=\"text/javascript\">\n/*  function init(){\n	$('#dg').datagrid('hideColumn', 'id');\n }  */\nfunction doSearch(){\n	var ids = [];\n	var rows = $('#dg').datagrid('getSelections');\n	for(var i=0; i<rows.length; i++){\n		ids.push(rows[i].id);\n	}\n	alert(ids.join(','));\n	\n	alert($('#itemid').val());\n	alert($('#productid').val());\n	\n	$('#dg').datagrid('load',{\n		itemid: $('#itemid').val(),\n		productid: $('#productid').val()\n	});\n	\n	$('#dg').datagrid('hideColumn', id);\n}\n</script>\n\n<!-- <h1>\n	Hello world!  \n</h1>\n\n<P>  The time on the server is ".toCharArray();
    _jsp_string1 = ". </P> -->\n\n<table id=\"dg\" class=\"easyui-datagrid\"\n			url=\"getUser.do\"\n			toolbar=\"#toolbar\" pagination=\"true\" idField=\"id\"\n			rownumbers=\"true\" fitColumns=\"true\">\n	<thead>\n		<tr>\n			<th field=\"ck\" checkbox=\"true\"></th>\n			<th field=\"id\" width=\"10\" hidden=\"true\">id</th>\n			<th field=\"name\" width=\"50\">First Name</th>\n			<th field=\"age\" width=\"40\">Last Name</th>\n\n		</tr>\n	</thead>\n</table>\n\n\n\n<div id=\"toolbar\">\n	<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-add\" plain=\"true\" onclick=\"newUser()\">New User</a>\n	<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-edit\" plain=\"true\" onclick=\"editUser()\">Edit User</a>\n	<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-remove\" plain=\"true\" onclick=\"destroyUser()\">Remove User</a>\n		<div id=\"tb\" style=\"padding:3px\">\n		<span>Item ID:</span>\n		<select name=\"cars\" id=\"itemid\">\n<option value=\"1\">Volvo</option>\n<option value=\"2\">Saab</option>\n<option value=\"3\" selected=\"selected\">Fiat</option>\n<option value=\"4\">Audi</option>\n</select>\n		<span>Product ID:</span>\n		<input id=\"productid\">\n		<a href=\"#\" class=\"easyui-linkbutton\" iconCls=\"icon-search\" onclick=\"doSearch()\">Search</a>\n	</div>\n</div>\n\n\n</body>\n</html>\n".toCharArray();
  }
}
