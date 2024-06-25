<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment Form</title>
     <script>
        // Function to format the card number with spaces after every 4 digits
        function formatCardNumber(input) {
            // Remove any existing spaces and non-numeric characters
            var cardNumber = input.value.replace(/\D/g, '');
            
            // Add spaces after every 4 digits
            var formattedCardNumber = cardNumber.replace(/(\d{4})(?=\d)/g, '$1 ');
            
            // Update the input value
            input.value = formattedCardNumber;
        }
    </script>
    
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
    </style>
</head>
<body>

    <h2>Payment Form</h2>

    <form action="pay" method="post">
        <label for="cardName">Card Name:</label>
        <input type="text" id="cardName" name="cardName" required><br>

        <label for="cardNumber">Card Number:</label>
        <input type="text" id="cardNumber" name="cardNumber" maxlength="19" oninput="formatCardNumber(this)" required><br>

        <label for="cvv">CVV:</label>
        <input type="password" id="cvv" name="cvv" pattern="\d{3}" maxlength="3" required><br>

        <input type="submit" value="Pay" id="pay">
    </form>

</body>
</html>
