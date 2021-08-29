package com.example.SpringReactiveBMS.Service;

import com.example.SpringReactiveBMS.Model.LoanDetails;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BmsService {
	
	public Mono<LoanDetails> saveLoan(LoanDetails loan);
	
	public Mono<LoanDetails> getLoan(Integer id);
	
	public Flux<LoanDetails> getAllLoansBasedOnAccountId(Integer accountId);

}
