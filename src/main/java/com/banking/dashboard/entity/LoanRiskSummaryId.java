package com.banking.dashboard.entity;

import java.io.Serializable;
import java.util.Objects;

public class LoanRiskSummaryId implements Serializable {

    private String loanType;
    private String status;

    public LoanRiskSummaryId() {}

    public LoanRiskSummaryId(String loanType, String status) {
        this.loanType = loanType;
        this.status = status;
    }

    public String getLoanType() { return loanType; }
    public void setLoanType(String loanType) { this.loanType = loanType; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoanRiskSummaryId that = (LoanRiskSummaryId) o;
        return Objects.equals(loanType, that.loanType) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loanType, status);
    }
}
