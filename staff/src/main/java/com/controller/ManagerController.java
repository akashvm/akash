package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.ManagerEntity;
import com.Repo.ManagerRepo;

@RestController
@RequestMapping(value = "manager")

public class ManagerController {
	@Autowired
	ManagerRepo mRepo;
	@PostMapping(value = "/add")
	public String add(@RequestBody ManagerEntity s) {
		mRepo.save(s);
		return "Successfully Added";
	}
	@GetMapping(value = "/findId/{id}")
	public ManagerEntity findId(@PathVariable int id) {
		return mRepo.findById(id).get();	
		}
	@GetMapping(value="getbyname/{a}")
    public List<String>getbyname(@PathVariable String a){
    return mRepo.getByName(a);
	}

}
