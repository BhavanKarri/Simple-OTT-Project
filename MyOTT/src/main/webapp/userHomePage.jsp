<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User Home Page</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: lavender;
            color: black;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        form {
            width: 90%;
            max-width: 800px;
            background-color: mintcream; /* Changed to mint color */
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            text-align: center;
        }

        h2,h1 {
            color: gray;
            margin-bottom: 20px;
        }

        input[type="submit"] {
            background-color: black;
            color: ivory;
            cursor: pointer;
            border: none;
            padding: 10px;
            border-radius: 5px;
        }

        input[type="submit"]:hover {
            background-color: ivory;
            color: black;
        }

        p {
            color: black;
            margin-top: 10px;
            font-size: 16px;
        }
    </style>
</head>
<body>
<h1 align = "center">USER HOME</h1>
    <form action="subscribeMap" method = "post">
        <h2 id = "welcome_stmt">Welcome to the User Home Page</h2>
        <h2 >Enjoy all the premium content by subscribing to our platform</h2>
        <input type="submit" value="Subscribe" id="subscribe">
    </form>
    <p>${result}</p>
</body>
</html>
