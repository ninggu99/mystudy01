<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container mt-5">
	<div class="table-responsive m-b-40">
	<h3 class="title-5 m-b-35">경마장추천리스트</h3>
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
					<th>승마장 번호</th>
					<th>승마장 이름</th>
					<th>승마장 주소</th>
					<th>승마장 연락처</th>
					<th>승마장 링크</th>
					<th>부대시설</th>
					<th>등록일자</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="e" items="${list}">
					<c:url var="link" value="ridingExperienceDetail"> <!-- 글읽기 컨트롤의 주소(QuestionBoardRead)와 글을 읽어오는데 필요한 글번호를 파라미터로 링크를 생성 -->
						<c:param name="pnum" value="${e.pnum }"/>
					</c:url>
					<tr>
						<td>${e.pnum }</td>
						<td><a href="${link }">${e.pname }</a></td>
						<td>${e.paddr }</td>
						<td>${e.ptel }</td>
						<td>${e.plink }</td>
						<td>${e.pplace}</td>
						<td>${e.pdate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div align="right">
		<button type="button" class="btn btn-sm btn-primary" onclick="location='ridingExperienceFrom'">경마추천장 입력하기</button>
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