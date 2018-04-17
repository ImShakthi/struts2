<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Basic Struts 2 - Welcome</title>
<%-- <script src="staticresources/lib/jquery.3.2.1.js" rel="text/javascript"></script> --%>
	<script src="staticresources/lib/prototype.js"	rel="text/javascript"></script>
	<script src="staticresources/scripts/BaseHandlerUtil.js"	rel="text/javascript"></script>

   <link rel="stylesheet" type="text/css" href="staticresources/stylesheets/base.css">
</head>
<body>
	<h1>Welcome To Struts 2!</h1>
	<p>
		<a href="<s:url action='hello'/>">Hello World</a>
	</p>
	<div>
		<input type="button" onclick="BaseHandlerUtil.onClick()" value="Click me" id="clicker1"/>
	</div>
</body>
</html>