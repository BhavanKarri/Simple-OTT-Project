<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Professional Form</title>
    <style>
        body {
            background-color: lavender;
            color: black;
            font-family: 'Arial', sans-serif;
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
        }
        form {
            background-color: ivory;
            padding: 20px;
            border-radius: 10px;
            width: 300px;
            text-align: center;
        }
        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }
        input {
            margin-bottom: 10px;
            padding: 8px;
            width: 100%;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: black;
            color: white;
            cursor: pointer;
        }
        p {
            margin-top: 10px;
            font-style: italic;
        }
        a {
            color: black;
            text-decoration: none;
        }
    </style>
</head>
<body>
    <form action="userRegister" method = "post">
        <h2>Register</h2>
        <label id = "username_lbl">Username</label>
        <input type="text" name="username"><br><br>
        <label id = "password_lbl">Password</label>
        <input type="password" name="password"><br><br>
        <input type="submit" value="Register" id="register"><br><br>
        <p>${verifyResult}</p>
        <label>Already registered?</label><a href="userLogin.jsp">Login</a>
    </form>
</body>
</html>
