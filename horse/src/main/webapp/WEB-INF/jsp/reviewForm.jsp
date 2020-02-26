<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<div class="container mt-5" role="main">
		<h2>리뷰 등록하기</h2>
		<br>
		<form name="form" id="form" role="form" method="post" action="reviewSave" style="width: 50%;">
			<div class="mb-3" >
				<label for="title">제목</label> 
				<input type="text" class="form-control" name="retitle" id="retitle"	placeholder="제목을 입력해 주세요">
			</div>
			<div class="mb-3">
				<label for="content">내용</label>
				<textarea class="form-control" rows="5" name="recontent" id="recontent" placeholder="내용을 입력해 주세요"></textarea>
			</div>
		</form>
		<div class="mb-3">
			<button type="submit" class="btn btn-sm btn-primary">
				<a class="text-white" onclick="form.submit()">저장</a>
			</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location='review?reviewPage=1'">목록</button>
		</div>
	</div>
</article>