package com.cryptociri.service;

import java.io.IOException;

public interface LoanHandleQueryService {
    String getCryptoCoinPriceINR(String coin) throws IOException, InterruptedException;
}
