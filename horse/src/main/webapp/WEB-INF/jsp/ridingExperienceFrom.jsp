<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<article>
	<div class="container mt-5" role="main">
		<h2>horse Form</h2>
		<br>
		<form name="form" id="form" role="form" method="post" action="ridingExperienceSave" style="width: 50%;">
			<table border="1" width="400px">
				<tr>
					<td>경마장이름</td>
					<td><input type="text" name="pname" value=${vo.pname }></td>
				</tr>
				<tr>
					<td>내용</td>
					<td><input type="text" name="paddr" value=${vo.paddr }></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="ptel" value=${vo.ptel }></td>
				</tr>
				<tr>
					<td>링크</td>
					<td><input type="text" name="plink" value=${vo.plink }></td>
				</tr>
				<tr>
					<td>몰라근데너야되</td>
					<td><input type="text" name="pplace" value=${vo.pplace }></td>
				</tr>
			</table>
		</form>
		<div class="mb-3">
			<button type="submit" class="btn btn-sm btn-primary">
				<a class="text-white" href="#" onclick="form.submit()">등록</a>
			</button>
			<button type="button" class="btn btn-sm btn-primary" onclick="location.href='ridingExperiencelist'">목록</button>
		</div>
	</div>
</article>
