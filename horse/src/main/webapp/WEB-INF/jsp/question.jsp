<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container mt-5">
	<div class="table-responsive m-b-40">
	<h3 class="title-5 m-b-35">문의사항</h3>
		<table class="table table-striped">
			<colgroup>
				<col style="width: 10%;" />
				<col style="width: auto;" />
				<col style="width: 10%;" />
				<col style="width: 15%;" />
				<col style="width: 10%;" />
			</colgroup>
			
			<thead class="thead-dark">
				<tr>
					<th>No</th>
					<th>제목</th>
					<th>글쓴이</th>
					<th>날짜</th>
					<th>조회</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="e" items="${list}">
					<c:url var="link" value="questionDetail"> <!-- 글읽기 컨트롤의 주소(QuestionBoardRead)와 글을 읽어오는데 필요한 글번호를 파라미터로 링크를 생성 -->
						<c:param name="qnum" value="${e.qnum }"/>
					</c:url>
					<tr>
						<td>${e.qnum }</td>
						<td><a href="${link }">${e.qtitle }</a></td>
						<td>${e.mid }</td>
						<td>${e.qdate }</td>
						<td>${e.qhit }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div align="right">
		<button type="button" class="btn btn-sm btn-primary" onclick="location='questionForm'">글쓰기</button>
	</div>
</div>
<div class="container">
	<div class="row">
		<div class="col">
			<br>
			<ul class="pagination justify-content-center">
				<li class="page-item"><a class="page-link" href="#">Previous</a></li>
				<li class="page-item"><a class="page-link" href="#">1</a></li>
				<li class="page-item"><a class="page-link" href="#">2</a></li>
				<li class="page-item"><a class="page-link" href="#">3</a></li>
				<li class="page-item"><a class="page-link" href="#">4</a></li>
				<li class="page-item"><a class="page-link" href="#">5</a></li>
				<li class="page-item"><a class="page-link" href="#">Next</a></li>
			</ul>
		</div>
	</div>
</div>