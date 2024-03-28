package com.StudDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudDetails.entity.StudDetailsEntity;

public interface StudDetailsRepo extends JpaRepository<StudDetailsEntity,Integer> {

}
