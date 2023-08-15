package com.myapp.bank;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BankRepository extends JpaRepository<Bank,Integer> {
	
	@Query(value="select ifscCode from bank_details where branch=?",nativeQuery=true )
	
	public String getIfsc();

}
