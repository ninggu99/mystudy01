<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <article>
	<div class="container" role="main">
		<h2>board Form</h2>
		<form name="form" id="form" role="form" method="post" action="noticeSave">
			<div class="mb-3">
				<label for="title">제목</label>
				<input type="text" class="form-control" name="ntitle" id="title" placeholder="제목을 입력해 주세요">
			</div>
			<div class="mb-3">
				<label for="content">내용</label>
				<textarea class="form-control" rows="5" name="ncontent" id="content" placeholder="내용을 입력해 주세요"></textarea>
			</div>
		</form>
		<div>
			<button type="submit" class="btn btn-sm btn-primary"><a class="text-white" href="#" onclick="form.submit()">저장</a></button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location='notice'">목록</button>
		</div>
	</div>
</article>