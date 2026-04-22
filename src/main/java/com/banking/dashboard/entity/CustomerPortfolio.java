package com.banking.dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "mv_customer_portfolio", schema = "banking")
public class CustomerPortfolio {

    @Id
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "email")
    private String email;

    @Column(name = "location")
    private String location;

    @Column(name = "credit_score")
    private Integer creditScore;

    @Column(name = "total_accounts")
    private Long totalAccounts;

    @Column(name = "checking_balance")
    private BigDecimal checkingBalance;

    @Column(name = "savings_balance")
    private BigDecimal savingsBalance;

    @Column(name = "investment_balance")
    private BigDecimal investmentBalance;

    @Column(name = "total_deposit_balance")
    private BigDecimal totalDepositBalance;

    @Column(name = "total_loan_balance")
    private BigDecimal totalLoanBalance;

    @Column(name = "total_card_balance")
    private BigDecimal totalCardBalance;

    @Column(name = "customer_since")
    private LocalDateTime customerSince;

    public Integer getCustomerId() { return customerId; }
    public void setCustomerId(Integer customerId) { this.customerId = customerId; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public Integer getCreditScore() { return creditScore; }
    public void setCreditScore(Integer creditScore) { this.creditScore = creditScore; }

    public Long getTotalAccounts() { return totalAccounts; }
    public void setTotalAccounts(Long totalAccounts) { this.totalAccounts = totalAccounts; }

    public BigDecimal getCheckingBalance() { return checkingBalance; }
    public void setCheckingBalance(BigDecimal checkingBalance) { this.checkingBalance = checkingBalance; }

    public BigDecimal getSavingsBalance() { return savingsBalance; }
    public void setSavingsBalance(BigDecimal savingsBalance) { this.savingsBalance = savingsBalance; }

    public BigDecimal getInvestmentBalance() { return investmentBalance; }
    public void setInvestmentBalance(BigDecimal investmentBalance) { this.investmentBalance = investmentBalance; }

    public BigDecimal getTotalDepositBalance() { return totalDepositBalance; }
    public void setTotalDepositBalance(BigDecimal totalDepositBalance) { this.totalDepositBalance = totalDepositBalance; }

    public BigDecimal getTotalLoanBalance() { return totalLoanBalance; }
    public void setTotalLoanBalance(BigDecimal totalLoanBalance) { this.totalLoanBalance = totalLoanBalance; }

    public BigDecimal getTotalCardBalance() { return totalCardBalance; }
    public void setTotalCardBalance(BigDecimal totalCardBalance) { this.totalCardBalance = totalCardBalance; }

    public LocalDateTime getCustomerSince() { return customerSince; }
    public void setCustomerSince(LocalDateTime customerSince) { this.customerSince = customerSince; }
}
