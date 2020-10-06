<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.5.1.js"></script>
<script type="text/javascript">
  $(function(){
	  $('#b1').click(function() {
		$.ajax({
			url : " https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Frss.hankyung.com%2Fnew%2Fnews_stock.xml&api_key=6yrsejbgtjgaxn8gdiwo66daqrgsgfoq0xznorky "
			,
			data : {
				url : ' http://rss.hankyung.com/new/news_stock.xml ',
				api_key:'6yrsejbgtjgaxn8gdiwo66daqrgsgfoq0xznorky',
				count : 20
				
			},
			success :function(result){
				console.log('성공' + result)
				list = result.items
				console.log(list.length)
				if (list.length > 0) {
					$(list).each(function(index , item) {
						title = item.title
						pubDate = item.pubDate
						link = item.link
						console.log(title)
						console.log(pubDate)
						console.log(link)
						total = "<b><a href=" + link + ">"  + title + "</a></b> : " + title + "<br>" + pubDate


                   $('#d1').append(total + "<hr>")
                })
             }
          }
       })
    })
    
    
    
     $('#b2').click(function() {
		$.ajax({
			url : " https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Frss.hankyung.com%2Fnew%2Fnews_enter.xml&api_key=6yrsejbgtjgaxn8gdiwo66daqrgsgfoq0xznorky  "
			,
			data : {
				url :'  http://rss.hankyung.com/new/news_enter.xml  ',
				api_key:'6yrsejbgtjgaxn8gdiwo66daqrgsgfoq0xznorky',
				count : 10
				
			},
			success :function(result){
				console.log('성공' + result)
				list = result.items
				console.log(list.length)
				if (list.length > 0) {
					$(list).each(function(index , news2) {
						title = news2.title
						pubDate = news2.pubDate
						discription = news2.discription
						content = news2.content
						link = news2.link
						console.log(title)
						console.log(pubDate)
						console.log(discription)
						console.log(link)
						console.log(content)
						total = "<b><a href=" + link + ">"  + title + "</a></b> : " + pubDate + "<br>" + discription + "<br>" + content
                   $('#d1').append(total + "<hr>")
                })
             }
          }
       })
    })
    
    
    
     $('#b3').click(function() {
		$.ajax({
			url : "https://api.rss2json.com/v1/api.json?rss_url=http%3A%2F%2Frss.hankyung.com%2Fnew%2Fnews_photo.xml&api_key=6yrsejbgtjgaxn8gdiwo66daqrgsgfoq0xznorky "
			,
			data : {
				url : ' http://rss.hankyung.com/new/news_photo.xml ',
				api_key:'6yrsejbgtjgaxn8gdiwo66daqrgsgfoq0xznorky',
				count : 20
				
			},
			success :function(result){
				console.log('성공' + result)
				list = result.items
				console.log(list.length)
				if (list.length > 0) {
					$(list).each(function(index , news3) {
						title = news3.title
						pubDate = news3.pubDate
						discription = news3.discription
						content = news3.content
						link = news3.link
						console.log(title)
						console.log(pubDate)
						console.log(discription)
						console.log(link)
						console.log(content)
						total = "<b><a href=" + link + ">"  + title + "</a></b> : " + pubDate + "<br>" + discription + "<br>" + content
                   $('#d1').append(total + "<hr>")
                })
             }
          }
       })
    })
 })
    
</script>
</head>
<body>
<button id= "b1" style=background:yellow>한결증권 연결</button>
<button id= "b2" style=background:pink>한경연예 연결</button>
<button id= "b3" style=background:green>한경포토 연결</button>
<hr color="red">
<div id="d1"></div>

</body>
</html>