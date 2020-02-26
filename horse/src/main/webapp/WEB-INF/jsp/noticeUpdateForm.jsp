<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

	<div class="container mt-5" role="main">
		<h2>공지사항 수정하기</h2>
		<br>
		<form name="form" id="form" role="form" method="post" action="noticeUpdate" style="width: 50%;">
					<input type="hidden" name="nnum" value="${vo.nnum}">
			<div class="mb-3">
				<label for="title">제목</label> 
				<input type="text" class="form-control" name="ntitle" id="ntitle" value="${vo.ntitle }">
			</div>
			<div class="mb-3">
				<label for="content">내용</label>
				<textarea class="form-control" rows="5" name="ncontent"	id="ncontent">${vo.ncontent }</textarea>
			</div>
		</form>

		<div class="mb-3">
			<button type="submit" class="btn btn-sm btn-primary">
				<a class="text-white" href="#" onclick="form.submit()">저장</a>
			</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location.href='notice?noticePage=1'">목록</button>
		</div>
	</div>











