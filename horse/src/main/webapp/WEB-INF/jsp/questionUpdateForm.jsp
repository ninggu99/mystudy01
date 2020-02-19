<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<article>
	<div class="container" role="main">
		<h2>board Form</h2>
		<form name="form" id="form" role="form" method="post" action="questionUpdate">
			<input type="hidden" name="qnum" value="${vo.qnum}">
			<div class="mb-3">
				<label for="title">제목</label> 
				<input type="text" class="form-control" name="qtitle" id="qtitle" value="${vo.qtitle }">
			</div>
			<div class="mb-3">
				<label for="content">내용</label>
				<textarea class="form-control" rows="5" name="qcontent" id="qcontent">${vo.qcontent }</textarea>
		</div>
		</form>
		
		<div>
			<button type="submit" class="btn btn-sm btn-primary"><a class="text-white" href="#" onclick="form.submit()">저장</a></button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location.href='question'">목록</button>
		</div>
	</div>
</article>











