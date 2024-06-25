<%@ page import="java.util.List" %>
<%@ page import="com.mydemo.first.entity.Content" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Show Contents</title>
    <style>
        body {
            font-family: 'Segoe Script', cursive, 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: lavender;
            color: black;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            color: darkred;
            margin-bottom: 20px; /* Increased margin */
        }
		
        .content-container {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
        }

        .content {
            width: 30%;
            min-height: 45%; /* Decreased height to 75% */
            border: 1px solid #ddd;
            background-color: ivory;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            margin: 10px;
            padding: 12px;
            text-align: center;
            transition: transform 0.3s ease-in-out;
            font-size: 16px;
            border-radius: 10px;
            box-sizing: border-box;
        }

        .content:hover {
            transform: scale(1.05);
        }

        .image {
            max-width: 100%;
            height: auto;
            border-radius: 10px;
            margin-bottom: 6px;
        }

        h3 {
            color: darkred;
            margin-bottom: 6px;
            font-size: 20px;
            font-family: 'Segoe Script', cursive;
        }

        p {
            color: black;
            margin-bottom: 6px;
            font-family: 'Tahoma', sans-serif;
        }

        a {
            text-decoration: none;
            color: black;
            font-weight: bold;
        }

        a:hover {
            color: black;
        }

        p.result {
            text-align: center;
            color: black;
            font-weight: bold;
            font-size: 18px;
        }
       
        form.home-form {
            /* Added styles for the logout form */
            width: 50%;
            height : 25%;
            max-height : 33px;
            max-width: 80px;
            position: absolute;
            top: 10px;
            right: 10px;
            background-color : lavender;
            padding-bottom : 15px;
            padding: 4px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            margin-bottom: 10px;
        }
        
        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            box-sizing: border-box;
            border: 1px solid black;
            border-radius: 5px;
           font-family: 'San Francisco', 'Helvetica Neue', 'Helvetica', 'Arial', sans-serif;
        }
        
       .home{
            background-color: ivory;
            color: black;
            cursor: pointer;
        }
    </style>
</head>
<body>
	
    <h2 id = "content_head">Premium Content</h2>
	
	  <form action="returnToAdminHome" class = "home-form" id = "home_button">
        <input type="submit" value="home" class = "home" id="home">
    </form>
    <div class="content-container">
        <c:forEach var="content" items="${contents}">
            <div class="content">
                <a href="#" class="image-link">
                    <img src="${content.imageLink}" alt="${content.movieName}" class="image">
                </a>
                <h3>Movie: <a href="#" class="movie-link" style="font-family: 'Segoe Script', cursive;">${content.movieName}</a></h3>
                <!-- <p style="font-family: 'Verdana', sans-serif;">Id: ${content.movieId}</p> -->
                <p style="font-family: 'Verdana', sans-serif;">Duration: ${content.duration}</p> 
                <p style="font-family: 'Arial', sans-serif;">Genre: ${content.genre}</p>
            </div>
        </c:forEach>
    </div>
    <p class="result">${result}</p>

</body>
</html>
