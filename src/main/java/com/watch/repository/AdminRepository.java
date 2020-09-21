package com.watch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watch.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}
