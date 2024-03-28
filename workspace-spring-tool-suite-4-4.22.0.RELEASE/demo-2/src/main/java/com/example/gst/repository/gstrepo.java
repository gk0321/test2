package com.example.gst.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.gst.Entity.Gst;

public interface gstrepo extends JpaRepository<Gst,Integer> {

	@Query(value = "select taxpercentage from gst  where hsn =?", nativeQuery = true)
	public int get(int h);

}
