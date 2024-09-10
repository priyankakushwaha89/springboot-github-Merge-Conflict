package com.example.springboot_github_merge_conflict;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController 
{

	@Autowired
	EmployeeRepository repo;
	
	@PutMapping("/upd/{id}")
	public String updateById(@RequestBody Employee emp,@PathVariable int id)
	{
		Employee e=repo.findById(id).get();
		repo.save(e);
		return "Data is updated";
	}
}
