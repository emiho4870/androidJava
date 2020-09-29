<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head></head>
<body>
 <!-- ======= Header ======= -->
 <jsp:include page="header.jsp"></jsp:include>
  <header></header><!-- End Header -->
  <main id="main" data-aos="fade-up">

    <!-- ======= Breadcrumbs Section ======= -->
    <section class="breadcrumbs">
      <div class="container">

        <div class="d-flex justify-content-between align-items-center">
          <h2>로그인</h2>
          <ol>
            <li><a href="index.jsp">Home</a></li>
           <!--  <li><a href="portfolio.html">Portfolio</a></li>  -->
            <li>Login</li>
          </ol>
        </div>

      </div>
    </section><!-- Breadcrumbs Section -->

    <!-- ======= 로그인 Section ======= -->
    <section class="login-details">
      <div class="container">

        <div class="portfolio-details-container">

          <div class="row" data-aos="fade-up" data-aos-delay="100">

          <div class="col-lg-6">
            
            <form action="loginOK.jsp" method="post" role="form">
              <div class="form-row">
             </div>
              
              
                <div class="col form-group">
                  <input type="text" name="id_user" class="form-control" id="id2" placeholder="아이디를 입력해주세요" data-rule="minlen:4" />
                  <div class="validate"></div>
                </div>
                
                 <div class="col form-group">
                  <input type="text" name="pw_user" class="form-control" id="pw" placeholder="비밀번를 입력해주세요" data-rule="minlen:4" />
                  <div class="validate"></div>
                  
                      <a href="findId.jsp"><span class="badge badge-light">아이디 찾기</span></a>
                      <a href="findPw.jsp"><span class="badge badge-light">비밀번호 찾기</span></a>
                </div>
                

              <!--  메시지 입력란          
              <div class="form-group">
                <textarea class="form-control" name="message" rows="5" data-rule="required" data-msg="Please write something for us" placeholder="Message"></textarea>
                <div class="validate"></div>
              </div> -->
              
          
              <div class="text-center">
              <button class="btn btn-primary btn-lg" type="submit">로그인</button>
              <a href="signUp.jsp"><span class="btn btn-outline-primary btn-lg">회원가입</span></a>
              </div>
            </form>
              
            
          </div><!-- end col-lg-6 -->

        </div>
        
      </div><!-- end portfolio-details-container -->
    </section><!-- End Portfolio Details Section -->

  </main><!-- End #main -->
  <!-- ======= Footer ======= -->
 <jsp:include page="footer.jsp"></jsp:include> 
</body>

</html>