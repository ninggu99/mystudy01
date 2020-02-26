<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<div class="container mt-5" role="main">
		<h2>리뷰 등록하기</h2>
		<br>
		<form name="form" id="form" role="form" method="post" action="gameSave" style="width: 50%;">
			<div class="mb-3" >
				<label for="title">달린 거리</label> 
				<input type="text" class="form-control" name="gmeter" id="gmeter" placeholder="달린 거리를 [숫자만] 입력해 주세요">
			</div>
			<div class="mb-3">
				<label for="title">달린 거리</label> 
				<input type="text" class="form-control" name="gtime" id="gtime" placeholder="달린 출발시간을 [ 시  : 분] 형식으로 입력해 주세요">
			</div>
		</form>
		<div class="mb-3">
			<button type="submit" class="btn btn-sm btn-primary">
				<a class="text-white" onclick="form.submit()">저장</a>
			</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location='game'">목록</button>
		</div>
	</div>
</article>