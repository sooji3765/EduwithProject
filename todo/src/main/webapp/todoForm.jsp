<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8"> 
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>Todo List</title>
	<link rel="stylesheet" href="css/style.css">
	<script>
		function goBack() {
		  window.history.back()
		}
	</script>
</head>
<body>
	<section>
		<h1>할일 등록</h1>
	
		<form action="TodoAddServlet" method="post">
			<label for="title">어떤일인가요?</label>
			<input type="text" name="title" id="title" placeholder="swift 공부하기(24자까지)" maxlength="24" required>
			
			<label for="names">누가 할일인가요?</label>
			<input type="text" name="names" id="names" placeholder="홍길동" required class="input_name">
			
			<label for="sequence">우선순위를 선택하세요</label>
			<div class="radio_aria">
				<label for="sequence1"><input type="radio" id="sequence1" name="sequence" value="1" required>1순위</label>
				<label for="sequence2"><input type="radio" id="sequence2" name="sequence" value="2">2순위</label>
				<label for="sequence3"><input type="radio" id="sequence3" name="sequence" value="3">3순위</label>
			</div>
			<div class="btn_aria">
				<input type="button" value="<&nbsp;이전" onclick="goBack()">
				<input type="reset" value="내용지우기">
				<input type="submit" value="제출">
			</div>
		</form>
	</section>
</body>
</html>