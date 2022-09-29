package com.cryptociri.controller;

import com.cryptociri.service.LoanHandleQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin("http://localhost:3000")
public class LoanHandleQueryController {

    @Autowired
    private LoanHandleQueryService loanHandleQueryService;

    @GetMapping("/loan/{coin}")
    public String getCryptoCoinPriceINR(@PathVariable String coin) throws IOException, InterruptedException {
        return loanHandleQueryService.getCryptoCoinPriceINR(coin);
    }
}
