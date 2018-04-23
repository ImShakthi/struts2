<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Basic Struts 2 - Welcome</title>
<script src="staticresources/lib/jquery.3.2.1.js" rel="text/javascript"></script>
<script src="staticresources/scripts/BaseHandlerUtil.js"
	rel="text/javascript"></script>

<link rel="stylesheet" type="text/css"
	href="staticresources/stylesheets/base.css">
<link rel="stylesheet" type="text/css"
	href="staticresources/stylesheets/formstyle.css">
</head>
<body>
	<h1>Welcome To Notes!</h1>
	<div>
		<h3>Sign Up Here!</h3>
		<div id="formDiv" class="center">

			<s:form id="formsakthi">
				<fieldset>
					<legend>
						<span class="number">1</span>Your basic info
					</legend>
					<div>
						<s:textfield key="signup.firstName" name="firstName"
							label="First Name"></s:textfield>
					</div>
					<div>
						<s:textfield key="signup.lastName" name="lastName"
							label="Last Name"></s:textfield>
					</div>
					<div>
						<s:textfield key="signup.email" name="email" label="eMail address"></s:textfield>
					</div>
					<div>
						<s:password key="signup.password" name="password"
							label="New password"></s:password>
					</div>
				</fieldset>
				<fieldset>
					<div>
						<s:checkbox key="signup.receiveUpdates" name="receiveUpdates"
							fieldValue="true" label="Check to receive updates."></s:checkbox>
					</div>
					<div>
						<s:textarea key="signup.bio" name="bio" label="About You"
							cols="20" rows="3" wrap="true"></s:textarea>
					</div>
				</fieldset>
				<s:submit class="button" type="button" name="Sign Up"
					value="Sign Up" onclick="BaseHandlerUtil.signUpUser()"></s:submit>
			</s:form>
		</div>

		<div>
			<input class="button" type="button"
				onclick="BaseHandlerUtil.onClick()" value="Ping the server!!!"
				id="clicker1" /> <br>Name : <span id="name">Not Set </span>
			;&nbsp; Message :<span id="message">Not Set </span> <br>
		</div>
	</div>

</body>
</html>