package com.example.SpringReactiveBMS.Repository;

import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.SpringReactiveBMS.Model.LoanDetails;

import reactor.core.publisher.Flux;

public interface BMSRepo extends ReactiveCrudRepository<LoanDetails, Integer>{
	
	@Query("SELECT * FROM loan_details WHERE accountId= :accountId")
	public Flux<LoanDetails> getAllLoansBasedOnAccountId(@Param("accountId") Integer accountId);
}
