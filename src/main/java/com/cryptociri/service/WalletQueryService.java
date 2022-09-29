package com.cryptociri.service;

import com.cryptociri.entity.Wallet;

import java.util.List;

public interface WalletQueryService {
    List<Wallet> getAllWallet();


    String createNewWalletEntry(Wallet wallet);
}
