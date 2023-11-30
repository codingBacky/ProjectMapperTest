<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<meta charset="UTF-8">
<title>${itemInfo.itemName}</title>
<link rel="stylesheet" href="/resources/css/common.css" />
<script src="https://code.jquery.com/jquery-3.6.4.min.js"></script> <!-- ajax 사용시 필수 -->
</head>
<body>
   
   <h1>상품 상세페이지</h1>
   <h3>
      ${itemInfo.itemNum}
      ${itemInfo.itemName}
      ${itemInfo.sale}
      ${itemInfo.itemCountM}
      ${itemInfo.itemCountL}
      ${itemInfo.itemCountXL}
      ${itemInfo.itemRegDate}
   <br>조회수 : ${itemInfo.readCount}
   
   <br>카테고리 번호 : ${itemInfo.categoryNum}
   </h3>
   
   <!-- 영수야 임시로 쓴거니까 봐줘라 젭알-->
   <div>
         <img src="${itemInfo.mainImg}" alt="Main Image"><br>
         <img src="${itemInfo.subImg1}" alt="Sub Image 1"><br>
         <img src="${itemInfo.subImg2}" alt="Sub Image 2"><br>
         <img src="${itemInfo.subImg3}" alt="Sub Image 3"><br>
         <img src="${itemInfo.subImg4}" alt="Sub Image 4"><br>
    </div>


   <h2>상품리뷰</h2>

   <c:forEach var="reply" items="${replyList}">
      <div>
         <p>Reply Number: ${reply.replyNum}</p>
         <p>Title: ${reply.replyTitle}</p>
         <p>Content: ${reply.replyContent}</p>
         <p>Star Score: ${reply.starScore}</p>
         <p>Item Reply Registered Date: ${reply.itemRepRegDate}</p>
         <p>Image 1: ${reply.img1}</p>
         <p>Item Number: ${reply.itemNum}</p>
         <!-- 필요한 리뷰 속성들을 추가 -->
      </div>
   </c:forEach>
</body>
<footer>
   <jsp:include page="../footer.jsp" />
</footer>
</html>