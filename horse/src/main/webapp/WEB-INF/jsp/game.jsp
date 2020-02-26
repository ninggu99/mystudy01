<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- DATA TABLE-->
<section class="p-t-20 p-3 p-md-5">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h3 class="title-5 m-b-35">게임</h3>
				<div align="right">
					<button type="button" class="btn btn-sm btn-primary" onclick="location='gameForm'">경기 정보 입력하기</button>
				</div>
				<div class="table-responsive table-responsive-data2">
					<table class="table table-data2">
						<colgroup>
							<col style="width: 10%;" />
							<col style="width: 20%;" />
							<col style="width: 30%;" />
							<col style="width: 40%;" />
						</colgroup>
						<thead>
							<tr style="text-align: center">
								<th>번호</th>
								<th>달린 거리</th>
								<th>경마 시작 시간</th>
								<th>날짜</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="e" items="${list}">
								<%-- <<c:url var="link" value="noticeDetail">
									<!-- 글읽기 컨트롤의 주소(QuestionBoardRead)와 글을 읽어오는데 필요한 글번호를 파라미터로 링크를 생성 -->
									<c:param name="gnum" value="${e.gnum }" />
								</c:url> --%>
								<tr class="tr-shadow" style="text-align: center">
									<td>${e.r_num }</td>
									<td>
										<%-- <a href="${link }"> --%>${e.gmeter }<!-- </a> -->
									</td>
									<td>${e.gtime }</td>
									<td>${e.gdate }</td>

									<td>
										<div class="table-data-feature">
											<button class="item" data-toggle="tooltip" data-placement="top" title="새글쓰기" onclick="location='gameForm'">
												<i class="zmdi zmdi-mail-send"></i>
											</button>
											<button class="item" data-toggle="tooltip" data-placement="top" title="수정하기" onclick="location='gameUpdateForm?gnum=${e.gnum}'">
												<i class="zmdi zmdi-edit"></i>
											</button>
											<button class="item" data-toggle="tooltip" data-placement="top" title="지우기" onclick="location='gameDelete?gnum=${e.gnum}'">
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
	</div>
</section>
