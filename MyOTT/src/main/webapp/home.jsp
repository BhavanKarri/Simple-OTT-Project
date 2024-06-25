<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<head>
    <style>
        body {
            background-color: mint; /* Set a light background color */
        }

        h1 {
            color: darked; /* Set text color to dark red */
            text-align: center;
            font-family: 'Segoe Script', cursive;;
            margin-top :40px;
            margin-bottom :40px;
        }

        table {
            margin-top: 20px; /* Add some space above the table */
            border-collapse: collapse;
            width: 50%; /* Set the width of the table */
            margin-left: auto;
            margin-right: auto;
            color : black;
            background-color : ivory;
        }

        table, th, td {
            border: 3px solid black; /* Set border color to dark red */
        }

        td {
            padding: 10px; /* Add padding to the table cells */
        }

        a {
            color: darkred; /* Set link color to gray */
            text-decoration: underline;
        }
    </style>
</head>

<body>

    <h1>WELCOME TO MY OTT PROJECT</h1>

    <table border="3">
        <tr>
            <td style="border:none">Login as User</td>
            <td style="border:none"><a id = "user_login" href="userLogin.jsp">Login as User</a></td>
        </tr>
        <tr>
            <td style="border:none">Login as Admin</td>
            <td style="border:none"><a id = "admin_login" href="adminLogin.jsp">Login as Admin</a></td>
        </tr>
    </table>

</body>

</html>

