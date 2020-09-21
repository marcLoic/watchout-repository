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

import com.watch.entities.Admin;
import com.watch.service.AdminService;

@RestController
public class AdminController {

	
	AdminService adminService;

	@Autowired
	public AdminController(AdminService adminService) {
		super();
		this.adminService = adminService;
	}
	
	@GetMapping("/listadmin")
	public List<Admin> listAdmin(){
		return adminService.listAdmin();
	}
	
	@PostMapping("/addadmin")
	public Admin addAdmin(@RequestBody Admin admin){
		return adminService.addAdmin(admin);
	}
	
	@DeleteMapping("/deleteadmin")
	public void deleteAdmin(@PathVariable Long id){
		adminService.deleteAdmin(id);;
	}
	
	@PutMapping("/updateadmin")
	public Admin updateAdmin(@RequestBody Admin admin){
		return adminService.updateAdmin(admin);
	}
}
