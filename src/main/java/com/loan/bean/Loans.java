package com.loan.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_loan")
public class Loans {
	@Id
	@Column(name = "loan_id")
	private long loanId;
	@Column(name = "loan_type")
	private String loanType;
	@Column(name = "loan_amount")
	private long loanAmount;
	@Column(name = "loan_emi")
	private long loanEmi;
	@Column(name = "loan_intrest")
	private double loanIntrest;
	@Column(name="user_name")
	private String userName;
	@Column(name="user_accno")
	private long userAccNo;
	@Column(name = "user_id")
	private long userId;

	public Loans() {
		super();
	}

	public Loans(long loanId, String loanType, long loanAmount, long loanEmi, double loanIntrest, String userName,
			long userAccNo, long userId) {
		super();
		this.loanId = loanId;
		this.loanType = loanType;
		this.loanAmount = loanAmount;
		this.loanEmi = loanEmi;
		this.loanIntrest = loanIntrest;
		this.userName = userName;
		this.userAccNo = userAccNo;
		this.userId = userId;
	}

	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	public long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}

	public long getLoanEmi() {
		return loanEmi;
	}

	public void setLoanEmi(long loanEmi) {
		this.loanEmi = loanEmi;
	}

	public double getLoanIntrest() {
		return loanIntrest;
	}

	public void setLoanIntrest(double loanIntrest) {
		this.loanIntrest = loanIntrest;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public long getUserAccNo() {
		return userAccNo;
	}

	public void setUserAccNo(long userAccNo) {
		this.userAccNo = userAccNo;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}