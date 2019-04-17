<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/style2.css">
    <script src="js/main.js"></script>
    <title>Todo List</title>
</head>
<body>
    <section>
        <h1>나의 해야할 일들</h1>
        <a href="TodoAddServlet" class="addBtn">새로운 TODO 등록</a>
    </section>

    <section class="container">
        <section class="todo">
            <div class="grid-contianer">
                <div class="item-title">TODO</div>
                <c:forEach items="${list}" var="list">
                	<c:if test="${list.type eq 'TODO'}">
	                 <div class="item-card">
	                 	<input type="hidden" value="${list.id}" id="id" name="id">
	                 	<input type="hidden" value="${list.type}" id="type" name="type">
	                    <h4>${list.title}</h4>
	                    <P>등록날짜 : ${list.regdate} ${list.name} 우선순위 ${list.sequence} <button onclick="moveBtn(this)">→</button></P>
	                </div>
                </c:if>
                </c:forEach>
            </div>
        </section>

        <section class="doing">
            <div class="grid-contianer">
                <div class="item-title">DOING</div>
                <c:forEach items="${list}" var="list">
                	<c:if test="${list.type eq 'DOING'}">
	                 <div class="item-card">
	                 	<input type="hidden" value="${list.id}" id="id" name="id">
	                 	<input type="hidden" value="${list.type}" id="type" name="type">
	                    <h4 class="title">${list.title}</h4>
	                    <P>등록날짜 : ${list.regdate} ${list.name} 우선순위 ${list.sequence} <button onclick="moveBtn(this)">→</button></P>
	                </div>
                </c:if>
                </c:forEach>
            </div>
        </section>

        <section class="done">
            <div class="grid-contianer">
                <div class="item-title">DONE</div>
                <c:forEach items="${list}" var="list">
                	<c:if test="${list.type eq 'DONE'}">
	                 <div class="item-card">
	                 	<input type="hidden" value="${list.id}" id="id" name="id">
	                 	<input type="hidden" value="${list.type}" id="type" name="type">
	                    <h4>${list.title}</h4>
	                    <P>등록날짜 : ${list.regdate} ${list.name} 우선순위 ${list.sequence}<button onclick="moveBtn(this)">→</button></P>
	                </div>
                </c:if>
                </c:forEach>
            </div>
        </section>
    </section>    
</body>
</html>