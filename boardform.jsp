<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="UTF-8">
<head>
<meta charset="UTF-8">
<title>공지사항</title>

<style type="text/css">
body {
	background-color: #DADADA;
	padding-top: 300px;
	padding-bottom: 300px;
}

.column {
	width: 1000px;
	margin-left: 500px;
}

body>.grid {
	height: 100%;
}

.image {
	margin-top: -100px;
}
/* .column {max-width: 1000px;} */
.view_btn {
	cursor: pointer;
}

.paging {
	display: inline-block;
	margin:0 auto;
	margin-left : 200px;
}
.title {
width : 500px;
	}

li {
	list-style: none;
	display: inline-block;
	margin-left: 20px;
}
</style>
</head>
<body>

	<jsp:include page="header.jsp"></jsp:include>


	<!-- <table border="1">
			<tr id="firstRow" onclick="javascript:clickTrEvent(this)"
				onmouseover="javascript:changeTrColor(this, '#FFFFFF', '#F4FFFD')"
				style="cursor:hand">
				<td>first row - 1</td>
				<td>first row - 2</td>
			</tr>
			<tr id="secondRow" onclick="javascript:clickTrEvent(this)"
				onmouseover="javascript:changeTrColor(this, '#FFFFFF', '#F4FFFD')"
				style="cursor:hand">
				<td>second row - 1</td>
				<td>second row - 2</td>
			</tr>
			<tr id="thirdRow" onclick="javascript:clickTrEvent(this)"
				onmouseover="javascript:changeTrColor(this, '#FFFFFF', '#F4FFFD')"
				style="cursor:hand">
				<td>third row - 1</td>
				<td>third row - 2</td>
			</tr>
		</table> -->




	<div class="ui middle aligned center aligned grid">
		<div class="column">
			<h2 class="ui teal image header">게시판 페이지</h2>
			<div class="ui large form">
				<div class="ui stacked segment">
					<!-- <a href="/coco/write_bbs"><button class="ui fluid large teal submit button">게시글 작성하기</button></a> -->
					<table class="ui celled table">
						<thead>
							<tr>
								<th>NO</th>
								<th class = "title">제목</th>
								<th>작성자</th>
								<th>등록일</th>
							</tr>
							<tr class="view_btn">
								<th>1</th>
								<th class = "title">[마켓빨리]배송 매니저 1인 코로나19 확진 관련 안내</th>
								<th>MarketBarly</th>
								<th>2020-09-23</th>
							</tr>
							<tr class="view_btn">
								<th>2</th>
								<th class = "title">[마켓빨리]배송 매니저 1인 코로나19 확진 관련 안내</th>
								<th>MarketBarly</th>
								<th>2020-09-23</th>
							</tr>
							<tr class="view_btn">
								<th>3</th>
								<th class = "title">[마켓빨리]배송 매니저 1인 코로나19 확진 관련 안내</th>
								<th>MarketBarly</th>
								<th>2020-09-23</th>
							</tr>
							<tr class="view_btn">
								<th>4</th>
								<th class = "title">[마켓빨리]배송 매니저 1인 코로나19 확진 관련 안내</th>
								<th>MarketBarly</th>
								<th>2020-09-23</th>
							</tr>
							<tr class="view_btn">
								<th>5</th>
								<th class = "title">[마켓빨리]배송 매니저 1인 코로나19 확진 관련 안내</th>
								<th>MarketBarly</th>
								<th>2020-09-23</th>
							</tr>
							<tr class="view_btn">
								<th>6</th>
								<th class = "title">[마켓빨리]배송 매니저 1인 코로나19 확진 관련 안내</th>
								<th>MarketBarly</th>
								<th>2020-09-23</th>
							</tr>
							<tr class="view_btn">
								<th>7</th>
								<th class = "title">[마켓빨리]배송 매니저 1인 코로나19 확진 관련 안내</th>
								<th>MarketBarly</th>
								<th>2020-09-23</th>
							</tr>
							<tr class="view_btn">
								<th>8</th>
								<th class = "title">[마켓빨리]배송 매니저 1인 코로나19 확진 관련 안내</th>
								<th>MarketBarly</th>
								<th>2020-09-23</th>
							</tr>
							<tr class="view_btn">
								<th>9</th>
								<th class = "title">[마켓빨리]배송 매니저 1인 코로나19 확진 관련 안내</th>
								<th>MarketBarly</th>
								<th>2020-09-23</th>
							</tr>
						</thead>
					</table>


				</div>



				<!-- 페이징처리위치 -->
				<div>
					<ul class="paging">
						<li>1</li>
						<li>2</li>
						<li>3</li>
						<li>4</li>
						<li>5</li>
						<li>6</li>
						<li>7</li>
						<li>8</li>
						<li>9</li>
					</ul>
				</div>

				<div class="ui error message"></div>

			</div>
		</div>
	</div>

	<jsp:include page="footer.jsp"></jsp:include>


	<script src="/coco/resources/jquery3.3.1.min.js"></script>

	<script>
		$(document)
				.ready(
						function() {
							$
									.ajax({
										/* type: "get", */
										/* url: ".jsp", */
										success : function(data) {
											//데이터 만큼 폴문을 돌림
											for ( /* var str in data */) {
												//변수 tr에 속성을 data-id로 data[str]['b_no']를 넣어주고 id가 list인 태그에 추가
												var tr = $("<tr></tr>").attr(
														"data-id",
														data[str]['b_no'])
														.appendTo("#list");
												//tr에 td테이블 추가 및 클래스 추가 + 텍스트 수정
												$("<td></td>").text(
														data[str]['b_no'])
														.addClass("view_btn")
														.appendTo("#list");
												$("<td></td>").text(
														data[str]['b_title'])
														.addClass("view_btn")
														.appendTo("#list");
												$("<td></td>")
														.text(
																data[str]['b_ownernick'])
														.addClass("view_btn")
														.appendTo("#list");
												$("<td></td>")
														.text(
																FormatToUnixtime(data[str]['b_regdate']))
														.addClass("view_btn")
														.appendTo("#list");
											}
										},
										error : function(error) {
											alert("오류 발생" + error);
										}
									});
							$(document)
									.on(
											"click",
											".view_btn",
											function() {
												//해당하는 태그 속성중 DATA-ID를 가져와서 B_NO에 담음
												var b_no = $(this).parent()
														.attr("data-id");
												$
														.ajax({
															type : "get",
															url : "get_bbs",
															data : {
																b_no : b_no
															},
															success : function(
																	data) {
																//해당하는 ID에 텍스트문 변경
																$("#b_title")
																		.text(
																				data['b_title']);
																$("#b_review")
																		.text(
																				data['b_ownernick']
																						+ " - "
																						+ FormatToUnixtime(data['b_regdate']));
																$("#b_content")
																		.text(
																				data['b_content']);
																//모달을 실행
																$('#view_modal')
																		.modal(
																				'show');
															},
															error : function(
																	error) {
																alert("오류 발생"
																		+ error);
															}
														});
											});
							function FormatToUnixtime(unixtime) {
								var u = new Date(unixtime);
								return u.getUTCFullYear() + '-'
										+ ('0' + u.getUTCMonth()).slice(-2)
										+ '-'
										+ ('0' + u.getUTCDate()).slice(-2)
										+ ' '
										+ ('0' + u.getUTCHours()).slice(-2)
										+ ':'
										+ ('0' + u.getUTCMinutes()).slice(-2)
										+ ':'
										+ ('0' + u.getUTCSeconds()).slice(-2)
							}
							;
						});
		
		
		/* +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ */
		
		function changeTrColor(trObj, oldColor, newColor) {
			trObj.style.backgroundColor = newColor;
			trObj.onmouseout = function(){
				trObj.style.backgroundColor = oldColor;
			}
		}
		function clickTrEvent(trObj) {
			alert(trObj.id);
		}
	</script>


</body>

</html>