package com.watch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.watch.entities.SuperAdmin;

public interface SuperAdminRepository extends JpaRepository<SuperAdmin, Long>{

}
