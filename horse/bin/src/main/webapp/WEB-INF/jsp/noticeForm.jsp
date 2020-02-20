<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <article>
	<div class="container" role="main">
		<h2>board Form</h2>
		<form name="form" id="form" role="form" method="post" action="noticeSave">
			<div class="mb-3">
				<label for="title">����</label>
				<input type="text" class="form-control" name="ntitle" id="title" placeholder="������ �Է��� �ּ���">
			</div>
			<div class="mb-3">
				<label for="content">����</label>
				<textarea class="form-control" rows="5" name="ncontent" id="content" placeholder="������ �Է��� �ּ���"></textarea>
			</div>
		</form>
		<div>
			<button type="submit" class="btn btn-sm btn-primary"><a class="text-white" href="#" onclick="form.submit()">����</a></button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location='notice'">���</button>
		</div>
	</div>
</article>