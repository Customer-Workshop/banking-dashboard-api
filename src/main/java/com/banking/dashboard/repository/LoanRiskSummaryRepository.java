package com.banking.dashboard.repository;

import com.banking.dashboard.entity.LoanRiskSummary;
import com.banking.dashboard.entity.LoanRiskSummaryId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRiskSummaryRepository extends JpaRepository<LoanRiskSummary, LoanRiskSummaryId> {
}
