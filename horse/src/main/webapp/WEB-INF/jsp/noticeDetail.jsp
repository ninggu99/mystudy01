<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<article>
	<div class="container mt-5" role="main">
		<table class="board_view">
		<h2>공지사항</h2>
		<br>
			<colgroup>
				<col width="15%">
				<col width="35%">
				<col width="15%">
				<col width="*">
			</colgroup>

			<tbody>
				<tr>
					<th>제목</th>
					<td>${vo.ntitle}</td>
					<th>조회수</th>
					<td>${vo.nhit }</td>
				</tr>
				<tr>
					<th>작성시간</th>
					<td>${vo.ndate }</td>
				</tr>
				<tr class="board_content">
					<th>내용</th>
					<td colspan="3">${vo.ncontent }</td>
				</tr>
			</tbody>
		</table>
		<div class="mb-3 mt-3" align="center">
			<button type="button" class="btn btn-sm btn-primary" onclick="location='notice?noticePage=1'">목록</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location='noticeDelete?nnum=${vo.nnum}'">삭제</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location='noticeUpdateForm?nnum=${vo.nnum}'">수정</button>
		</div>
	</div>
</article>

