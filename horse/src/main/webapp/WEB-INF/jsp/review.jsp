<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- DATA TABLE-->
<section class="p-t-20 p-3 p-md-5">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h3 class="title-5 m-b-35">리뷰</h3>
				<div class="table-responsive table-responsive-data2">
					<table class="table table-data2">
						<colgroup>
							<col style="width: 10%;" />
							<col style="width: 25%;" />
							<col style="width: 35%;" />
							<col style="width: 20%;" />
							<col style="width: 10%;" />
						</colgroup>
						<thead>
							<tr style="text-align: center">
								<th>No</th>
								<th>제목</th>
								<th>내용</th>
								<th>날짜</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach var="e" items="${rlist}">
								<%-- <<c:url var="link" value="noticeDetail">
									<!-- 글읽기 컨트롤의 주소(QuestionBoardRead)와 글을 읽어오는데 필요한 글번호를 파라미터로 링크를 생성 -->
									<c:param name="renum" value="${e.renum }" />
								</c:url> --%>
								<tr class="tr-shadow" style="text-align: center">
									<td>${e.r_num }</td>
									<td>
										<%-- <a href="${link }"> --%>${e.retitle }<!-- </a> -->
									</td>
									<td>${e.recontent }</td>
									<td>${e.redate }</td>

									<td>
										<div class="table-data-feature">
											<button class="item" data-toggle="tooltip"
												data-placement="top" title="새글쓰기"
												onclick="location='reviewForm'">
												<i class="zmdi zmdi-mail-send"></i>
											</button>
											<button class="item" data-toggle="tooltip"
												data-placement="top" title="수정하기"
												onclick="location='reviewUpdateForm?renum=${e.renum}'">
												<i class="zmdi zmdi-edit"></i>
											</button>
											<button class="item" data-toggle="tooltip"
												data-placement="top" title="지우기"
												onclick="location='reviewDelete?renum=${e.renum}'">
												<i class="zmdi zmdi-delete"></i>
											</button>
										</div>
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<div align="right">
					<button type="button" class="btn btn-sm btn-primary"
						onclick="location='reviewForm'">글쓰기</button>
				</div>

			</div>
		</div>
	</div>
</section>
