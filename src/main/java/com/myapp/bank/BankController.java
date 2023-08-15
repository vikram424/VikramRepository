package com.myapp.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/bank")
public class BankController {
	@Autowired
	BankService bs;
	
	@PostMapping(value="/post")
	public String postDetails(@RequestBody List<Bank> b) {
		return bs.postDetails(b);
	}
	
	@GetMapping(value="/get/{branch}")
	public String getIfsc(@PathVariable String brand){
		return bs.getIfsc(brand);
	}

}
