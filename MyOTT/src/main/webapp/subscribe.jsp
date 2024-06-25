<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Subscribe</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: lavender;
            color: black;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
            padding: 0;
        }

        h2 {
            text-align: center;
            color: black;
        }

        form {
            width: 80%;
            max-width: 300px;
            background-color: ivory;
            padding: 10px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            margin-top: 20px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: black;
        }

        input, select {
            width: 100%;
            padding: 8px;
            margin-bottom: 16px;
            box-sizing: border-box;
            border: 1px solid black;
            border-radius: 5px;
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

        p {
            color: black;
            margin-top: 10px;
        }
    </style>
</head>
<body>

    <h2>Subscribe to Our Platform</h2>

    <form action="subscribe" method="post">

        <label for="sname">Name:</label>
        <input type="text" id="sname" name="sname" value="${user.username}" required>

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>

        <label for="age">Age:</label>
        <input type="number" id="age" name="age" required>

        <label for="gender">Gender:</label>
        <select id="gender" name="gender" required>
            <option value="male">Male</option>
            <option value="female">Female</option>
        </select>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" value="${user.password}" required>

        <input type="submit" value="Subscribe" id="subscribe">
        <p>${result}</p>
    </form>

    

</body>
</html>
