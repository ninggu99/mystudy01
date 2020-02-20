<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<article>
	<div class="container mt-5" role="main">
		<h2>공지 사항</h2>
		<div class="bg-white rounded shadow-sm">
			<div class="board_title">
				<c:out value="${vo.ntitle}" />
			</div>
			<div class="board_info_box">
				<span class="board_date"> <c:out value="${vo.ndate}" />
				</span>
			</div>
			<div class="board_content">${vo.ncontent}</div>
		</div>
		<div style="margin-top: 20px">
			<button type="button" class="btn btn-sm btn-primary"
				onclick="location='notice'">목록</button>
			<button type="button" class="btn btn-sm btn-primary"
				onclick="location='noticeDelete?nnum=${vo.nnum}'">삭제</button>
			<button type="button" class="btn btn-sm btn-primary"
				onclick="location='noticeUpdateForm?nnum=${vo.nnum}'">수정</button>
		</div>
	</div>
</article>

