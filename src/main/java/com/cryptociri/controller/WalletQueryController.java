package com.cryptociri.controller;

import com.cryptociri.entity.Wallet;
import com.cryptociri.service.WalletQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:3000")
public class WalletQueryController {

    @Autowired
    private WalletQueryService walletQueryService;

    @GetMapping("/wallet")
    public List<Wallet> getAllWallet(){
        return walletQueryService.getAllWallet();
    }

    @PostMapping("/wallet")
    public String createNewWalletEntry(@RequestBody Wallet wallet){
        return walletQueryService.createNewWalletEntry(wallet);
    }
}
