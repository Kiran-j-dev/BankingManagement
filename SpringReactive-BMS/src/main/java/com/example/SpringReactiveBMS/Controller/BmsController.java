package com.example.SpringReactiveBMS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringReactiveBMS.Model.LoanDetails;
import com.example.SpringReactiveBMS.Service.BmsService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bms")
public class BmsController {
	
	@Autowired
	BmsService service;
	
	@PostMapping
	public Mono<LoanDetails> createLoan(@RequestBody LoanDetails loan){
		return service.saveLoan(loan);
	}
	
	@GetMapping("/{id}")
	public Mono<LoanDetails> getLoan(@PathVariable Integer id) {
		return service.getLoan(id);
	}

	@GetMapping("/loans/{accountId}")
	public Flux<LoanDetails> getAllLoansBasedOnAccountId(@PathVariable Integer accountId) {
		return service.getAllLoansBasedOnAccountId(accountId);
	}
}
