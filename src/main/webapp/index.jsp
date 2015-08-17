<!DOCTYPE >
<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<html>
<body>
	<h2>添加竞赛</h2>
	<form action="add" method="post">
		竞赛名称: <input type="text" name="name"><br /> 
		组织ID:<input type="Number" name="orgId"><br /> 
		介绍: <textarea name="information"></textarea><br /> 
		<input type="submit">
	</form>
</body>
</html>
