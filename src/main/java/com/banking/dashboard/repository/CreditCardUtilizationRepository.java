package com.banking.dashboard.repository;

import com.banking.dashboard.entity.CreditCardUtilization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditCardUtilizationRepository extends JpaRepository<CreditCardUtilization, String> {
}
