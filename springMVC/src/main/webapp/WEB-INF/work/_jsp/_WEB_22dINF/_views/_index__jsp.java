/*
 * JSP generated by Resin Professional 3.1.10 (built Tue, 23 Feb 2010 02:58:10 PST)
 */

package _jsp._WEB_22dINF._views;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;

public class _index__jsp extends com.caucho.jsp.JavaPage
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
    com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.PageContextImpl(webApp, this);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("WEB-INF/views/index.jsp"), -264731342896437841L, false);
    com.caucho.jsp.JavaPage.addDepend(_caucho_depends, depend);
  }

  private final static char []_jsp_string0;
  static {
    _jsp_string0 = "\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n<html>\n<head>\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n<title>Insert title here</title>\n\n<!-- CSS goes in the document HEAD or added to your external stylesheet -->\n<style type=\"text/css\">\ntable.gridtable {\n	font-family: verdana,arial,sans-serif;\n	font-size:11px;\n	color:#333333;\n	border-width: 1px;\n	border-color: #666666;\n	border-collapse: collapse;\n}\ntable.gridtable th {\n	border-width: 1px;\n	padding: 8px;\n	border-style: solid;\n	border-color: #666666;\n	background-color: #dedede;\n}\ntable.gridtable td {\n	border-width: 1px;\n	padding: 8px;\n	border-style: solid;\n	border-color: #666666;\n	background-color: #ffffff;\n}\n</style>\n</head>\n<body onload=\"init()\">\n\n<script type=\"text/javascript\" src=\"http://ajax.microsoft.com/ajax/jquery/jquery-1.7.min.js\"></script>\n\n<script type=\"text/javascript\">\n\nfunction init(){\n	//var user = {\"name\":\"piccasi\",\"age\":11, \"curPage\":\"1\", \"pageSize\":\"4\", \"count\":\"17\"};\n	//var user = {\"name\":\"piccasi\",\"age\":\"11\"};\n	var data = {};\n	jQuery.ajax({  \n        type: 'POST',  \n        contentType:'application/json;charset=UTF-8', \n        url: 'query.do',  \n        data: JSON.stringify(data),\n        dataType: 'json',  \n        success: function(result){\n        	var formLoc = $(\"#form\");\n        	generateForm(result.formMeta, result.form, formLoc);\n        	\n        	var contentLoc = $(\"#content\");\n        	generateContent(result.meta, result.userList, contentLoc);\n        	\n        	var pageLoc = $(\"#page\");\n        	generatePage(result.form.curPage, result.form.pageSize, result.form.count, pageLoc);\n		}\n    });\n}\n\nfunction generateForm(formMeta, formData, location){\n	var form_html = \"<form id='__form'>\";\n      \n      for(var key in formMeta){\n    	form_html += \"<label for=\" + key + \">\" + key + \"</label>\";\n    	//alert(formData[key]);\n    	form_html += \"<input type=text name=\" + key + \" value=\" + formData[key] + \">\";\n      }\n      form_html += \"<input type='button' value='\u63d0\u4ea4' onclick='query()'>\";\n      form_html += \"</form>\";\n  	  location.append(form_html);\n}\n\nfunction generateContent(contentMeta, content, location){\n	var table_html = \"<table class='gridtable'>\";\n    \n    table_html += \"<tr>\";\n    for(var j=0; j< contentMeta.length; j++){\n  	  table_html += \"<th>\" + contentMeta[j] + \"</th>\";\n    }\n    table_html += \"</tr>\";\n    \n     for(var i=0; i < content.length; i++){\n  		table_html += \"<tr>\";\n  		for(var j=0; j< contentMeta.length; j++){\n  			table_html += \"<td>\" + content[i][contentMeta[j]] + \"</td>\";\n  		}\n  		table_html += \"</tr>\";\n  	}\n  	\n  	table_html += \"</table>\";\n		//$(\"#json_1\").append(table_html);\n  	location.append(table_html);\n}\n\nfunction generatePage(curPage, pageSize, count, location){\n	//alert(curPage);\n	//alert(pageSize);\n	//alert(count);\n	//var count = parseInt(count);\n	var page_html = \"\";\n	for(var i = 1; i < (count / pageSize) + (count % pageSize); i++){\n		page_html += \"<a href='javascript:void(0)' id=page_\" + i + \" onclick='page(\"+ i +\")'>\" + i + \"</a>\";\n	}\n  	location.append(page_html);\n}\n\nfunction page(id){\n	//var page_id = '#page_' + id;\n	//alert($(page_id));\n	//alert($(page_id).val());\n	//alert($(page_id).html());\n	\n	var data = formToJson($(\"#__form\"));\n	//var formParam = JSON.stringify(data);\n	//alert(data);\n	data.curPage = id.toString();\n	//alert(JSON.stringify(data));\n	\n	jQuery.ajax({  \n        type: 'POST',  \n        contentType:'application/json;charset=UTF-8', \n        url: 'query.do',  \n        data: JSON.stringify(data),\n        dataType: 'json',  \n        success: function(result){\n        	var formLoc = $(\"#form\");\n        	formLoc.empty();\n        	generateForm(result.formMeta, result.form, formLoc);\n        	\n        	var contentLoc = $(\"#content\");\n        	contentLoc.empty();\n        	generateContent(result.meta, result.userList, contentLoc);\n        	\n        	var pageLoc = $(\"#page\");\n        	pageLoc.empty();\n        	generatePage(result.form.curPage, result.form.pageSize, result.form.count, pageLoc);\n        },  \n        error: function(data){  \n            alert(\"error: \" + JSON.stringify(data))  \n        }  \n    });\n}\n\nfunction query(){\n	//formToJson($(\"#__form\"));\n	//alert($(\"#__form\"));\n	//alert($(\"#__form\").serializeArray());\n	var data = formToJson($(\"#__form\"));\n	alert(JSON.stringify(data));\n	//data = JSON.stringify(data);\n	var user = {\"age\":\"500\",\"name\":\"autoCrea\"};\n	jQuery.ajax({  \n        type: 'POST',  \n        contentType:'application/json;charset=UTF-8', \n        url: 'query.do',  \n        data: JSON.stringify(data),\n        dataType: 'json',  \n        success: function(result){\n        	var formLoc = $(\"#form\");\n        	formLoc.empty();\n        	generateForm(result.formMeta, result.form, formLoc);\n        	\n        	var contentLoc = $(\"#content\");\n        	contentLoc.empty();\n        	generateContent(result.meta, result.userList, contentLoc);\n        	\n        	var pageLoc = $(\"#page\");\n        	pageLoc.empty();\n        	generatePage(result.form.curPage, result.form.pageSize, result.form.count, pageLoc);\n        },  \n        error: function(data){  \n            alert(\"error: \" + JSON.stringify(data))  \n        }  \n    });\n}\n\nfunction formToJson(formObj){\n	   var o={};\n	   var a=formObj.serializeArray();\n	   $.each(a, function() {\n\n	       if(this.value){\n	           if (o[this.name]) {\n	               if (!o[this.name].push) {\n	                   o[this.name]=[ o[this.name] ];\n	               }\n	                   o[this.name].push(this.value || null);\n	           }else {\n	               if($(\"[name='\"+this.name+\"']:checkbox\",formObj).length){\n	                   o[this.name]=[this.value];\n	               }else{\n	                   o[this.name]=this.value || null;\n	               }\n	           }\n	       }\n	   });\n	   //alert(JSON.stringify(o));\n	   return o;\n	};\n\n\n\nfunction createForm(){\n	var user = {\"name\":name,\"age\":11};\n	jQuery.ajax({  \n        type: 'POST',  \n        contentType:'application/json;charset=UTF-8', \n        url: 'query.do',  \n        data: JSON.stringify(user),\n        dataType: 'json',  \n        success: function(result){\n        	//alert(result.formMeta.name);\n        	var table_html = \"<from>\";\n  	      \n  	      for(var key in result.formMeta){\n  	    	 // alert(key);\n  	    	table_html += \"<label for=\" + key + \">\" + key + \"</label>\";\n  	    	table_html += \"<input type=text name=\" + key + \" value=\" + result.form[key] + \" />\";\n  	    	\n  	      }\n  	    	table_html += \"<input type='submit' value='\u63d0\u4ea4' onclick='query()'/>\";\n  	    	table_html += \"</form>\";\n  	  		$(\"#form\").append(table_html);\n        },  \n        error: function(data){  \n            alert(\"error: \" + JSON.stringify(data))  \n        }  \n    });\n}\n\nfunction getJson(){\n	  $.getJSON(\"json.do\",function(result){\n		  var table_html = \"<table class='gridtable'>\";\n	      \n	      table_html += \"<tr>\";\n	      for(var j=0; j< result.meta.length; j++){\n	    	  table_html += \"<th>\" + result.meta[j] + \"</th>\";\n	      }\n	      table_html += \"</tr>\";\n	      \n	       for(var i=0; i < result.userList.length; i++){\n	    		table_html += \"<tr>\";\n	    		for(var j=0; j< result.meta.length; j++){\n	    			table_html += \"<td>\" + result.userList[i][result.meta[j]] + \"</td>\";\n	    		}\n	    		table_html += \"</tr>\";\n	    	}\n	    	\n	    	table_html += \"</table>\";\n  	  		$(\"#json_1\").append(table_html);\n	  });\n	  \n}\n\nfunction setJson(name){\n	var user = {\"name\":name,\"age\":11};\n	jQuery.ajax({  \n        type: 'POST',  \n        contentType:'application/json;charset=UTF-8', \n        url: 'query.do',  \n        data: JSON.stringify(user),\n        dataType: 'json',  \n        success: function(data){  \n            alert(data.meta);  \n        },  \n        error: function(data){  \n            alert(\"error: \" + JSON.stringify(data))  \n        }  \n    });    \n}\n</script>\n\n<div id=\"form\"></div>\n<div id=\"content\"></div>\n<div id=\"page\"></div>\n\n<!-- <div>\n<input type=\"button\" id =\"ccc\" value=\"\u751f\u6210form\" onclick=\"createForm()\">\n</div>\n\n<div id=\"form\"></div>\n\n<div>\n<input type=\"button\" id =\"aaa\" value=\"\u70b9\u6211\" onclick=\"getJson()\">\n</div>\n\n<div>\n<input type=\"button\" id =\"bbb\" value=\"\u4f20\u9012json\u53c2\u6570\" onclick=\"setJson('haha')\">\n</div>\n\n<div id =\"json_1\"></div> -->\n</body>\n</html>".toCharArray();
  }
}