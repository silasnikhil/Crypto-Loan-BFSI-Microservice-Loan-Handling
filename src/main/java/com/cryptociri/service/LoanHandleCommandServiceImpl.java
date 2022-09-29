package com.cryptociri.service;

import com.cryptociri.entity.Wallet;
import com.cryptociri.repository.LoanCommandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class LoanHandleCommandServiceImpl implements LoanHandleCommandService{

    @Autowired
    private LoanCommandRepository loanCommandRepository;

    @Override
    public String getLoanAmount(Wallet wallet) {
        System.out.println(wallet.getRequiredLoanAmt());
        loanCommandRepository.getLoan(wallet.getRequiredLoanAmt());
        loanCommandRepository.getCrypto(wallet.getCryptoCollateralAmt(), wallet.getCryptoName());
        return "Loan Issued";
    }
}
