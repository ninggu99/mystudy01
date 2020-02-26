<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<article>
	<div class="container mt-5" role="main">
		<h2>경마 수정하기</h2>
		<br>	
		<form name="form" id="form" role="form" method="post" action="runhorseUpdate" style="width: 50%;">
			<input type="hidden" name="hnum" value="${vo.hnum}">
			<div class="mb-3">
				<label for="title">말 이름을 수정해 주세요</label> 
				<input type="text" class="form-control" name="hname" id="hname" value="${vo.hname }">
			</div>
			<div class="mb-3">
				<label for="title">말 나이를 [숫자만]수정해 주세요</label>
				<input type="text" class="form-control" name="hage" id="hage" value="${vo.hage }">
			</div>
			<div class="mb-3">
				<label for="title">말 성별을 [거, 암, 수]수정해 주세요</label>
				<input type="text" class="form-control" name="hsex" id="hsex" value="${vo.hsex }">
			</div>
			<div class="mb-3">
				<label for="title">말 산지를 [제주, 한국]수정해 주세요</label>
				<input type="text" class="form-control" name="hsanji" id="hsanji" value="${vo.hsanji }">
			</div>
			<div class="mb-3">
				<label for="title">말 이미지를 [ .png ] 형식으로 수정해 주세요</label> 
				<input type="text" class="form-control" name="hpicture" id="hpicture" value="${vo.hpicture }">
			</div>
			<div class="mb-3">
				<label for="title">참가 회수를 [숫자만]수정해 주세요</label> 
				<input type="text" class="form-control" name="htotal" id="htotal" value="${vo.htotal }">
			</div>
			<div class="mb-3">
				<label for="title">우승회수를 [숫자만]수정해 주세요</label> 
				<input type="text" class="form-control" name="hwin" id="hwin" value="${vo.hwin }">
			</div>
			<div class="mb-3">
				<label for="title">말 무게를 [숫자만]수정하세요</label> 
				<input type="text" class="form-control" name="hweight" id="hweight"	value="${vo.hweight }">
			</div>
		</form>

		<div class="mb-3">
			<button type="submit" class="btn btn-sm btn-primary">
				<a class="text-white" onclick="form.submit()">저장</a>
			</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location.href='runhorse'">목록</button>
		</div>
	</div>
</article>






