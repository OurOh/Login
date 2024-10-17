<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>홈 페이지</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #e0f7fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
        .welcome-container {
            background-color: white;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        h1 {
            color: #00796b;
        }
        .btn-logout {
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #00796b;
            color: white;
            border: none;
            cursor: pointer;
            font-size: 16px;
            border-radius: 5px;
        }
        .btn-logout:hover {
            background-color: #004d40;
        }
    </style>
</head>
<body>

<div class="welcome-container">
    <h1>환영합니다, ${user.username}님!</h1>
    <p>성공적으로 로그인되었습니다.</p>

    <!-- 로그아웃 버튼 (연습용) -->
    <form action="logout" method="post">
        <button type="submit" class="btn-logout">로그아웃</button>
    </form>
</div>

</body>
</html>
