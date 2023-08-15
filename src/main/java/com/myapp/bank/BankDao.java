package com.myapp.bank;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class BankDao {
	@Autowired
	BankRepository bRepo;
	
	public String postDetails(List<Bank>b) {
		 bRepo.saveAll(b);
		 return "Saved";
		
	}
	public String getIfsc(String brand){
		return bRepo.getIfsc();
	}

}
