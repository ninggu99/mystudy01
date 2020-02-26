<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<div class="container mt-5" role="main">
		<h2>리뷰 등록하기</h2>
		<br>
		<form name="form" id="form" role="form" method="post" action="raceplaceSave" style="width: 50%;">
			<div class="mb-3" >
				<label for="title">승마장 이름</label> 
				<input type="text" class="form-control" name="pname" id="pname" placeholder="승마장 이름을 입력해 주세요">
			</div>
			<div class="mb-3" >
				<label for="title">승마장 주소</label> 
				<input type="text" class="form-control" name="paddr" id="paddr" placeholder="승마장 주소를 입력해 주세요">
			</div>
			<div class="mb-3">
				<label for="title">승마장 연락처</label>
				<input type="text" class="form-control" name="ptel" id="ptel" placeholder="승마장 연락처를 입력해 주세요">
			</div>
			<div class="mb-3" >
				<label for="title">부대시설</label> 
				<input type="text" class="form-control" name="pplace" id="pplace" placeholder="부대시설을 입력해 주세요">
			</div>
		</form>
		<div class="mb-3">
			<button type="submit" class="btn btn-sm btn-primary">
				<a class="text-white" onclick="form.submit()">저장</a>
			</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location='raceplace'">목록</button>
		</div>
	</div>
</article>