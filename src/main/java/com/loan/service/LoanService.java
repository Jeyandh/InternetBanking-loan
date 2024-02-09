package com.loan.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.loan.bean.Loans;
import com.loan.repository.LoanRepo;

@Service
public class LoanService {

	@Autowired
	LoanRepo repo;

	Loans loan;

	public boolean addLoan(@RequestBody Loans loan) {
		repo.save(loan);
		return true;

	}

	public boolean editLoan(@RequestBody Loans loan) {
		repo.save(loan);
		return true;
	}

	public boolean deleteLoan(long loanId) {
		repo.deleteById(loanId);
		return true;
	}
	public List<Loans> viewAll(){
		Iterator<Loans> it = repo.findAll().iterator();
		ArrayList<Loans> list = new ArrayList<>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
}
