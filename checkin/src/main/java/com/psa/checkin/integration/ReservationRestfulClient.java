package com.psa.checkin.integration;

import org.springframework.web.bind.annotation.RequestBody;

import com.psa.checkin.dto.Reservation;
import com.psa.checkin.dto.ReservationUpdateRequest;

public interface ReservationRestfulClient {

	public Reservation findReservation(Long id);
	public Reservation updateReservation(@RequestBody ReservationUpdateRequest request);
}
