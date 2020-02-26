<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
	<div class="wrapper">
		<h3 class="form-signin-heading">관리자 로그인</h3>
		<hr class="colorgraph">
		<br> 
		<input type="text" class="form-control" name="mid" id="mid" placeholder="Id" /><br> 
		<input type="password" class="form-control" name="mpwd" id="mpwd" placeholder="Password" />
		<button class="btn btn-lg btn-primary btn-block" id="submit" value="Login" type="Submit">Login</button>
	</div>
</div>

<script>

	$(function() {
		$('#submit').click(
				function() {
					$.ajax({
						url : "logincheck?mid=" + $('#mid').val() + "&mpwd=" + $('#mpwd').val(),
						success : function(data) {
							if (data === 0) {
								alert("아이디 또는 비밀번호가 틀렸습니다.");
								location = "index";
							} else {
								/* alert("환영합니다."); */
								location = 'home';
							}
						}
					});
				});
	});
</script>