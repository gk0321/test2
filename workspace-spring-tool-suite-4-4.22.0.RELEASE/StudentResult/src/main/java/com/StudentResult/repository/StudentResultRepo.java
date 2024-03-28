package com.StudentResult.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudentResult.entity.StudentResultEntity;

public interface StudentResultRepo extends JpaRepository<StudentResultEntity, Integer> {

}
