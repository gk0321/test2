package com.example.gst.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gst.Dao.dao;
import com.example.gst.Entity.Gst;

@Service
public class service {
	@Autowired
	dao gstd;
	public String insertall(List<Gst>e) {
		return gstd.insertAll(e);
	}

	public int get(int h) {	
		return gstd.get(h);
		}
}