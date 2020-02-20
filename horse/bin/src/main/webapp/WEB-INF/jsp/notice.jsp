<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- DATA TABLE-->
<section class="p-t-20 p-3 p-md-5">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<h3 class="title-5 m-b-35">공지사항</h3>
				<div class="table-data__tool">
					<div class="table-data__tool-left">
						<div class="rs-select2--light rs-select2--md">
							<select class="js-select2" name="property">
								<option selected="selected">All Properties</option>
								<option value="">Option 1</option>
								<option value="">Option 2</option>
							</select>
							<div class="dropDownSelect2"></div>
						</div>
						<div class="rs-select2--light rs-select2--sm">
							<select class="js-select2" name="time">
								<option selected="selected">Today</option>
								<option value="">3 Days</option>
								<option value="">1 Week</option>
							</select>
							<div class="dropDownSelect2"></div>
						</div>
						<button class="au-btn-filter">
							<i class="zmdi zmdi-filter-list"></i>filters
						</button>
					</div>
					<div class="table-data__tool-right">
						<button class="au-btn au-btn-icon au-btn--green au-btn--small">
							<i class="zmdi zmdi-plus"></i>add item
						</button>
						<div class="rs-select2--dark rs-select2--sm rs-select2--dark2">
							<select class="js-select2" name="type">
								<option selected="selected">Export</option>
								<option value="">Option 1</option>
								<option value="">Option 2</option>
							</select>
							<div class="dropDownSelect2"></div>
						</div>
					</div>
				</div>
				<div class="table-responsive table-responsive-data2">
					<table class="table table-data2">
						<colgroup>
							<col style="width: 10%;" />
							<col style="width: auto;" />
							<col style="width: 15%;" />
							<col style="width: 10%;" />
							<col style="width: 30%;" />
						</colgroup>
						<thead>
							<tr>
								<th>No</th>
								<th>제목</th>
								<th>날짜</th>
								<th>조회</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="e" items="${list}">
								<c:url var="link" value="noticeDetail">
									<!-- 글읽기 컨트롤의 주소(QuestionBoardRead)와 글을 읽어오는데 필요한 글번호를 파라미터로 링크를 생성 -->
									<c:param name="nnum" value="${e.nnum }" />
								</c:url>
								<tr class="tr-shadow">
									<td>${e.nnum }</td>
									<td><a href="${link }">${e.ntitle }</a></td>
									<td>${e.ndate }</td>
									<td>${e.nhit }</td>
									<td>
										<div class="table-data-feature">
											<button class="item" data-toggle="tooltip"
												data-placement="top" title="Write" onclick="location='noticeForm'">
												<i class="zmdi zmdi-mail-send"></i>
											</button>
											<button class="item" data-toggle="tooltip"
												data-placement="top" title="Edit" onclick="location='noticeUpdateForm?nnum=${vo.nnum}'">
												<i class="zmdi zmdi-edit"></i>
											</button>
											<button class="item" data-toggle="tooltip"
												data-placement="top" title="Delete" onclick="location='noticeDelet?nnum=${vo.nnum}'">
												<i class="zmdi zmdi-delete"></i>
											</button>
											<button class="item" data-toggle="tooltip"
												data-placement="top" title="More">
												<i class="zmdi zmdi-more"></i>
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
<!-- END DATA TABLE-->
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