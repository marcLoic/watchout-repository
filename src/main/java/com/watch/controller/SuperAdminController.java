package com.watch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.watch.entities.SuperAdmin;
import com.watch.service.SuperAdminService;

@RestController
public class SuperAdminController {

	
	SuperAdminService superAdminService;

	@Autowired
	public SuperAdminController(SuperAdminService superAdminService) {
		super();
		this.superAdminService = superAdminService;
	}
	
	@GetMapping("/listsuperadmin")
	public List<SuperAdmin> listSuperAdmin(){
		return superAdminService.listSuperAdmin();
	}
	
	@PostMapping("/addsuperadmin")
	public SuperAdmin addSuperAdmin(@RequestBody SuperAdmin superAdmin){
		return superAdminService.addSuperAdmin(superAdmin);
	}
	
	@DeleteMapping("/deletesuperadmin")
	public void deleteSuperAdmin(@PathVariable Long id){
		superAdminService.deleteSuperAdmin(id);;
	}
	
	@PutMapping("/updatesuperadmin")
	public SuperAdmin updateSuperAdmin(@RequestBody SuperAdmin superAdmin){
		return superAdminService.updateSuperAdmin(superAdmin);
	}
}
