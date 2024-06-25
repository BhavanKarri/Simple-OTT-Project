<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
            height: 80vh;
            padding-top: 40px;
        }

        h2 {
            text-align: center;
            color: black;
        }

        form {
            width: 60%;
            max-width: 300px; /* Set a maximum width for responsiveness */
            background-color: ivory;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: black;
            font-family: 'Segoe Script', cursive;
        }

        input {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            box-sizing: border-box;
            border: 1px solid black;
            border-radius: 5px;
            font-family: 'Segoe Script', cursive;
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
        
       .home{
            background-color: ivory;
            color: black;
            cursor: pointer;
        }
    </style>
</head>
<body>
	<h2>REMOVE CONTENT</h2>
    <form action="removeContent" method="post">

        <label for="movieName" id ="movieName_lbl">Movie Name:</label>
        <input type="text" id="movieName" name="movieName" required>
        
        <input type="submit" value="REMOVE CONTENT" id="removeContent">
     </form>
     
       <form action="returnToAdminHome" class = "home-form" id = "home_button">
        <input type="submit" value="home" class = "home" id="home">
    </form>
</body>
</html>