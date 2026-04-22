package com.banking.dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "mv_loan_risk_summary", schema = "banking")
@IdClass(LoanRiskSummaryId.class)
public class LoanRiskSummary {

    @Id
    @Column(name = "loan_type")
    private String loanType;

    @Id
    @Column(name = "status")
    private String status;

    @Column(name = "loan_count")
    private Long loanCount;

    @Column(name = "total_principal")
    private BigDecimal totalPrincipal;

    @Column(name = "total_outstanding")
    private BigDecimal totalOutstanding;

    @Column(name = "avg_interest_rate_pct")
    private BigDecimal avgInterestRatePct;

    @Column(name = "avg_term_months")
    private BigDecimal avgTermMonths;

    @Column(name = "avg_borrower_credit_score")
    private BigDecimal avgBorrowerCreditScore;

    @Column(name = "min_credit_score")
    private Integer minCreditScore;

    @Column(name = "max_credit_score")
    private Integer maxCreditScore;

    @Column(name = "outstanding_to_principal_pct")
    private BigDecimal outstandingToPrincipalPct;

    public String getLoanType() { return loanType; }
    public void setLoanType(String loanType) { this.loanType = loanType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public Long getLoanCount() { return loanCount; }
    public void setLoanCount(Long loanCount) { this.loanCount = loanCount; }

    public BigDecimal getTotalPrincipal() { return totalPrincipal; }
    public void setTotalPrincipal(BigDecimal totalPrincipal) { this.totalPrincipal = totalPrincipal; }

    public BigDecimal getTotalOutstanding() { return totalOutstanding; }
    public void setTotalOutstanding(BigDecimal totalOutstanding) { this.totalOutstanding = totalOutstanding; }

    public BigDecimal getAvgInterestRatePct() { return avgInterestRatePct; }
    public void setAvgInterestRatePct(BigDecimal avgInterestRatePct) { this.avgInterestRatePct = avgInterestRatePct; }

    public BigDecimal getAvgTermMonths() { return avgTermMonths; }
    public void setAvgTermMonths(BigDecimal avgTermMonths) { this.avgTermMonths = avgTermMonths; }

    public BigDecimal getAvgBorrowerCreditScore() { return avgBorrowerCreditScore; }
    public void setAvgBorrowerCreditScore(BigDecimal avgBorrowerCreditScore) { this.avgBorrowerCreditScore = avgBorrowerCreditScore; }

    public Integer getMinCreditScore() { return minCreditScore; }
    public void setMinCreditScore(Integer minCreditScore) { this.minCreditScore = minCreditScore; }

    public Integer getMaxCreditScore() { return maxCreditScore; }
    public void setMaxCreditScore(Integer maxCreditScore) { this.maxCreditScore = maxCreditScore; }

    public BigDecimal getOutstandingToPrincipalPct() { return outstandingToPrincipalPct; }
    public void setOutstandingToPrincipalPct(BigDecimal outstandingToPrincipalPct) { this.outstandingToPrincipalPct = outstandingToPrincipalPct; }
}
