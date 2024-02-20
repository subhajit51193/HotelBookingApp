package com.vrp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrp.app.entity.Property;

public interface PropertyRepository extends JpaRepository<Property, String>{

}
