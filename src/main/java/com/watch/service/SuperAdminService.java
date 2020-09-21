package com.watch.service;

import java.util.List;

import com.watch.entities.SuperAdmin;

public interface SuperAdminService {

	List<SuperAdmin> listSuperAdmin();
	
	SuperAdmin addSuperAdmin(SuperAdmin superAdmin);
	
	void deleteSuperAdmin(Long id);
	
	SuperAdmin updateSuperAdmin(SuperAdmin superAdmin);
}
