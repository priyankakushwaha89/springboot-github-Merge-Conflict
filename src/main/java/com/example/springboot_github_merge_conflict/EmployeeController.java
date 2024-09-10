package com.example.springboot_github_merge_conflict;

import org.springframework.beans.factory.annotation.Autowired;
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

}
