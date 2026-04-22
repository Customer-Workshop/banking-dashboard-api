package com.banking.dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "mv_branch_performance", schema = "banking")
public class BranchPerformance {

    @Id
    @Column(name = "branch_id")
    private Integer branchId;

    @Column(name = "branch_code")
    private String branchCode;

    @Column(name = "branch_name")
    private String branchName;

    @Column(name = "location")
    private String location;

    @Column(name = "total_accounts")
    private Long totalAccounts;

    @Column(name = "total_customers")
    private Long totalCustomers;

    @Column(name = "total_deposits")
    private BigDecimal totalDeposits;

    @Column(name = "avg_account_balance")
    private BigDecimal avgAccountBalance;

    @Column(name = "employee_count")
    private Long employeeCount;

    @Column(name = "total_payroll")
    private BigDecimal totalPayroll;

    @Column(name = "active_loans")
    private Long activeLoans;

    @Column(name = "total_loan_portfolio")
    private BigDecimal totalLoanPortfolio;

    @Column(name = "opened_date")
    private LocalDate openedDate;

    public Integer getBranchId() { return branchId; }
    public void setBranchId(Integer branchId) { this.branchId = branchId; }

    public String getBranchCode() { return branchCode; }
    public void setBranchCode(String branchCode) { this.branchCode = branchCode; }

    public String getBranchName() { return branchName; }
    public void setBranchName(String branchName) { this.branchName = branchName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public Long getTotalAccounts() { return totalAccounts; }
    public void setTotalAccounts(Long totalAccounts) { this.totalAccounts = totalAccounts; }

    public Long getTotalCustomers() { return totalCustomers; }
    public void setTotalCustomers(Long totalCustomers) { this.totalCustomers = totalCustomers; }

    public BigDecimal getTotalDeposits() { return totalDeposits; }
    public void setTotalDeposits(BigDecimal totalDeposits) { this.totalDeposits = totalDeposits; }

    public BigDecimal getAvgAccountBalance() { return avgAccountBalance; }
    public void setAvgAccountBalance(BigDecimal avgAccountBalance) { this.avgAccountBalance = avgAccountBalance; }

    public Long getEmployeeCount() { return employeeCount; }
    public void setEmployeeCount(Long employeeCount) { this.employeeCount = employeeCount; }

    public BigDecimal getTotalPayroll() { return totalPayroll; }
    public void setTotalPayroll(BigDecimal totalPayroll) { this.totalPayroll = totalPayroll; }

    public Long getActiveLoans() { return activeLoans; }
    public void setActiveLoans(Long activeLoans) { this.activeLoans = activeLoans; }

    public BigDecimal getTotalLoanPortfolio() { return totalLoanPortfolio; }
    public void setTotalLoanPortfolio(BigDecimal totalLoanPortfolio) { this.totalLoanPortfolio = totalLoanPortfolio; }

    public LocalDate getOpenedDate() { return openedDate; }
    public void setOpenedDate(LocalDate openedDate) { this.openedDate = openedDate; }
}
