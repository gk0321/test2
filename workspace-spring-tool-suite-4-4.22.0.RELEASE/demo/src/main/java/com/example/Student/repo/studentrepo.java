package com.example.Student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Student.Entity.student;

//import jakarta.persistence.Entity;

public interface studentrepo extends JpaRepository<student,Integer> {

}
