package com.example.StudentDao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentEntity.StudentEntity;

public interface StudentRep extends JpaRepository<StudentEntity,Integer> {

}
