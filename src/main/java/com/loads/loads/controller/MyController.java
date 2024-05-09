package com.loads.loads.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loads.loads.entities.Load;
import com.loads.loads.services.LoadServices;

@RestController
public class MyController {

	@Autowired
	private LoadServices Loadservice;
	//To check Api is working or not
	@GetMapping("/home")
	public String home() {
		return "this is home";
	}
	
	//get the Loads
	@GetMapping("/load")
	public List<Load> getLoads()
	{
		return this.Loadservice.getLoads();
	}

	//get load by id

	@GetMapping("/load/{sellerId}")
	public Load getLoad(@PathVariable String sellerId)
	{
		return this.Loadservice.getLoad(Long.parseLong(sellerId));
	}

	//post new payload
	@PostMapping("/load")
	public Load addLoad(@RequestBody Load load)
	{
		return this.Loadservice.addLoad(load);

	}

	//update payload using id
	@PutMapping("/load")
	public Load updateLoad(@RequestBody Load load)
	{

		return this.Loadservice.updateLoad(load);
	}

	@DeleteMapping("/load/{sellerId}")
	public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String sellerId)
	{
		try{
			this.Loadservice.deleteLoad(Long.parseLong(sellerId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch(Exception e){
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

		}
	}
}
