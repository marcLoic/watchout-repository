package com.watch.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watch.entities.SuperAdmin;
import com.watch.repository.SuperAdminRepository;
import com.watch.service.SuperAdminService;

@Service
public class SuperAdminImplementation implements SuperAdminService {

	
	SuperAdminRepository superAdminRepository;
	
	@Autowired
	public SuperAdminImplementation(SuperAdminRepository superAdminRepository) {
		super();
		this.superAdminRepository = superAdminRepository;
	}

	@Override
	public List<SuperAdmin> listSuperAdmin() {
		return superAdminRepository.findAll();
	}

	@Override
	public SuperAdmin addSuperAdmin(SuperAdmin superAdmin) {
		return superAdminRepository.save(superAdmin);
	}

	@Override
	public void deleteSuperAdmin(Long id) {
		superAdminRepository.deleteById(id);
	}

	@Override
	public SuperAdmin updateSuperAdmin(SuperAdmin superAdmin) {
		return superAdminRepository.save(superAdmin);
	}

}
