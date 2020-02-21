<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <!-- if나 forEach를 사용하기 위한 태그 라이브러리 설정 -->
 <%@ taglib prefix="c" 
 uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록 출력</title>

<!-- css파일의 경로를 걸어주는 작업 -->
<link rel="stylehseet" href="./css/item.css">

</head>
<body>
	<h2 align ='center'>상품목록</h2>
	<table border = '1' align = 'center'>
		<tr class='header'>
		 	<th width = '80'>상품ID</th>
		 	<th width = '160'>상품이름</th>
		 	<th width = '80'>가격</th>
		 </tr>
		 <c:forEach items="${list}" var ="item">
		 	<tr class="record">
		 		<td align='center'>${item.itemid}</td>
		 		<td>&nbsp;&nbsp; <a href="detail/${item.itemid}">${item.itemname}</a></td> <!-- &nbsp는공백주는 명령어-->
		 		<td align='right'> ${item.price}원 &nbsp;&nbsp;&nbsp;&nbsp;</td>
		 	</tr>
		 </c:forEach>
	</table>
</body>
</html>