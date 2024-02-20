package com.vrp.app.entity;

import java.util.ArrayList;
import java.util.List;

import com.vrp.app.enums.PropertyType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class Property {

	@Id
	private String property_id;
	
	private String property_name;
	
	private Long rent_per_hour;
	
	private PropertyType propertyType;
	
	private String location;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "host_id")
	private Host host;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "property")
	private List<Booking> bookings = new ArrayList<>();
}
