<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<div style="position:absolute;bottom:0px;left:0px;width:100%;height:100px;background-color:red">
这是底部
<script>
function copyText()
{
//alert("test");
	if (jQuery) { 
		alert("已经加载"); 
	} else { 
		alert("没有加载");  
	} 
	/* $.get("/form/manage.do",function(data,status){
	      //alert("数据：" + data + "\n状态：" + status);
	      //alter();
	      //alert($("#piccasi").text());
	      $("#piccasi").text(data);
	    }); */
	$("#content").load("/form/manage.do");
	//$("piccasi").load("form/manage.do");
//alert(document.getElementById("content").innerHTML);
//document.getElementById("content").innerHTML="haha";
	//$("content").load("/from/manage.do",function(response,status){
		//alter(response);
		//$("content").innerHTML = response;
	      /* if (status=="success")
	      {
	      $("div").html("<ol></ol>");
	      $(response).find("artist").each(function(){
	        var item_text = $(this).text();
	        $('<li></li>').html(item_text).appendTo('ol');
	        });
	      //alert("There are "+$(response).find("cd").size()+" CDs")
	      } */
	    //});
}
</script>

<script type="text/javascript" src="http://ajax.microsoft.com/ajax/jquery/jquery-1.7.min.js"></script>
</div>