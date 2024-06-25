<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Subscriber Home</title>
    <style>
        body {
           font-family: 'San Francisco', 'Helvetica Neue', 'Helvetica', 'Arial', sans-serif;
            background-color: lavender;
            color: black;
            margin: 0;
            padding: 0;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 80vh;
        }

        h2 {
            text-align: center;
            color: black;
        }

        form {
            width: 60%;
            max-width: 300px;
            background-color: ivory;
            padding: 20px;
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

        input[type="submit"] {
            background-color: black;
            color: ivory;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: ivory;
            color: black;
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
    <h2 id = "subs_welcome">Welcome to subscriber home Page</h2>

    <form action="viewSubscriberDetails" method = "post" id = "subs_details">  
        <input type="submit" value="View Details">
    </form>

    <form action="updateSubscriberDetails1" id = "update_subs" method = "post">
        <input type="submit" value="Update Details">
    </form>

    <form action="showContent" id = "show_content" method = "post">
        <input type="submit" value="Show Content">
    </form>
	
	 <form action="logout" class = "logout-form" id = "sub_logout" method = "post">
        <input type="submit" value="logout">
    </form>
    
    <h2 id ="update_result">${updateResult}</h2>
</body>
</html>
