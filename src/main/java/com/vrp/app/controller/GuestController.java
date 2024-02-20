package com.vrp.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vrp.app.dto.GuestDTO;
import com.vrp.app.entity.Guest;
import com.vrp.app.service.GuestService;

@RestController
@RequestMapping("/api/guest")
public class GuestController {

	@Autowired
	private GuestService guestService;
	
	/**
	 * Adds Guest
	 * @param: Guest -> Object
	 * @return: GuestDTO -> Customized object
	 */
	@PostMapping("/add")
	private ResponseEntity<GuestDTO> addGuestHandler(@RequestBody Guest geust){
		
		GuestDTO res = guestService.createGuest(geust);
		return new ResponseEntity<GuestDTO>(res,HttpStatus.ACCEPTED);
	}
	
	/**
	 * Gets Guest details based on ID
	 * @param: String -> guest-id
	 * @return: GuestDTO -> Customized object
	 */
	@GetMapping("/{id}")
	public ResponseEntity<GuestDTO> getGuestDetailshandler(@PathVariable String id){
		
		GuestDTO res = guestService.getGuestDetailsById(id);
		return new ResponseEntity<GuestDTO>(res,HttpStatus.OK);
	}
}
