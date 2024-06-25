<%@page import="java.util.List"%>
<%@page import="com.mydemo.first.entity.Subscriber"%>
<%@page import="com.mydemo.first.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Home Page</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: lavender;
            color: grey;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
        }

        h2 {
            text-align: center;
            color: darkred;
            margin-bottom: 20px;
        }

        form {
            width: 50%;
            max-width: 300px;
            background-color: ivory;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            margin-bottom: 20px;
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        input[type="submit"] {
            background-color: black;
            color: ivory;
            cursor: pointer;
            border: none;
            padding: 10px;
            border-radius: 5px;
            transition: background-color 0.3s, color 0.3s;
            width: 80%;
            max-width: 200px;
        }

        input[type="submit"]:hover {
            background-color: ivory;
            color: grey;
        }

        p {
            text-align: center;
            color: darkred;
            margin-top: 20px;
        }
        form.logout-form {
            /* Added styles for the logout form */
            width: 50%;
            max-width: 150px;
            position: absolute;
            top: 10px;
            right: 10px;
            background-color : lavender;
        }
    </style>
</head>

<body>
    <h2>WELCOME TO ADMIN HOME PAGE</h2>

    <form action="getSubscribers" method = "post">
        <input type="submit" value="Get Subscribers" id="getSubscribers">
    </form>

    <form action="addContent.jsp">
        <input type="submit" value="Add New Content" id="addContent">
        <p id="result">${result}</p>
    </form>

    <form action="getContents">
        <input type="submit" value="Show Content" id="getContents">
    </form>
    
    <form action="removeContent.jsp">
        <input type="submit" value="Remove Content" id="removeContent">
    </form>
	
	<form action="adminLogout" class = "logout-form">
        <input type="submit" value="logout" id="adminLogout">
    </form>
    
    
</body>

</html>
