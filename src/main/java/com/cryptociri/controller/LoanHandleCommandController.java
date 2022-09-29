package com.cryptociri.controller;

import com.cryptociri.entity.Wallet;
import com.cryptociri.service.LoanHandleCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:3000")
public class LoanHandleCommandController {

    @Autowired
    private LoanHandleCommandService loanHandleCommandService;

    @PutMapping("/wallet")
    private String getLoanAmount(@RequestBody Wallet wallet){
        return loanHandleCommandService.getLoanAmount(wallet);
    }

}
