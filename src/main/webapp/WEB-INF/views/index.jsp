<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%> 

<jsp:include page="../views/common/meta.jsp" />
<body>
	<div id="wrap">
		<div class="index_header">
			<ul>
				<li><img alt="테스크쇼" src="/resources/img/logo.png"></li>
				<li>아직 계정이 없으십니까? <a href="#">가입하기</a></li>
			</ul>
		</div>
		
		<div class="index_main">
			<ul>
				<li><img alt="메인이미지" src="/resources/img/indeximg.png"></li>
				<li>
					<p class="mb50">로그인</p>
					<form action="">
						<input type="text" name="user_id" placeholder="이메일주소" class="mb20">
						<input type="password" name="user_pw" placeholder="비밀번호" class="mb20">
						<button class="mb20">로그인</button>
					</form>
					<a href="#">비밀번호를 잊으셨나요?</a>
				</li>
			</ul>
		</div>
	</div>
</body>
</html>