<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
   //콜백함수(call-back함수)
   //특정한 이벤트를 기다렸다가 그 이벤트가 발생하면
   //함수가 정의되어있는 곳으로 돌아가 자동 호출되는 함수
   //body의 하위 엘리먼트(태그)를 
   //먼저 브라우저가 dom-tree를 구성한 후
   //콜백함수를 정의하게 되어있음.
   //브라우저가 스크립트를 먼저 실행하고 인식하는 것이 아니라
   //body부분을 먼저 읽어서 dom-tree를 만들도록 해야함.
   $(function() {
      $('#b1').click(function() {//body의 b1버튼선택 함수
         $.ajax({
            url: "data/member.xml", //member.xml 경로
            success: function(doc) { //ajax성공시 표시되는 doc 0번 
               console.log('XML요청 성공!!')
               console.log('XML결과: ' + doc)
               list = $(doc).find('record') //list로 xml문서 전체를 넘김
               console.log('레코드의 개수: ' + list.length)
               console.log(list[0])
               if(list.length > 0){
                  $(list).each(function(index, item) {//index 배열번호 , item for-each
                     id = $(item).find('id').text()
                     first_name = $(item).find('first_name').text()
                     last_name = $(item).find('last_name').text()
                     email = $(item).find('email').text()
                     gender = $(item).find('gender').text()
                     ip_address = $(item).find('ip_address').text()
                     total = 'id: ' + id + 
                        ', first_name: ' + first_name +
                        ', last_name: ' + last_name +
                        ', email: ' + email +
                        ', gender: ' + gender +
                        ', ip_address: ' + ip_address 
                     console.log(total)
                     $('#d1').append(total + '<br>')
                     
                     $.ajax({
                        url: "db1.jsp",
                        data: {
                           id : id,
                           first_name : first_name,
                           last_name : last_name,
                           email : email,
                           gender : gender,
                           ip_address : ip_address
                        },
                        success: function(result) {
                        	if (index == 99) {
                           alert('db1.jsp를 통해서 db에 넣기!- 성공적으로 전송함.!!')
                           alert('db1.jsp의 결과: ' + result)								
							}
                        }
                     })
                  })
               }
            }
         })
      })
      $('#b2').click(function() {
         $.ajax({
            url: "data/member.json",
            success: function(doc) {
               //alert('JSON요청 성공!!')
               console.log(doc)
               $(doc).each(function(index , item) {
				id = item.id
				first_name = item.first_name,
                last_name = item.last_name,
                email = item.email,
                gender = item.gender,
                ip_address = item.ip_address
                
                total = 'id: ' + id + 
                ', first_name: ' + first_name +
                ', last_name: ' + last_name +
                ', email: ' + email +
                ', gender: ' + gender +
                ', ip_address: ' + ip_address 
             console.log(total)
             $('#d1').append(total + '<br>')
			})
            }
         })
      })
      $('#b3').click(function() {
         
      })
   })
</script>
</head>
<body>
<button id= "b1">XML읽어오기</button>
<button id= "b2">JSON읽어오기</button>
<button id= "b3">DB에 넣기</button>
<hr color="red">
<div id="d1"></div>

</body>
</html>