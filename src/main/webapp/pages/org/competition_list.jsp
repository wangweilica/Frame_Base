<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="p"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<link rel="stylesheet" href="http://cdn.code4job.com/css/toastr.min.css">
</head>  
<body>  
	<table class="table table-striped">
		<thead>
			<tr>
				<th>竞赛</th>
				<th>介绍</th>
				<th>竞赛开始时间</th>
				<th>报名截止时间</th>
				<th>操作</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${list}" var="entity">
			<tr>
				<td>${entity.name}</td>
				<td>${entity.information}</td>
				<td><fmt:formatDate value="${entity.competitionTime}"  type="both" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td><fmt:formatDate value="${entity.applyEndTime}"  type="both" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<td><button type="button" class="btn btn-default"><span class="glyphicon glyphicon-edit"></span> 修改</button>
					<button type="button" class="btn btn-default" onclick="del('${entity.id}')"><span class="glyphicon glyphicon-remove"></span>删除</button></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
  	<p:page url="list" params="orgId=1"  pageInfo="${pageInfo}"/>
  	 <!-- ---------------------------确认模态框--------------------------------- -->
	<div class="modal fade" id="confirmModal" tabindex="-1">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h3 class="modal-title"></h3>
				</div>
				<div class="modal-body"></div>
				<div class="modal-footer">
					<a href="javascript:void(0)" class="btn btn-default modal-cancel"
						data-dismiss="modal">取消</a> <a href="javascript:void(0)"
						class="btn btn-primary modal-ok">确定</a>
				</div>
			</div>
		</div>
	</div>
	<div class="modal fade" id="editModal" tabindex="-1">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h3 class="modal-title"></h3>
				</div>
				<div class="modal-body"></div>
				<div class="modal-footer">
					<a href="javascript:void(0)" class="btn btn-default modal-cancel"
						data-dismiss="modal">取消</a> <a href="javascript:void(0)"
						class="btn btn-primary modal-ok">确定</a>
				</div>
			</div>
		</div>
	</div>
	<script src="http://cdn.code4job.com/js/vendor/toastr.min.js"></script>
	<script type="text/javascript" src="resources/js/pages/common.js"></script>
	<script type="text/javascript" src="resources/js/pages/competition_list.js"></script>
</body>  
</html>  