<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<div class="container mt-5" role="main">
		<h2>리뷰 등록하기</h2>
		<br>
		<form name="form" id="form" role="form" method="post" action="runhorseSave" style="width: 50%;">
			<div class="mb-3">
				<label for="title">말 이름</label> 
				<input type="text" class="form-control" name="hname" id="hname" placeholder="말 이름을 입력해 주세요">
			</div>
			<div class="mb-3">
				<label for="title">말 나이</label> 
				<input type="text" class="form-control" name="hage" id="hage" placeholder="말 나이를 [숫자만]입력해 주세요">
			</div>
			<div class="mb-3">
				<label for="title">말 성별</label> 
				<input type="text" class="form-control" name="hsex" id="hsex" placeholder="말 성별을 [거, 암, 수]입력해 주세요">
			</div>
			<div class="mb-3">
				<label for="title">말 산지</label> 
				<input type="text" class="form-control" name="hsanji" id="hsanji" placeholder="말 산지를 [제주, 한국]입력해 주세요">
			</div>
			<div class="mb-3">
				<label for="title">말 사진</label> 
				<input type="text" class="form-control" name="hpicture" id="hpicture" placeholder="말 이미지를 [ .png ] 형식으로 입력해 주세요">
			</div>
			<div class="mb-3">
				<label for="title">참가 횟수</label> 
				<input type="text" class="form-control" name="htotal" id="htotal" placeholder="참가 회수를 [숫자만]입력해 주세요">
			</div>
			<div class="mb-3">
				<label for="title">우승횟수</label> 
				<input type="text" class="form-control" name="hwin" id="hwin" placeholder="우승회수를 [숫자만]입력해 주세요">
			</div>
			<div class="mb-3">
				<label for="title">말 무게</label> 
				<input type="text" class="form-control" name="hweight" id="hweight"	placeholder="말 무게를 [숫자만]입력하세요">
			</div>
			<!-- <div class="mb-3" style="width: 50%;">
				<label for="content">내용</label>
				<textarea class="form-control" rows="5" name="hwin" id="hwin"
					placeholder="우승횟수를 입력하세요."></textarea>
			</div> -->
		</form>
		<div class="mb-3">
			<button type="submit" class="btn btn-sm btn-primary">
				<a class="text-white" onclick="form.submit()">저장</a>
			</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location='runhorse?runhorsePage=1'">목록</button>
		</div>
	</div>
</article>