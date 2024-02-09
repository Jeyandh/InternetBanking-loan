package com.loan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.loan.bean.Loans;
import com.loan.service.LoanService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class LoanController {
	@Autowired
	LoanService service;	
	
	Loans loan;
	
	@PostMapping("/addloan")
	public void addLoan(@RequestBody Loans loan) {
		service.addLoan(loan);
	}
	
	@PutMapping("/editloan")
	public void editUser(@RequestBody Loans loan) {
		service.editLoan(loan);
	}
	
	@DeleteMapping("deleteloan/{loanId}")
	public void deleteUser(@PathVariable("loanId") long loanId) {
		service.deleteLoan(loanId);
	}

	@GetMapping("/viewAllLoan")
	public List<Loans> viewAllDetails() {
		return service.viewAll();
		 
	}

}
