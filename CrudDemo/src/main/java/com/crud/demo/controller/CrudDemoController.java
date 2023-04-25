package com.crud.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.model.CrudDemo;
import com.crud.demo.service.CrudDemoService;

@RestController
public class CrudDemoController {
	
	@Autowired
	CrudDemoService cs;
	
	@GetMapping("/all")
	public List<CrudDemo> allDetails(){
		
		return cs.getAllDetails();
	}
	
	@PostMapping("/save")
	public String saveAll(@RequestBody CrudDemo id) {
		
		cs.saveDetails(id);
		return "Details Saved";
	}
	
	@PutMapping("/put")
	public CrudDemo saveAlll(@RequestBody CrudDemo id) {
		
		return cs.putDetails(id);
		
	}
	
	@GetMapping("/all/{id}")
	public CrudDemo getId(@PathVariable int id) {
		
		return cs.getDetailsById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		
		cs.deleteById(id);
		return "Details Deleted";
	}

}
