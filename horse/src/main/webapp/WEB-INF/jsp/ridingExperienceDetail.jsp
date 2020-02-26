<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<article>
	<div class="container mt-5" role="main">
		<h2>승마 추천장</h2>
		<br>
		<div class="bg-white rounded shadow-sm">
			<div class="board_title">
				<c:out value="${vo.pname}" />
			</div>
			<div class="board_info_box">
				<span class="board_date"> <c:out value="${vo.pdate}" />
				</span>
			</div>
			<div class="board_content">${vo.paddr}</div>
		</div>
		<div >
			<button type="button" class="btn btn-sm btn-primary" onclick="location='ridingExperience'">목록</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location='ridingExperienceDlete?pnum=${vo.pnum}'">삭제</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location='ridingExperienceUpdateForm?pnum=${vo.pnum}'">수정</button>
		</div>
	</div>
</article>
