package com.diatoz.service.financeservice.service.impl;

import com.diatoz.service.financeservice.entity.BalanceSheet;
import com.diatoz.service.financeservice.entity.BalanceSheetResponse;
import com.diatoz.service.financeservice.repository.BalanceRepository;
import com.diatoz.service.financeservice.service.BalanceSheetService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service
public class BalanceSheetServiceImpl implements BalanceSheetService {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    public BalanceRepository balanceRepository;

    @Value("${balanceSheet.url}")
    private String balanceSheet;




    @Override
    public ResponseEntity retrieveBalanceSheet(String function, String symbol, String apiKey) {
        ResponseEntity<BalanceSheetResponse> responseEntity;
        try {
            List<BalanceSheet> bsh= new ArrayList<>();
            HttpEntity<String> httpEntity = new HttpEntity<>("", null);
            responseEntity = restTemplate.exchange(balanceSheet, HttpMethod.GET, httpEntity, BalanceSheetResponse.class,
                    function, symbol, apiKey);
            for (int i = 0; i < responseEntity.getBody().getAnnualReports().size(); i++) {
                BalanceSheet bs = responseEntity.getBody().getAnnualReports().get(i);
                bs.setSymbol(symbol);
                bsh.add(bs);
            }
           for(int  i = 0; i < responseEntity.getBody().getQuarterlyReports().size();i++){
               BalanceSheet bs=responseEntity.getBody().getQuarterlyReports().get(i);
               bs.setSymbol(symbol);
               bsh.add(bs);
           }
           insertAll(bsh);
           return responseEntity;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void insertAll(List<BalanceSheet> balanceSheets) {
        this.balanceRepository.saveAll(balanceSheets);
    }


}






