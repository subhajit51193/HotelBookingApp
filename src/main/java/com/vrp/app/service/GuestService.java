package com.vrp.app.service;

import com.vrp.app.dto.GuestDTO;
import com.vrp.app.entity.Guest;

public interface GuestService {

	public GuestDTO createGuest(Guest guest);
	
	public GuestDTO getGuestDetailsById(String guestId);
}
