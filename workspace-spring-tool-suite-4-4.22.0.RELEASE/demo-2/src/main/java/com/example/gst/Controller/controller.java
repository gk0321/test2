package com.example.gst.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.gst.Entity.Gst;
import com.example.gst.Service.service;

@RestController
@RequestMapping(value = "/gst")
public class controller {
	@Autowired
	service gstserv;

	@PostMapping("/insertAll")
	public String insertall(@RequestBody List<Gst> e) {
		return gstserv.insertall(e);
	}

	@GetMapping(value = "/tax/{h}")
	public int get(@PathVariable int h) {
		return gstserv.get(h);
	}

}