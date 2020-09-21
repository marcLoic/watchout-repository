package com.watch.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.watch.entities.Admin;
import com.watch.repository.AdminRepository;
import com.watch.service.AdminService;

@Service
@Transactional
public class AdminImplementation implements AdminService {

	
	AdminRepository adminRepository;
	
	@Autowired
	public AdminImplementation(AdminRepository adminRepository) {
		super();
		this.adminRepository = adminRepository;
	}

	@Override
	public List<Admin> listAdmin() {
		return adminRepository.findAll();
	}

	@Override
	public Admin addAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public void deleteAdmin(Long id) {
		adminRepository.deleteById(id);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

}
