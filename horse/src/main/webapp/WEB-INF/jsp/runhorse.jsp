<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- DATA TABLE-->
<section class="p-t-20 p-3 p-md-5">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h3 class="title-5 m-b-35">경마</h3>
				<div align="right">
					<button type="button" class="btn btn-sm btn-primary" onclick="location='runhorseForm'">경마 정보 입력하기</button>
					<button type="button" class="btn btn-sm btn-primary" onclick="location='chart'">경마 승률 차트 보기</button>
					<button type="button" class="btn btn-sm btn-primary" onclick="location='chartview'">우승마 상세보기</button>
				</div>
				<div class="table-responsive table-responsive-data2">
					<table class="table table-data2">
						<colgroup>
							<col style="width: 5%;" />
							<col style="width: 10%;" />
							<col style="width: 10%;" />
							<col style="width: 10%;" />
							<col style="width: 10%;" />
							<col style="width: 10%;" />
							<col style="width: 10%;" />
							<col style="width: 10%;" />
						</colgroup>
						<thead>
							<tr style="text-align: center">
								<th>번호</th>
								<th>말 이름</th>
								<th>말 나이</th>
								<th>성별</th>
								<th>말 산지</th>
								<th>말 사진</th>
								<th>참가횟수</th>
								<th>우승횟수</th>
								<th>말 무게</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="e" items="${list}">
								<%-- <<c:url var="link" value="noticeDetail">
									<!-- 글읽기 컨트롤의 주소(QuestionBoardRead)와 글을 읽어오는데 필요한 글번호를 파라미터로 링크를 생성 -->
									<c:param name="renum" value="${e.renum }" />
								</c:url> --%>
								<tr class="tr-shadow" style="text-align: center">
									<td>${e.r_num }</td>
									<td>${e.hname }</td>
									<td>
										<%-- <a href="${link }"> --%>${e.hage }<!-- </a> -->
									</td>
									<td>${e.hsex }</td>
									<td>${e.hsanji }</td>
									<td>${e.hpicture }</td>
									<td>${e.htotal }</td>
									<td>${e.hwin }</td>
									<td>${e.hweight }</td>

									<td>
										<div class="table-data-feature">
											<button class="item" data-toggle="tooltip" data-placement="top" title="새글쓰기" onclick="location='runhorseForm'">
												<i class="zmdi zmdi-mail-send"></i>
											</button>
											<button class="item" data-toggle="tooltip" data-placement="top" title="수정하기" onclick="location='runhorseUpdateForm?hnum=${e.hnum}'">
												<i class="zmdi zmdi-edit"></i>
											</button>
											<button class="item" data-toggle="tooltip" data-placement="top" title="지우기" onclick="location='runhorseDelete?hnum=${e.hnum}'">
												<i class="zmdi zmdi-delete"></i>
											</button>
										</div>
									</td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="mt-3" align="center">
			<%@include file="runhorsePage.jsp"%>
		</div>
	</div>
</section>
