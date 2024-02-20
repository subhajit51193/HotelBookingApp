package com.vrp.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vrp.app.entity.Host;

public interface HostRepository extends JpaRepository<Host, String>{

}
