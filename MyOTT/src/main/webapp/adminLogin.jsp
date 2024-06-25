<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <title>Admin Login</title>
    <style>
        body {
            font-family: 'Apple System', 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: lavender;
            color: black;
            margin: 0;
            padding: 0;
            display: flex;
            align-items: center;
            justify-content: center;
            flex-direction: column;
            height: 100vh;
        }

        h2 {
            font-family: 'Apple System', 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            text-align: center;
            color: black;
            margin-bottom: 20px;
        }

        form {
            background-color: ivory;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            display: flex;
            flex-direction: column;
            align-items: center;
            width: 60%;
            max-width: 300px;
        }

        label {
            color: black;
            margin-bottom: 10px;
        }

        input[type="text"],input[type="password"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 20px;
            box-sizing: border-box;
            border: 1px solid black;
            border-radius: 5px;
        }

        input[type="submit"] {
            background-color: black;
            color: ivory;
            cursor: pointer;
            padding: 10px;
            border: none;
            border-radius: 5px;
            transition: background-color 0.3s, color 0.3s;
            margin-top: 30px;
        }

        input[type="submit"]:hover {
            background-color: ivory;
            color: black;
        }

        p {
            text-align: center;
            color: darkred;
            margin-top: 20px;
        }
    </style>
</head>

<body>
    <h2>ADMIN Login</h2>
    <form action="adminLogin" method = "post">
        <label for="adminName" id="adminName">Username</label>
        <input type="text" name="adminName" id="adminName_input">

        <label for="password" id="password">Password</label>
        <input type="password" name="password" id="password_input">

        <input type="submit" value="Login" id="admin_login">
        <p>${verifyResult}</p>
    </form>
</body>

</html>
