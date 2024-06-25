<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Subscriber Details</title>
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
        }

        h2 {
            color: black;
            text-align: center;
            margin-bottom: 20px;
        }

        p {
            background-color: ivory;
            border: 1px solid black;
            border-radius: 10px;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            text-align: left;
            margin: 10px;
            font-size: 18px;
        }

        span.attribute {
            font-weight: bold;
        }

        span.value {
            color: darkred;
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

        input[type="submit"] {
            background-color: ivory;
            color: black;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: black;
            color: ivory;
        }
    </style>
</head>
<body>
    <h2 id = "details_heading">My Details</h2>
    <p>
        <span class="attribute" id = "name">Name: </span><span class="value">${subscriber.sname}</span><br><br><br>
        <span class="attribute" id = "email">Email: </span><span class="value">${subscriber.email}</span><br><br><br>
        <span class="attribute" id = "age">Age: </span><span class="value">${subscriber.age}</span><br><br><br>
        <span class="attribute" id = "gender">Gender: </span><span class="value">${subscriber.gender}</span><br><br>
    </p>
     <form action="returnToSubscriberHome" class = "home-form" id = "home_button">
        <input type="submit" value="home">
    </form>
</body>
</html>
