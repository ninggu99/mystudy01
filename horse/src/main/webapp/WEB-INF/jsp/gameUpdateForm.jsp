<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<article>
	<div class="container mt-5" role="main">
		<h2>승마장 수정하기 </h2>
		<br>
		<form name="form" id="form" role="form" method="post" action="gameUpdate" style="width: 50%;">
			<input type="hidden" name="gnum" value="${vo.gnum}">
			<div class="mb-3" >
				<label for="title">달린거리</label> 
				<input type="text" class="form-control" name="gmeter" id="gmeter" value="${vo.gmeter }">
			</div>
			<div class="mb-3">
				<label for="title">달린 출발 시간</label> 
				<input type="text" class="form-control" name="gtime" id="gtime" value="${vo.gtime }">
			</div>
		</form>
		<div class="mb-3">
			<button type="submit" class="btn btn-sm btn-primary">
				<a class="text-white" onclick="form.submit()"> 수정하기</a>
			</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location.href='raceplace'">목록</button>
		</div>
	</div>
</article>






