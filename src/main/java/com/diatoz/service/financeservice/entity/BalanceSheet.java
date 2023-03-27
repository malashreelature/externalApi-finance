package com.diatoz.service.financeservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Getter
@Setter

public class BalanceSheet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonProperty("fiscalDateEnding")
    private String fiscalDateEnding;
    @JsonProperty("reportedCurrency")
    private String reportedCurrency;
    @JsonProperty("totalAssets")
    private String totalAssets;
    @JsonProperty("totalCurrentAssets")
    private String totalCurrentAssets;
    @JsonProperty("cashAndCashEquivalentsAtCarryingValue")
    private String cashAndCashEquivalentsAtCarryingValue;
    @JsonProperty("cashAndShortTermInvestments")
    private String cashAndShortTermInvestments;
    @JsonProperty("inventory")
    private String inventory;
    @JsonProperty("currentNetReceivables")
    private String currentNetReceivables;
    @JsonProperty("totalNonCurrentAssets")
    private String totalNonCurrentAssets;
    @JsonProperty("propertyPlantEquipment")
    private String propertyPlantEquipment;
    @JsonProperty("accumulatedDepreciationAmortizationPPE")
    private String accumulatedDepreciationAmortizationPPE;
    @JsonProperty("intangibleAssetsExcludingGoodwill")
    private String intangibleAssetsExcludingGoodwill;


    public void setSymbol(String symbol) {

    }

    public void add(BalanceSheet bs) {
    }
}

