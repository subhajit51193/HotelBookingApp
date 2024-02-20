package com.vrp.app.helper;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.vrp.app.dto.GuestDTO;
import com.vrp.app.entity.Guest;

@Component
public class Helper {

	/**
	 * This method is used to create a random string
	 * @return: random String
	 */
	public String generateId() {
		String res = UUID.randomUUID().toString();
		return res;
	}
	
	/**
	 * This method converts Guest object into GuestDTO object
	 * @param: Guest -> guest object
	 * @return: GuestSTO -> GuestDTO object
	 */
	public GuestDTO convertToGuestDTO(Guest guest) {
		
		GuestDTO dto = GuestDTO.builder()
				.guest_id(guest.getGuest_id())
				.guest_name(guest.getGuest_name())
				.bio(guest.getBio())
				.dob(guest.getDob())
				.gender(guest.getGender())
				.bookings(guest.getBookings())
				.build();
		return dto;
	}
}
