package com.vrp.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vrp.app.dto.GuestDTO;
import com.vrp.app.entity.Guest;
import com.vrp.app.helper.Helper;
import com.vrp.app.repository.GuestRepository;

@Service
public class GuestServiceImpl implements GuestService{

	@Autowired
	private GuestRepository guestRepository;
	
	@Autowired
	private Helper helper;
	
	/**
	 * Saves guest object in DB
	 * 
	 * @param: GuestDTO object with required details
	 * @return: GuestDTO object which has been saved in DB
	 */
	@Override
	public GuestDTO createGuest(Guest guest) {
		
		guest.setGuest_id(helper.generateId());
		Guest savedGuest =  guestRepository.save(guest);
		GuestDTO dto = helper.convertToGuestDTO(savedGuest);
		return dto;
	}

	/**
	 * gets guest details from DB
	 * 
	 * @param: String -> id of guest
	 * @return: GuestDTO object
	 */
	@Override
	public GuestDTO getGuestDetailsById(String guestId) {
		
		Optional<Guest> opt = guestRepository.findById(guestId);
		Guest guest = opt.get();
		GuestDTO dto = helper.convertToGuestDTO(guest);
		return dto;
	}

	/**
	 * Updates guest details
	 * 
	 * @param: String -> id of guest
	 * @param: Guest -> Guest object with details that needs updation
	 * 
	 * @return: GuestDTO -> Customized object
	 */
	@Override
	public GuestDTO updateGuestDetails(String guestId, Guest guest) {
		
		Optional<Guest> opt = guestRepository.findById(guestId);
		Guest foundGuest = opt.get();
		if (guest.getGuest_name() != null) {
			foundGuest.setGuest_name(guest.getGuest_name());
		}
		if (guest.getGender() != null) {
			foundGuest.setGender(guest.getGender());
		}
		if (guest.getBio() != null) {
			foundGuest.setBio(guest.getBio());
		}
		if (guest.getDob() != null) {
			foundGuest.setDob(guest.getDob());
		}
		Guest savedGuest = guestRepository.save(foundGuest);
		GuestDTO dto = helper.convertToGuestDTO(savedGuest);
		return dto;
	}

}
