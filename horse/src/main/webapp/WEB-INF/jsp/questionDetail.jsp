<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<article>
	<div class="container mt-5" role="main">
		<h2>문의 사항</h2>
		<div class="bg-white rounded shadow-sm">
			<div class="board_title">
				<c:out value="${vo.qtitle}" />
			</div>
			<div class="board_info_box">
				<span class="board_date"> <c:out value="${vo.qdate}" />
				</span>
			</div>
			<div class="board_content">${vo.qcontent}</div>
		</div>
		<div >
			<button type="button" class="btn btn-sm btn-primary" onclick="location='question'">목록</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location='questionDelete?qnum=${vo.qnum}'">삭제</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location='questionUpdateForm?qnum=${vo.qnum}'">수정</button>
		</div>
	</div>
</article>

<!-- Reply Form {s} -->
<div class=container>
	<div class="my-3 p-3 bg-white rounded shadow-sm" style="padding-top: 10px">
		<form:form name="form" id="form" role="form" modelAttribute="ReplyBoardVO" method="post">
			<form:hidden path="qnum" id="qnum" />
			<div class="row">
				<div class="col-sm-10">
					<form:textarea path="ocontent" id="ocontent" class="form-control" rows="3" placeholder="댓글을 입력해 주세요"></form:textarea>
				</div>
				<div class="col-sm-2">
					<form:input path="ooid" class="form-control" id="ooid" placeholder="댓글 작성자"></form:input>
					<button type="button" class="btn btn-sm btn-primary" id="btnReplySave" style="width: 100%; margin-top: 10px">저장</button>
				</div>
			</div>
		</form:form>
	</div>
	<!-- Reply Form {e} -->
	<!-- Reply List {s}-->
	<div class="my-3 p-3 bg-white rounded shadow-sm"
		style="padding-top: 10px">
		<h6 class="border-bottom pb-2 mb-0">Reply list</h6>
		<div id="replyList"></div>
	</div>
	<!-- Reply List {e}-->
</div>

<script>
	function showReplyList(){
		var url = "reply/replyList";
		var paramData = {"qnum" : "${vo.qnum}"};
		$.ajax({
            type: 'POST',
            url: url,
            data: paramData,
            dataType: 'json',
            success: function(result) {
               	var htmls = "";
			if(result.length < 0){
				htmls.push("등록된 댓글이 없습니다.");
			} else {
	                    $(result).each(function(){
	                     htmls += '<div class="media text-muted pt-3" id="onum' + this.onum + '">';
	                     htmls += '<svg class="bd-placeholder-img mr-2 rounded" width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder:32x32">';
	                     htmls += '<title>Placeholder</title>';
	                     htmls += '<rect width="100%" height="100%" fill="#007bff"></rect>';
	                     htmls += '<text x="50%" fill="#007bff" dy=".3em">32x32</text>';
	                     htmls += '</svg>';
	                     htmls += '<p class="media-body pb-3 mb-0 small lh-125 border-bottom horder-gray">';
	                     htmls += '<span class="d-block">';
	                     htmls += '<strong class="text-gray-dark">' + this.ooid + '</strong>';
	                     htmls += '<span style="padding-left: 7px; font-size: 9pt">';
	                     htmls += '<a href="javascript:void(0)" onclick="editReply(' + this.onum + ', \'' + this.ooid + '\', \'' + this.ocontent + '\' )" style="padding-right:5px">수정</a>';
	                     htmls += '<a href="javascript:void(0)" onclick="deleteReply(' + this.onum + ')" >삭제</a>';
	                     htmls += '</span>';
	                     htmls += '</span>';
	                     htmls += this.ocontent;
	                     htmls += '</p>';
	                     htmls += '</div>';
	                });	//each end
			}
			$("#replyList").html(htmls);
            }	   // Ajax success end
		});	// Ajax end
	}
</script>
<script>
// 댓글 저장 버튼 클릭 이벤트
$(document).on('click', '#btnReplySave', function(){
	var replyContent = $('#ocontent').val();
	var replyReg_id = $('#ooid').val();
	var paramData = JSON.stringify({"ocontent": replyContent, "ooid": replyReg_id, "qnum":'${vo.qnum}'});
	var headers = {"Content-Type" : "application/json", "X-HTTP-Method-Override" : "POST"};
	$.ajax({
		url: "${pageContext.request.contextPath}/reply/saveReply"
		, headers : headers
		, data : paramData
		, type : 'POST'
		, dataType : 'text'
		, success: function(result){
			showReplyList();
			$('#ocontent').val('');
			$('#ooid').val('');
		}
		, error:function(error){
			console.log("에러 :" + error);
		}
	});
});
</script>
<script>
	
	function editReply(onum, ooid, ocontent){
		var htmls = "";
			htmls += '<div class="media text-muted pt-3" id="onum' + onum + '">';
			htmls += '<svg class="bd-placeholder-img mr-2 rounded" width="32" height="32" xmlns="http://www.w3.org/2000/svg" preserveAspectRatio="xMidYMid slice" focusable="false" role="img" aria-label="Placeholder:32x32">';
			htmls += '<title>Placeholder</title>';
			htmls += '<rect width="100%" height="100%" fill="#007bff"></rect>';
			htmls += '<text x="50%" fill="#007bff" dy=".3em">32x32</text>';
			htmls += '</svg>';
			htmls += '<p class="media-body pb-3 mb-0 small lh-125 border-bottom horder-gray">';
			htmls += '<span class="d-block">';
			htmls += '<strong class="text-gray-dark">' + ooid + '</strong>';
			htmls += '<span style="padding-left: 7px; font-size: 9pt">';
			htmls += '<a href="javascript:void(0)" onclick="updateReply(' + onum + ', \'' + ooid + '\')" style="padding-right:5px">저장</a>';
			htmls += '<a href="javascript:void(0)" onClick="showReplyList()">취소<a>';
			htmls += '</span>';
			htmls += '</span>';		
			htmls += '<textarea name="editContent" id="editContent" class="form-control" rows="3">';
			htmls += ocontent;
			htmls += '</textarea>';
			htmls += '</p>';
			htmls += '</div>';
			$('#onum' + onum).replaceWith(htmls);
			$('#onum' + onum + '#editContent').focus();
	}
</script>
<script>
	// 댓글 수정
	function updateReply(onum, ooid){
		var replyEditContent = $('#editContent').val();
		var paramData = JSON.stringify({ "onum": onum,"ocontent": replyEditContent});
		var headers = {"Content-Type" : "application/json", "X-HTTP-Method-Override" : "POST"};
		console.log(paramData);
		$.ajax({
			url: "${pageContext.request.contextPath}/reply/updateReply"
			, headers : headers
			, data : paramData
			, type : 'POST'
			, dataType : 'text'
			, success: function(result){
				console.log(result);
				showReplyList();
			}
			, error: function(error){
				console.log("에러 : " + error);
			}
		});
	}
</script>
<script>
	// 댓글 삭제
	function deleteReply(onum){
		var paramData = {"onum": onum};
		$.ajax({
			url: "${pageContext.request.contextPath}/reply/deleteReply"
			, data : paramData
			, type : 'POST'
			, dataType : 'text'
			, success: function(result){
				showReplyList();
			}
			, error: function(error){
				console.log("에러 : " + error);
			}
		});
	}
</script>
<script>
$(function(){
	showReplyList();
});
</script>
