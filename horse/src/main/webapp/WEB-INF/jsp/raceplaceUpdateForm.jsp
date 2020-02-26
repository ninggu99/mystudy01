<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<article>
	<div class="container mt-5" role="main">
		<h2>승마장 수정하기</h2>
		<br>
		<form name="form" id="form" role="form" method="post" action="raceplaceUpdate" style="width: 50%;">
			<input type="hidden" name="pnum" value="${vo.pnum}">
			<div class="mb-3">
				<label for="title">승마장 이름</label> 
				<input type="text" class="form-control" name="pname" id="pname" value="${vo.pname }">
			</div>
			<div class="mb-3">
				<label for="title">승마장 주소</label> 
				<input type="text" class="form-control" name="paddr" id="paddr" value="${vo.paddr }">
			</div>
			<div class="mb-3">
				<label for="title">승마장 연락처</label> 
				<input type="text" class="form-control" name="ptel" id="ptel" value="${vo.ptel }">
			</div>
			<div class="mb-3">
				<label for="title">부대시설</label> 
				<input type="text" class="form-control" name="pplace" id="pplace" value="${vo.pplace }">
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






