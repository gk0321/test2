package com.example.gst.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.gst.Entity.Gst;
import com.example.gst.repository.gstrepo;

@Repository
public class dao {
	@Autowired
	gstrepo gstrep;

	public String insertAll(List<Gst> e) {
		gstrep.saveAll(e);
		return "all records saved succesfully";
	}

	public int get(int h) {
		return gstrep.get(h);
	}
}