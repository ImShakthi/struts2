<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello World!</title>
</head>
<body>
	<h1>
		<s:property value="messageStore.message" />
	</h1>

	Name :
	<s:property value="#request.name" default="Not Set" />
	<br> Message :
	<s:property value="message" default="Not Set" />
	<br>
</body>
</html>