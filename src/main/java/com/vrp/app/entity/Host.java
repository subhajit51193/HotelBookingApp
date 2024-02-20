package com.vrp.app.entity;

import java.util.ArrayList;
import java.util.List;

import com.vrp.app.enums.HostStatus;
import com.vrp.app.enums.PropertyType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "hosts")
public class Host {

	@Id
	private String host_id;
	
	private String host_name;
	
	private HostStatus hostStatus;
	
	private PropertyType propertyType;
	
	private String phone;
	
	private String location;
	
	private String about;
	
	private String hostingSince;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "host")
	private List<Property> properties = new ArrayList<>();
}
