package com.StudMarkSheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.StudMarkSheet.entity.StudmarksheetEntity;

public interface StudmarksheetRepo extends JpaRepository<StudmarksheetEntity,Integer>{

}