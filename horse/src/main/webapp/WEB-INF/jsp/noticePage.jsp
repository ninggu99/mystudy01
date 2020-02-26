<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%--Page 이전 페이지 구현 --%>
<c:choose>
	<c:when test="${searchType == null}">
		<c:choose>
			<c:when test="${pageInfo.currentBlock eq 1}">
				<img src="images/prev.png">
			</c:when>
			<c:otherwise>
				<a href="notice?noticePage=${(pageInfo.currentBlock-1)*pageInfo.pagesPerBlock }">
					<img src="images/prev.png">
				</a>
			</c:otherwise>
		</c:choose>

		<%--Page  페이지 구현 --%>
		<c:choose>
			<c:when test="${pageInfo.currentBlock ne pageInfo.totalBlocks}">
				<c:forEach begin="1" end="${pageInfo.pagesPerBlock}" varStatus="num">
                        [<a
						href="notice?noticePage=
                        ${(pageInfo.currentBlock - 1) * pageInfo.pagesPerBlock + num.count }">
						${(pageInfo.currentBlock- 1) * pageInfo.pagesPerBlock + num.count }</a>]
                    			</c:forEach>
			</c:when>
			<c:otherwise>
				<c:forEach
					begin="${(pageInfo.currentBlock-1)*pageInfo.pagesPerBlock + 1}"
					end="${pageInfo.totalPages}" varStatus="num">
                        [<a
						href="notice?noticePage=
										${(pageInfo.currentBlock - 1) * pageInfo.pagesPerBlock + num.count }">
						${(pageInfo.currentBlock - 1) * pageInfo.pagesPerBlock + num.count }</a>]
                    </c:forEach>
			</c:otherwise>
		</c:choose>


		<%--Page 다음 페이지 구현 --%>
		<c:choose>
			<c:when test="${pageInfo.currentBlock eq pageInfo.totalBlocks}">
				<img src="images/next.png">
			</c:when>
			<c:otherwise>
				<a
					href="notice?noticePage=
									${pageInfo.currentBlock * pageInfo.pagesPerBlock + 1 }">
					<img src="images/next.png">
				</a>
			</c:otherwise>
		</c:choose>
	</c:when>
	<c:otherwise>

		<c:choose>
			<c:when test="${pageInfo.currentBlock eq 1}">
				<img src="images/prev.png">
			</c:when>
			<c:otherwise>
				<a
					href="notice?searchType=${searchType}&searchValue=${searchValue}&noticePage=
									${(pageInfo.currentBlock-1)*pageInfo.pagesPerBlock }">
					<img src="images/prev.png">
				</a>
			</c:otherwise>
		</c:choose>

		<%--Page  페이지 구현 --%>
		<c:choose>
			<c:when test="${pageInfo.currentBlock ne pageInfo.totalBlocks}">
				<c:forEach begin="1" end="${pageInfo.pagesPerBlock}" varStatus="num">
                        [<a
						href="notice?searchType=${searchType}&searchValue=${searchValue}&noticePage=
                        ${(pageInfo.currentBlock - 1) * pageInfo.pagesPerBlock + num.count }">
						${(pageInfo.currentBlock- 1) * pageInfo.pagesPerBlock + num.count }</a>]
                    			</c:forEach>
			</c:when>
			<c:otherwise>
				<c:forEach
					begin="${(pageInfo.currentBlock-1)*pageInfo.pagesPerBlock + 1}"
					end="${pageInfo.totalPages}" varStatus="num">
                        [<a
						href="notice?searchType=${searchType}&searchValue=${searchValue}&noticePage=
										${(pageInfo.currentBlock - 1) * pageInfo.pagesPerBlock + num.count }">
						${(pageInfo.currentBlock - 1) * pageInfo.pagesPerBlock + num.count }</a>]
                    </c:forEach>
			</c:otherwise>
		</c:choose>


		<%--Page 다음 페이지 구현 --%>
		<c:choose>
			<c:when test="${pageInfo.currentBlock eq pageInfo.totalBlocks}">
				<img src="images/next.png">
			</c:when>
			<c:otherwise>
				<a
					href="notice?searchType=${searchType}&searchValue=${searchValue}&noticePage=
									${pageInfo.currentBlock * pageInfo.pagesPerBlock + 1 }">
					<img src="images/next.png">
				</a>
			</c:otherwise>
		</c:choose>
	</c:otherwise>
</c:choose>
