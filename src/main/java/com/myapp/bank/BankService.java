package com.myapp.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BankService {

	@Autowired
	BankDao bd;
	
	public String postDetails(List<Bank> b) {
		return bd.postDetails(b);
	}
	
	public String getIfsc(String brand){
		return bd.getIfsc(brand);
	}
}
