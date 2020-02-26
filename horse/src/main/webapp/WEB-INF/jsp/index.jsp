<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<div class="container">
	<main role="main">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<div class="carousel-inner bg-secondary text-white">
				<div class="carousel-item">
					<img class="first-slide img-fluid mx-auto"
						src="images/horse/horse1.png" alt="First slide"
						style="width: 2000px; height: 533px;">
					<div class="container">
						<div class="carousel-caption text-left">
							<h1>eee</h1>
							<p>Cras justo odio, dapibus ac facilisis in, egestas eget
								quam. Donec id elit non mi porta gravida at eget metus. Nullam
								id dolor id nibh ultricies vehicula ut id elit.</p>
							<p>
								<a class="btn btn-lg btn-primary" href="#" role="button">Sign up today</a>
							</p>
						</div>
					</div>
				</div>
				<div class="carousel-item active">
					<img class="second-slide img-fluid mx-auto"
						src="images/horse/horse1.png" alt="Second slide"
						style="width: 2000px; height: 533px;">
					<div class="container">
						<div class="carousel-caption">
							<h1>Another example headline.</h1>
							<p>Cras justo odio, dapibus ac facilisis in, egestas eget
								quam. Donec id elit non mi porta gravida at eget metus. Nullam
								id dolor id nibh ultricies vehicula ut id elit.</p>
							<p>
								<a class="btn btn-lg btn-primary" href="#" role="button">Learn more</a>
							</p>
						</div>
					</div>
				</div>
				<div class="carousel-item">
					<img class="third-slide img-fluid mx-auto"
						src="images/horse/horse1.png" alt="Third slide"
						style="width: 2000px; height: 533px;">
					<div class="container">
						<div class="carousel-caption text-right">
							<h1>One more for good measure.</h1>
							<p>Cras justo odio, dapibus ac facilisis in, egestas eget
								quam. Donec id elit non mi porta gravida at eget metus. Nullam
								id dolor id nibh ultricies vehicula ut id elit.</p>
							<p>
								<a class="btn btn-lg btn-primary" href="#" role="button">Browse gallery</a>
							</p>
						</div>
					</div>
				</div>
			</div>
			<a class="carousel-control-prev" href="#myCarousel" role="button"
				data-slide="prev"> <span class="carousel-control-prev-icon"
				aria-hidden="true"></span> <span class="sr-only">Previous</span>
			</a> <a class="carousel-control-next" href="#myCarousel" role="button"
				data-slide="next"> <span class="carousel-control-next-icon"
				aria-hidden="true"></span> <span class="sr-only">Next</span>
			</a>
		</div>


		<!-- Marketing messaging and featurettes
      ================================================== -->
		<!-- Wrap the rest of the page in another container to center all the content. -->

		<div class="container marketing">

			<!-- Three columns of text below the carousel -->
			<div class="row">
				<div class="col-lg-4">
					<img class="rounded-circle" src="images/horse/말3.png"
						alt="Generic placeholder image" width="140" height="140">
					<h2>Heading</h2>
					<p>Donec sed odio dui. Etiam porta sem malesuada magna mollis
						euismod. Nullam id dolor id nibh ultricies vehicula ut id elit.
						Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
						Praesent commodo cursus magna.</p>
					<p>
						<a class="btn btn-secondary" href="#" role="button">View
							details »</a>
					</p>
				</div>
				<!-- /.col-lg-4 -->
				<div class="col-lg-4">
					<img class="rounded-circle" src="images/horse/말3.png"
						alt="Generic placeholder image" width="140" height="140">
					<h2>Heading</h2>
					<p>Duis mollis, est non commodo luctus, nisi erat porttitor
						ligula, eget lacinia odio sem nec elit. Cras mattis consectetur
						purus sit amet fermentum. Fusce dapibus, tellus ac cursus commodo,
						tortor mauris condimentum nibh.</p>
					<p>
						<a class="btn btn-secondary" href="#" role="button">View
							details »</a>
					</p>
				</div>
				<!-- /.col-lg-4 -->
				<div class="col-lg-4">
					<img class="rounded-circle" src="images/horse/말3.png"
						alt="Generic placeholder image" width="140" height="140">
					<h2>Heading</h2>
					<p>Donec sed odio dui. Cras justo odio, dapibus ac facilisis
						in, egestas eget quam. Vestibulum id ligula porta felis euismod
						semper. Fusce dapibus, tellus ac cursus commodo, tortor mauris
						condimentum nibh, ut fermentum massa justo sit amet risus.</p>
					<p>
						<a class="btn btn-secondary" href="#" role="button">View
							details »</a>
					</p>
				</div>
				<!-- /.col-lg-4 -->
			</div>
			<!-- /.row -->


			<!-- 지도 API -->
			<div class="mt-5" id="map" style="width: 1000px; height: 550px;"></div>

			<script type="text/javascript"
				src="//dapi.kakao.com/v2/maps/sdk.js?appkey=0124cdc07f6a313c7c0168ba4538f1f9"></script>

			<script>
				var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
				mapOption = {
					center : new kakao.maps.LatLng(33.3884957, 126.4129626), // 지도의 중심좌표
					level : 10
				// 지도의 확대 레벨
				};

				var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다

				// 마커를 표시할 위치와 title 객체 배열입니다 
				var positions = [ {
					title : '카카오',
					latlng : new kakao.maps.LatLng(33.450705, 126.570677)
				}, {
					title : '생태연못',
					latlng : new kakao.maps.LatLng(33.450936, 126.569477)
				}, {
					title : '텃밭',
					latlng : new kakao.maps.LatLng(33.450879, 126.569940)
				}, {
					title : '근린공원',
					latlng : new kakao.maps.LatLng(33.451393, 126.570738)
				} ];

				// 마커 이미지의 이미지 주소입니다
				var imageSrc = "https://firebasestorage.googleapis.com/v0/b/thisismytea.appspot.com/o/jeju%2Fmar1.png?alt=media&token=db0d538f-ac07-4ae1-9b88-fa5bc3b01821";

				//마커 안내 표시
				var imageSrc2 = "https://firebasestorage.googleapis.com/v0/b/thisismytea.appspot.com/o/jeju%2Fmar2.png?alt=media&token=da91cd6e-c06a-4e6f-93e6-98ae941fef4a";

				for (var i = 0; i < positions.length; i++) {

					// 마커 이미지의 이미지 크기 입니다
					var imageSize = new kakao.maps.Size(35, 35);

					// 마커 이미지를 생성합니다    
					var markerImage = new kakao.maps.MarkerImage(imageSrc,
							imageSize);

					// 마커를 생성합니다
					var marker = new kakao.maps.Marker({
						map : map, // 마커를 표시할 지도
						position : positions[i].latlng, // 마커를 표시할 위치
						title : positions[i].title, // 마커의 타이틀, 마커에 마우스를 올리면 타이틀이 표시됩니다
						image : markerImage
					// 마커 이미지 
					});
				}
			</script>
	</main>
</div>