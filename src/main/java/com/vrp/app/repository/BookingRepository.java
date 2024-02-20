package com.vrp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrp.app.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, String>{

}
