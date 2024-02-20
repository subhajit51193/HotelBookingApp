package com.vrp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrp.app.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, String>{

}
