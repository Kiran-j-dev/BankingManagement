package com.example.SpringReactiveBMS.Model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;

public class LoanDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String loan_type;
	
	private Double loan_amount;
	
	private String date;
	
	private String rate_of_interest;
	
	private String duration;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLoan_type() {
		return loan_type;
	}

	public void setLoan_type(String loan_type) {
		this.loan_type = loan_type;
	}

	public Double getLoan_amount() {
		return loan_amount;
	}

	public void setLoan_amount(Double loan_amount) {
		this.loan_amount = loan_amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRate_of_interest() {
		return rate_of_interest;
	}

	public void setRate_of_interest(String rate_of_interest) {
		this.rate_of_interest = rate_of_interest;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public LoanDetails(int id, String loan_type, Double loan_amount, String date, String rate_of_interest, String duration) {
		super();
		this.id = id;
		this.loan_type = loan_type;
		this.loan_amount = loan_amount;
		this.date = date;
		this.rate_of_interest = rate_of_interest;
		this.duration = duration;
	}
	
	public LoanDetails() {
	}
	
	

}
