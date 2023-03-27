package com.diatoz.service.financeservice.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;


@Data
@Getter
@Setter
@NoArgsConstructor
@ComponentScan
public class BalanceSheetResponse  {
    @Id
    private Long id;

    @JsonProperty("symbol")
    private String symbol;

    @JsonProperty("annualReports")
    private List<BalanceSheet> annualReports;

    @JsonProperty("quarterlyReports")
    private List<BalanceSheet> quarterlyReports;



}

