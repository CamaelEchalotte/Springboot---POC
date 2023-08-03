package com.example.demo.agent;

import java.lang.reflect.Constructor;
import java.time.LocalDate;

public class Agent {
    private Long id;
    private String name;
    private String role;
    private String type;
    private LocalDate dob;
    private Integer age;

    public Agent() {
    }

    public Agent(Long id,
                 String name,
                 String role,
                 String type,
                 LocalDate dob,
                 Integer age) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.type = type;
        this.dob = dob;
        this.age = age;
    }

    public Agent(String name,
                 String role,
                 String type,
                 LocalDate dob,
                 Integer age) {
        this.name = name;
        this.role = role;
        this.type = type;
        this.dob = dob;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", type='" + type + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
