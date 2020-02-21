<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${item.itemname}</title>
<link rel="stylesheet" href="./css/item.css">
</head>
<body>
	<div align ="center">
		<h2>상품 상세보기</h2>
		<table border="1">
			<tr><td><img src="./img/${item.pictureurl}"></td>
			<td>
				<table>
					<tr hegith='50'>
					 	<td width = '160'>상품이름</td>
					 	<td widht = '160'> ${item.itemname}</td>
					 	<td width = '80'>가격</td>
					 	<td widht = '160'> ${item.price}원</td>
					 	<td width = '80'>효능</td>
					 	<td widht = '160'> ${item.description}</td>
				 	</tr>
				 	<tr hegith='50'>
					 	<td colspan='2' aling='center'>
					 		<a href='./'>목록보기</a>
					 	</td>
				 	</tr>
			 	</table>
		 	</td>
			</tr>
		</table>
	</div>
</body>
</html>