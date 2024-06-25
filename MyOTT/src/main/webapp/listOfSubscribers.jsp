<%@ page import="com.mydemo.first.entity.Subscriber" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Subscriber List</title>
    <style>
      body {
    font-family: 'SF Pro Display', 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
    background-color: lavender;
    color: black;
		}
		
		h2 {
		    font-family: 'Segoe Script', cursive;
		    color: darkred;
		    text-align: center;
		    margin-bottom: 20px;
		}
		
		table {
		    border-collapse: collapse;
		    width: 60%;
		    border: 1px solid lavender; /* Outer border color */
		    border-radius: 10px;
		    overflow: hidden;
		    background-color: ivory;
		}
		
		th, td {
		    border-bottom: 1px solid lavender; /* Add border below each row */
		    padding: 15px;
		    text-align: left;
		}
		
		th {
		    background-color: ivory;
		    color: darkred;
		}
		
		td {
		    background-color: ivory;
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
        
       .home{
            background-color: ivory;
            color: black;
            cursor: pointer;
        }
    </style>
</head>
<body>
	  <form action="returnToAdminHome" class = "home-form" id = "home_button">
        <input type="submit" value="home" class = "home" id="home">
    </form>
    <h2>Subscribers List</h2>
    <table border="1" align = "center">
        <thead>
            <tr>
                <th id="heading_name">Name</th>
                <th id="heading_email">Email</th>
                <th id="heading_age">Age</th>
                <th id="heading_gender">Gender</th>
            </tr>
        </thead>
        <tbody>
            <c:set var="subscribers" value="${sessionScope.subscribers}" />
            <c:if test="${not empty subscribers}">
                <c:forEach var="s" items="${subscribers}">
                    <tr>
                        <td>${s.sname}</td>
                        <td>${s.email}</td>
                        <td>${s.age}</td>
                        <td>${s.gender}</td>
                    </tr>
                </c:forEach>
            </c:if>
        </tbody>
    </table>
</body>
</html>
