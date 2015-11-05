<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<!-- CSS goes in the document HEAD or added to your external stylesheet -->
<style type="text/css">
table.gridtable {
	font-family: verdana,arial,sans-serif;
	font-size:11px;
	color:#333333;
	border-width: 1px;
	border-color: #666666;
	border-collapse: collapse;
}
table.gridtable th {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #dedede;
}
table.gridtable td {
	border-width: 1px;
	padding: 8px;
	border-style: solid;
	border-color: #666666;
	background-color: #ffffff;
}
</style>
</head>
<body onload="init()">

<script type="text/javascript" src="http://ajax.microsoft.com/ajax/jquery/jquery-1.7.min.js"></script>

<script type="text/javascript">

function init(){
	//var user = {"name":"piccasi","age":11, "curPage":"1", "pageSize":"4", "count":"17"};
	//var user = {"name":"piccasi","age":"11"};
	var data = {};
	jQuery.ajax({  
        type: 'POST',  
        contentType:'application/json;charset=UTF-8', 
        url: 'query.do',  
        data: JSON.stringify(data),
        dataType: 'json',  
        success: function(result){
        	var formLoc = $("#form");
        	generateForm(result.formMeta, result.form, formLoc);
        	
        	var contentLoc = $("#content");
        	generateContent(result.meta, result.userList, contentLoc);
        	
        	var pageLoc = $("#page");
        	generatePage(result.form.curPage, result.form.pageSize, result.form.count, pageLoc);
		}
    });
}

function generateForm(formMeta, formData, location){
	var form_html = "<form id='__form'>";
      
      for(var key in formMeta){
    	form_html += "<label for=" + key + ">" + key + "</label>";
    	//alert(formData[key]);
    	form_html += "<input type=text name=" + key + " value=" + formData[key] + ">";
      }
      form_html += "<input type='button' value='提交' onclick='query()'>";
      form_html += "</form>";
  	  location.append(form_html);
}

function generateContent(contentMeta, content, location){
	var table_html = "<table class='gridtable'>";
    
    table_html += "<tr>";
    for(var j=0; j< contentMeta.length; j++){
  	  table_html += "<th>" + contentMeta[j] + "</th>";
    }
    table_html += "</tr>";
    
     for(var i=0; i < content.length; i++){
  		table_html += "<tr>";
  		for(var j=0; j< contentMeta.length; j++){
  			table_html += "<td>" + content[i][contentMeta[j]] + "</td>";
  		}
  		table_html += "</tr>";
  	}
  	
  	table_html += "</table>";
		//$("#json_1").append(table_html);
  	location.append(table_html);
}

function generatePage(curPage, pageSize, count, location){
	//alert(curPage);
	//alert(pageSize);
	//alert(count);
	//var count = parseInt(count);
	var page_html = "";
	for(var i = 1; i < (count / pageSize) + (count % pageSize); i++){
		page_html += "<a href='javascript:void(0)' id=page_" + i + " onclick='page("+ i +")'>" + i + "</a>";
	}
  	location.append(page_html);
}

function page(id){
	//alert($(page_id).html());
	
	var data = formToJson($("#__form"));
	data.curPage = id.toString();
	
	jQuery.ajax({  
        type: 'POST',  
        contentType:'application/json;charset=UTF-8', 
        url: 'query.do',  
        data: JSON.stringify(data),
        dataType: 'json',  
        success: function(result){
        	var formLoc = $("#form");
        	formLoc.empty();
        	generateForm(result.formMeta, result.form, formLoc);
        	
        	var contentLoc = $("#content");
        	contentLoc.empty();
        	generateContent(result.meta, result.userList, contentLoc);
        	
        	var pageLoc = $("#page");
        	pageLoc.empty();
        	generatePage(result.form.curPage, result.form.pageSize, result.form.count, pageLoc);
        },  
        error: function(data){  
            alert("error: " + JSON.stringify(data))  
        }  
    });
}

function query(){
	var data = formToJson($("#__form"));
	var user = {"age":"500","name":"autoCrea"};
	jQuery.ajax({  
        type: 'POST',  
        contentType:'application/json;charset=UTF-8', 
        url: 'query.do',  
        data: JSON.stringify(data),
        dataType: 'json',  
        success: function(result){
        	var formLoc = $("#form");
        	formLoc.empty();
        	generateForm(result.formMeta, result.form, formLoc);
        	
        	var contentLoc = $("#content");
        	contentLoc.empty();
        	generateContent(result.meta, result.userList, contentLoc);
        	
        	var pageLoc = $("#page");
        	pageLoc.empty();
        	generatePage(result.form.curPage, result.form.pageSize, result.form.count, pageLoc);
        },  
        error: function(data){  
            alert("error: " + JSON.stringify(data))  
        }  
    });
}

function formToJson(formObj){
	   var o={};
	   var a=formObj.serializeArray();
	   $.each(a, function() {

	       if(this.value){
	           if (o[this.name]) {
	               if (!o[this.name].push) {
	                   o[this.name]=[ o[this.name] ];
	               }
	                   o[this.name].push(this.value || null);
	           }else {
	               if($("[name='"+this.name+"']:checkbox",formObj).length){
	                   o[this.name]=[this.value];
	               }else{
	                   o[this.name]=this.value || null;
	               }
	           }
	       }
	   });
	   //alert(JSON.stringify(o));
	   return o;
	};



function createForm(){
	var user = {"name":name,"age":11};
	jQuery.ajax({  
        type: 'POST',  
        contentType:'application/json;charset=UTF-8', 
        url: 'query.do',  
        data: JSON.stringify(user),
        dataType: 'json',  
        success: function(result){
        	//alert(result.formMeta.name);
        	var table_html = "<from>";
  	      
  	      for(var key in result.formMeta){
  	    	 // alert(key);
  	    	table_html += "<label for=" + key + ">" + key + "</label>";
  	    	table_html += "<input type=text name=" + key + " value=" + result.form[key] + " />";
  	    	
  	      }
  	    	table_html += "<input type='submit' value='提交' onclick='query()'/>";
  	    	table_html += "</form>";
  	  		$("#form").append(table_html);
        },  
        error: function(data){  
            alert("error: " + JSON.stringify(data))  
        }  
    });
}

function getJson(){
	  $.getJSON("json.do",function(result){
		  var table_html = "<table class='gridtable'>";
	      
	      table_html += "<tr>";
	      for(var j=0; j< result.meta.length; j++){
	    	  table_html += "<th>" + result.meta[j] + "</th>";
	      }
	      table_html += "</tr>";
	      
	       for(var i=0; i < result.userList.length; i++){
	    		table_html += "<tr>";
	    		for(var j=0; j< result.meta.length; j++){
	    			table_html += "<td>" + result.userList[i][result.meta[j]] + "</td>";
	    		}
	    		table_html += "</tr>";
	    	}
	    	
	    	table_html += "</table>";
  	  		$("#json_1").append(table_html);
	  });
	  
}

function setJson(name){
	var user = {"name":name,"age":11};
	jQuery.ajax({  
        type: 'POST',  
        contentType:'application/json;charset=UTF-8', 
        url: 'query.do',  
        data: JSON.stringify(user),
        dataType: 'json',  
        success: function(data){  
            alert(data.meta);  
        },  
        error: function(data){  
            alert("error: " + JSON.stringify(data))  
        }  
    });    
}
</script>

<div id="form"></div>
<div id="content"></div>
<div id="page"></div>

<!-- <div>
<input type="button" id ="ccc" value="生成form" onclick="createForm()">
</div>

<div id="form"></div>

<div>
<input type="button" id ="aaa" value="点我" onclick="getJson()">
</div>

<div>
<input type="button" id ="bbb" value="传递json参数" onclick="setJson('haha')">
</div>

<div id ="json_1"></div> -->
</body>
</html>