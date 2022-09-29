package com.cryptociri.service;

import com.cryptociri.entity.Wallet;
import com.cryptociri.repository.WalletQueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletQueryServiceImpl implements WalletQueryService{

    @Autowired
    private WalletQueryRepository walletQueryRepository;

    @Override
    public List<Wallet> getAllWallet() {
        return walletQueryRepository.findAll();
    }

    @Override
    public String createNewWalletEntry(Wallet wallet) {

        walletQueryRepository.save(wallet);
        return "Entry Created";

    }
}
