package com.banking.dashboard.service;

import com.banking.dashboard.entity.BranchPerformance;
import com.banking.dashboard.entity.CreditCardUtilization;
import com.banking.dashboard.entity.CustomerPortfolio;
import com.banking.dashboard.entity.LoanRiskSummary;
import com.banking.dashboard.entity.MonthlyTransactionVolume;
import com.banking.dashboard.entity.TopCustomerAum;
import com.banking.dashboard.repository.BranchPerformanceRepository;
import com.banking.dashboard.repository.CreditCardUtilizationRepository;
import com.banking.dashboard.repository.CustomerPortfolioRepository;
import com.banking.dashboard.repository.LoanRiskSummaryRepository;
import com.banking.dashboard.repository.MonthlyTransactionVolumeRepository;
import com.banking.dashboard.repository.TopCustomerAumRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DashboardService {

    private final CustomerPortfolioRepository customerPortfolioRepository;
    private final BranchPerformanceRepository branchPerformanceRepository;
    private final MonthlyTransactionVolumeRepository monthlyTransactionVolumeRepository;
    private final LoanRiskSummaryRepository loanRiskSummaryRepository;
    private final CreditCardUtilizationRepository creditCardUtilizationRepository;
    private final TopCustomerAumRepository topCustomerAumRepository;

    public DashboardService(CustomerPortfolioRepository customerPortfolioRepository,
                            BranchPerformanceRepository branchPerformanceRepository,
                            MonthlyTransactionVolumeRepository monthlyTransactionVolumeRepository,
                            LoanRiskSummaryRepository loanRiskSummaryRepository,
                            CreditCardUtilizationRepository creditCardUtilizationRepository,
                            TopCustomerAumRepository topCustomerAumRepository) {
        this.customerPortfolioRepository = customerPortfolioRepository;
        this.branchPerformanceRepository = branchPerformanceRepository;
        this.monthlyTransactionVolumeRepository = monthlyTransactionVolumeRepository;
        this.loanRiskSummaryRepository = loanRiskSummaryRepository;
        this.creditCardUtilizationRepository = creditCardUtilizationRepository;
        this.topCustomerAumRepository = topCustomerAumRepository;
    }

    public List<CustomerPortfolio> getCustomerPortfolios(String tier) {
        List<CustomerPortfolio> all = customerPortfolioRepository.findAll();
        if (tier != null && !tier.isBlank()) {
            BigDecimal tierThreshold = getTierThreshold(tier);
            if (tierThreshold != null) {
                return all.stream()
                        .filter(cp -> cp.getTotalDepositBalance() != null &&
                                cp.getTotalDepositBalance().compareTo(tierThreshold) >= 0)
                        .collect(Collectors.toList());
            }
        }
        return all;
    }

    public List<BranchPerformance> getBranchPerformance(BigDecimal minDeposits) {
        List<BranchPerformance> all = branchPerformanceRepository.findAll();
        if (minDeposits != null) {
            return all.stream()
                    .filter(bp -> bp.getTotalDeposits() != null &&
                            bp.getTotalDeposits().compareTo(minDeposits) >= 0)
                    .collect(Collectors.toList());
        }
        return all;
    }

    public List<MonthlyTransactionVolume> getMonthlyTransactionVolume() {
        return monthlyTransactionVolumeRepository.findAll();
    }

    public List<LoanRiskSummary> getLoanRiskSummary() {
        return loanRiskSummaryRepository.findAll();
    }

    public List<CreditCardUtilization> getCreditCardUtilization() {
        return creditCardUtilizationRepository.findAll();
    }

    public List<TopCustomerAum> getTopCustomers(String tier) {
        if (tier != null && !tier.isBlank()) {
            return topCustomerAumRepository.findByTier(tier);
        }
        return topCustomerAumRepository.findAll();
    }

    private BigDecimal getTierThreshold(String tier) {
        return switch (tier.toUpperCase()) {
            case "PLATINUM" -> new BigDecimal("500000");
            case "GOLD" -> new BigDecimal("250000");
            case "SILVER" -> new BigDecimal("100000");
            case "BRONZE" -> new BigDecimal("50000");
            default -> null;
        };
    }
}
