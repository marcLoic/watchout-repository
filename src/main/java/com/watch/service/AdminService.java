package com.watch.service;

import java.util.List;

import com.watch.entities.Admin;

public interface AdminService {

	List<Admin> listAdmin();
	
	Admin addAdmin(Admin admin);
	
	void deleteAdmin(Long id);
	
	Admin updateAdmin(Admin admin);
}
