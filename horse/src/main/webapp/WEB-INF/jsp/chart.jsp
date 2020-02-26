<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<div class="col-md-6" style="text-align: center">
		<h2 class="title text-left">2020년 1회차 ~ 9회차 우승마 승률표</h2>
		<input type="hidden" id="count1" value="${vo.count1 }"> <input
			type="hidden" id="count2" value="${vo.count2 }"> <input
			type="hidden" id="count3" value="${vo.count3 }"> <input
			type="hidden" id="count4" value="${vo.count4 }"> <input
			type="hidden" id="count5" value="${vo.count5 }"> <input
			type="hidden" id="count6" value="${vo.count6 }"> <input
			type="hidden" id="count7" value="${vo.count7 }"> <input
			type="hidden" id="count8" value="${vo.count8 }"> <input
			type="hidden" id="count9" value="${vo.count9 }">
		<canvas id="myChart" width="200" height="200">
				</canvas>
	</div>
	<div class="col-md-6">
		<br>
		<hr>
		<h3 class="title" style="text-align: left;">경주마 응원 순위</h3>
		<c:forEach var="e" items="${list}" varStatus="num">
			<input type="hidden" id="chartRankingName${num.count}"
				value="${e.hname}">
			<input type="hidden" id="chartRanking${num.count}" value="${e.cnt}">
		</c:forEach>
		<canvas id="myChart1" width="400" height="400">
				</canvas>
	</div>
</div>

<script src="https://ajax.googleapis.com/ajax/libs/jquery-3.4.1.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.js"></script>
<script type="text/javascript">
	var ctx = document.getElementById("myChart");
	var count1 = $('#count1').val();
	var count2 = $('#count2').val();
	var count3 = $('#count3').val();
	var count4 = $('#count4').val();
	var count5 = $('#count5').val();
	var count6 = $('#count6').val();
	var count7 = $('#count7').val();
	var count8 = $('#count8').val();
	var count9 = $('#count9').val();

	var myChart = new Chart(ctx, {

		type : "bar",
		data : {
			labels : [ '1회 하늘사랑', '2회 폴리스', '3회 청마에이스', '4회 미소드림', '5회 강남의빛',
					'6회 중랑장', '7회 서문자랑', '8회 갈색여걸', '9회 늘푸른빛' ],
			datasets : [ {
				label : "승률",
				data : [ count1, count2, count3, count4, count5, count6,
						count7, count8, count9 ],
				backgroundColor : [ "rgba(255, 99, 132, 0.2)",
						"rgba(54, 162, 235, 0.2)", "rgba(255, 206, 86, 0.2)",
						"rgba(75, 192, 192, 0.2)", "rgba(153, 102, 255, 0.2)",
						"rgba(255, 159, 64, 0.2)", "rgba(100, 205, 0, 0.2)",
						"rgba(241, 188, 0, 0.2)", "rgba(241, 91, 0, 0.2)" ],
				borderColor : [ "rgba(255, 99, 132, 1)",
						"rgba(54, 162, 235, 1)", "rgba(255, 206, 86, 1)",
						"rgba(75, 192, 192, 1)", "rgba(153, 102, 255, 1)",
						"rgba(255, 159, 64, 1)", "rgba(100, 205, 0, 1)",
						"rgba(241, 188, 0, 1)", "rgba(241, 91, 0, 1)" ],
				borderWidth : 1
			} ]
		},
		options : {
			scales : {
				yAxes : [ {
					ticks : {
						beginAtZero : true
					}
				} ]
			}
		}
	});
</script>
<script type="text/javascript">
	var ctx = document.getElementById("myChart1");

	var count1 = $('#chartRanking1').val();
	var count2 = $('#chartRanking2').val();
	var count3 = $('#chartRanking3').val();
	var count4 = $('#chartRanking4').val();
	var count5 = $('#chartRanking5').val();
	var count6 = $('#chartRanking6').val();
	var count7 = $('#chartRanking7').val();
	var count8 = $('#chartRanking8').val();

	var today1 = $('#chartRankingName1').val();
	var today2 = $('#chartRankingName2').val();
	var today3 = $('#chartRankingName3').val();
	var today4 = $('#chartRankingName4').val();
	var today5 = $('#chartRankingName5').val();
	var today6 = $('#chartRankingName6').val();
	var today7 = $('#chartRankingName7').val();
	var today8 = $('#chartRankingName8').val();

	var myChart = new Chart(ctx, {
		type : "bar",
		data : {
			labels : [ today1, today2, today3, today4, today5, today6, today7,
					today8 ],
			datasets : [ {
				label : "경주마 응원 순위 ",
				data : [ count1, count2, count3, count4, count5, count6,
						count7, count8 ],
				backgroundColor : [ "rgba(241, 91, 226, 0.2)",
						"rgba(255, 99, 132, 0.2)", "rgba(54, 162, 235, 0.2)",
						"rgba(153, 102, 255, 0.2)", "rgba(255, 159, 64, 0.2)",
						"rgba(100, 205, 0, 0.2)", "rgba(241, 188, 0, 0.2)",
						"rgba(241, 91, 0, 0.2)" ],
				borderColor : [ "rgba(241, 91, 226, 1)",
						"rgba(255, 99, 132, 1)", "rgba(54, 162, 235, 1)",
						"rgba(153, 102, 255, 1)", "rgba(255, 159, 64, 1)",
						"rgba(100, 205, 0, 1)", "rgba(241, 188, 0, 1)",
						"rgba(241, 91, 0, 1)" ],
				borderWidth : 1
			} ]
		},
		options : {
			scales : {
				yAxes : [ {
					ticks : {
						beginAtZero : true
					}
				} ]
			}
		}
	});
</script>
