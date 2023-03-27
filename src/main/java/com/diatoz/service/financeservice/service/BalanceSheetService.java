package com.diatoz.service.financeservice.service;


import com.diatoz.service.financeservice.entity.BalanceSheet;
import com.diatoz.service.financeservice.entity.BalanceSheetResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BalanceSheetService {

   ResponseEntity <BalanceSheetResponse> retrieveBalanceSheet(String function, String symbol, String apiKey);

void insertAll (List<BalanceSheet> balanceSheets);



}


