package com.example.SpringReactiveBMS.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringReactiveBMS.Model.LoanDetails;
import com.example.SpringReactiveBMS.Repository.BMSRepo;
import com.example.SpringReactiveBMS.Service.BmsService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BmsServImpl implements BmsService {
	
	@Autowired
	private BMSRepo bmsRepo;

	public Mono<LoanDetails> saveLoan(LoanDetails loan) {
		return bmsRepo.save(loan);
	}

	@Override
	public Mono<LoanDetails> getLoan(Integer id) {
		return bmsRepo.findById(id);
	}

	@Override
	public Flux<LoanDetails> getAllLoansBasedOnAccountId(Integer accountId) {
		// TODO Auto-generated method stub
		return bmsRepo.getAllLoansBasedOnAccountId(accountId);
	}

}
