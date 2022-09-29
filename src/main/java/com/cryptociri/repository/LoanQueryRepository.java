package com.cryptociri.repository;

import com.cryptociri.entity.Loan;
import com.cryptociri.entity.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanQueryRepository extends JpaRepository<Wallet, Long> {

}
