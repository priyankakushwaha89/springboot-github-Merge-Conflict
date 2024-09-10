package com.example.springboot_github_merge_conflict;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
=======
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController
{
    @Autowired
    EmployeeRepository erepo;
    @RequestMapping ("/test")
        public String test()
        {
            return " this is test for merge conflict";
        }
        @RequestMapping("/save")
    public String savedata(@RequestBody Employee emp)
        {
            erepo.save(emp);
            return "data saved";
        }
        @RequestMapping ("/all")

    public List<Employee> alldata()
        {
            return erepo.findAll();
        }
        @RequestMapping ("/{id}")
    public Optional byid(@PathVariable int id)
        {
            return erepo.findById(id);
        }
        @DeleteMapping("/del/{id}")
    public String deleteById(@PathVariable int id){
        erepo.deleteById(id);
        return "Data Deleted";
        }
>>>>>>> 801a06cedafc1c6c4d3806802ba306c719cb54f4

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
