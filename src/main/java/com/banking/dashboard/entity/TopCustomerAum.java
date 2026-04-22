package com.banking.dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "mv_top_customers_aum", schema = "banking")
public class TopCustomerAum {

    @Id
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "credit_score")
    private Integer creditScore;

    @Column(name = "primary_branch")
    private String primaryBranch;

    @Column(name = "total_deposits")
    private BigDecimal totalDeposits;

    @Column(name = "total_loans")
    private BigDecimal totalLoans;

    @Column(name = "total_card_balance")
    private BigDecimal totalCardBalance;

    @Column(name = "net_position")
    private BigDecimal netPosition;

    @Column(name = "account_count")
    private Long accountCount;

    @Column(name = "loan_count")
    private Long loanCount;

    @Column(name = "card_count")
    private Long cardCount;

    @Column(name = "customer_since")
    private LocalDateTime customerSince;

    @Column(name = "tier")
    private String tier;

    public Integer getCustomerId() { return customerId; }
    public void setCustomerId(Integer customerId) { this.customerId = customerId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public Integer getCreditScore() { return creditScore; }
    public void setCreditScore(Integer creditScore) { this.creditScore = creditScore; }

    public String getPrimaryBranch() { return primaryBranch; }
    public void setPrimaryBranch(String primaryBranch) { this.primaryBranch = primaryBranch; }

    public BigDecimal getTotalDeposits() { return totalDeposits; }
    public void setTotalDeposits(BigDecimal totalDeposits) { this.totalDeposits = totalDeposits; }

    public BigDecimal getTotalLoans() { return totalLoans; }
    public void setTotalLoans(BigDecimal totalLoans) { this.totalLoans = totalLoans; }

    public BigDecimal getTotalCardBalance() { return totalCardBalance; }
    public void setTotalCardBalance(BigDecimal totalCardBalance) { this.totalCardBalance = totalCardBalance; }

    public BigDecimal getNetPosition() { return netPosition; }
    public void setNetPosition(BigDecimal netPosition) { this.netPosition = netPosition; }

    public Long getAccountCount() { return accountCount; }
    public void setAccountCount(Long accountCount) { this.accountCount = accountCount; }

    public Long getLoanCount() { return loanCount; }
    public void setLoanCount(Long loanCount) { this.loanCount = loanCount; }

    public Long getCardCount() { return cardCount; }
    public void setCardCount(Long cardCount) { this.cardCount = cardCount; }

    public LocalDateTime getCustomerSince() { return customerSince; }
    public void setCustomerSince(LocalDateTime customerSince) { this.customerSince = customerSince; }

    public String getTier() { return tier; }
    public void setTier(String tier) { this.tier = tier; }
}
