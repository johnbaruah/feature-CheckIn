package com.psa.checkin.dto;

public class Reservation {
	private Long id;
	private boolean checkedIn;
	private int numberOfBags;
	private Passenger passenger;	// for this Passenger class required in dto layer , here object under object, either we get error
	private Flight flight;	//for this Flight class is required under dto layer , here object under object, either we get error
	//1st key value to 3rd key value{"id":1,"checkedIn":true,"numberOfBags":2, // 4th key value "passenger":{"id":1,"firstName":"Manjil","lastName":"Deori","middleName":"mn","email":"mn@gmail.com","phone":"91919191"}, // 5th key value  "flight":{"id":3,"flightNumber":"AA3","operatingAirlines":"American Airlines","departureCity":"AUS","arrivalCity":"NYC","dateOfDeparture":"2018-02-05T08:00:00.000+00:00","estimatedDepartureTime":"2018-02-05T11:14:07.000+00:00"}}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}
