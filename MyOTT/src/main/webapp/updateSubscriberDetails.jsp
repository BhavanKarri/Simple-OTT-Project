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
            padding-top: 10px;
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

        input,
        select {
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

    <h2>Update details</h2>

    <form action="updateSubscriberDetails2" method = "post">

        <label for="sname" id="sname">Name</label>
        <input type="text" id="sname" name="sname" value="${subscriber.sname}" required><br>

        <label for="email" id="email">Email</label>
        <input type="email" id="email" name="email" value="${subscriber.email}" required><br>

        <label for="age" id="age">Age</label>
        <input type="number" id="age" name="age" value="${subscriber.age}" required><br>

        <label for="gender" id="gender">Gender</label>
        <select id="gender" name="gender" required>
            <option value="male" ${subscriber.gender == 'male' ? 'selected' : ''}>Male</option>
            <option value="female" ${subscriber.gender == 'female' ? 'selected' : ''}>Female</option>
        </select><br>

        <label for="password" id="password">Password</label>
        <input type="password" id="password" name="password" value="${subscriber.password}" required><br>

        <input type="submit" value="Update" id = "update_details">
    </form>
	
	 <form action="returnToSubscriberHome" class = "home-form" id = "home_button">
        <input type="submit" value="home">
    </form>
</body>

</html>
