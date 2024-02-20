package com.vrp.app.dto;

import java.util.List;

import com.vrp.app.entity.Booking;
import com.vrp.app.enums.Gender;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Builder
@Getter
@Setter
public class GuestDTO {

	private String guest_id;
	private String guest_name;
	private Gender gender;
	private String dob;
	private String bio;
	List<Booking> bookings;
}
