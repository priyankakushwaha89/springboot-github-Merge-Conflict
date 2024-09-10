package com.example.springboot_github_merge_conflict;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Id
public class Employee
{
    int id;
    String name;
    String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
