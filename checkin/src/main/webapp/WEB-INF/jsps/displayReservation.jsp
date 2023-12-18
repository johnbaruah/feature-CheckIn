<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Details</title>
</head>
<body>
	<h2>Reservation Details</h2>
	Passenger Name : ${reservation.getPassenger().firstName }<br/>
	Flight Number : ${reservation.getFlight().flightNumber }<br/><br/>
	
	<h2>Update No. of Bags & Boarding Status</h2>
	<form action="proceedToCheckIn" method="post">
		<pre>
			Reservation Id : <input type="text" name="id" value="${reservation.id}" readonly />
			Number of Bags : <input type="text" name="numberOfBags" value="${reservation.numberOfBags }"/>
			<input type="submit" value="confirm" />
		</pre>
	</form>
	
</body>
</html>