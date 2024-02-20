package com.vrp.app.entity;

import java.util.ArrayList;
import java.util.List;

import com.vrp.app.enums.Gender;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Guest {
 
	@Id
	private String guest_id;
	
	private String guest_name;
	
	private Gender gender;
	
	private String dob;
	
	private String bio;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "guest")
	List<Booking> bookings = new ArrayList<>();
}
