package com.diatoz.service.financeservice.controller;

import com.diatoz.service.financeservice.entity.BalanceSheetResponse;
import com.diatoz.service.financeservice.service.BalanceSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class BalanceSheetController {

	@Autowired
	public BalanceSheetService	balanceSheetService;


	@RequestMapping(path="/balanceSheet")
	public ResponseEntity<BalanceSheetResponse> balanceSheet(@RequestParam String function, @RequestParam String symbol, @RequestParam String apiKey) {

	return ResponseEntity.ok(balanceSheetService.retrieveBalanceSheet(function, symbol, apiKey).getBody());


	}


}
