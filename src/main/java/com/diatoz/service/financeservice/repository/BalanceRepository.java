package com.diatoz.service.financeservice.repository;

import com.diatoz.service.financeservice.entity.BalanceSheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceRepository extends JpaRepository<BalanceSheet,Long> {





}


