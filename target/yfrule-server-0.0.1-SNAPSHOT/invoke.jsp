<%@page import="java.io.File"%>
<%@page import="com.yf.rule.entity.Customer"%>
<%@page import="com.yf.rule.utils.ObjectUtil"%>
<%@page import="com.yf.rule.test.InvokeTest"%>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>test</title>
 <script type="text/javascript" src="/urule/res/urule-asserts/venderjs/jquery.min.js"></script>
 <script type="text/javascript" src="/urule/res/urule-asserts/venderjs/bootstrap.min.js"></script>
 <script type="text/javascript" src="/urule/res/urule-asserts/venderjs/bootbox.min.js"></script>
 <script type="text/javascript" src="/urule/res/urule-asserts/venderjs/bootstrapValidator.min.js"></script>
</head>
<body>
</head>
<body>
<form id="form">
	<p>
		<input type="button" id="btnFlow" value="测试-决策流">
		
		<input type="button" id="btnRule" value="测试-规则">
	</p>
	<div id="result" style="border:2px solid green;padding:2px 2px"></div>
</form>
<script type="text/javascript">
	$(function(){
		$("#btnRule").click(function(){
			var url = "/InvokeServlet";
			$.post({
				url,
				type : "POST",
				data : "type=rule",
				error : function(req, error) {
					alert("加载失败!");
				},
				success : function(data) {
					$("#result").html(data);
				}
			});
		});
		$("#btnFlow").click(function(){
			var url = "/InvokeServlet";
			$.post({
				url,
				type : "POST",
				data : "type=flow",
				error : function(req, error) {
					alert("加载失败!");
				},
				success : function(data) {
					$("#result").html(data);
				}
			});
		});
	});
</script>
</body>
</html>