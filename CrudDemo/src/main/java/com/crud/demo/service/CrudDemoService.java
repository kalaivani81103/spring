package com.crud.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.crud.demo.model.CrudDemo;
import com.crud.demo.repository.CrudDemoRepository;

@Service
public class CrudDemoService {
	
	@Autowired
	CrudDemoRepository cr;
	
	public List<CrudDemo> getAllDetails(){
		
		return cr.findAll();
	}
	
	public CrudDemo saveDetails(@RequestBody CrudDemo id) {
		
		return cr.save(id);
	}
	public CrudDemo putDetails(@RequestBody CrudDemo id) {
			
			return cr.save(id);
		}
	
	public CrudDemo getDetailsById(@PathVariable int id) {
		
		return cr.findById(id).orElse(null);
	}
	
	public void deleteById(@PathVariable int id) {
		
		cr.deleteById(id);
	}

}
