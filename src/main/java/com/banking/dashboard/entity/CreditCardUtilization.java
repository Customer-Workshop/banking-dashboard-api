package com.banking.dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "mv_credit_card_utilization", schema = "banking")
public class CreditCardUtilization {

    @Id
    @Column(name = "card_type")
    private String cardType;

    @Column(name = "card_count")
    private Long cardCount;

    @Column(name = "total_credit_limit")
    private BigDecimal totalCreditLimit;

    @Column(name = "total_balance")
    private BigDecimal totalBalance;

    @Column(name = "utilization_pct")
    private BigDecimal utilizationPct;

    @Column(name = "avg_apr_pct")
    private BigDecimal avgAprPct;

    @Column(name = "total_rewards_points")
    private Long totalRewardsPoints;

    @Column(name = "avg_balance")
    private BigDecimal avgBalance;

    @Column(name = "near_limit_count")
    private Long nearLimitCount;

    @Column(name = "zero_balance_count")
    private Long zeroBalanceCount;

    public String getCardType() { return cardType; }
    public void setCardType(String cardType) { this.cardType = cardType; }

    public Long getCardCount() { return cardCount; }
    public void setCardCount(Long cardCount) { this.cardCount = cardCount; }

    public BigDecimal getTotalCreditLimit() { return totalCreditLimit; }
    public void setTotalCreditLimit(BigDecimal totalCreditLimit) { this.totalCreditLimit = totalCreditLimit; }

    public BigDecimal getTotalBalance() { return totalBalance; }
    public void setTotalBalance(BigDecimal totalBalance) { this.totalBalance = totalBalance; }

    public BigDecimal getUtilizationPct() { return utilizationPct; }
    public void setUtilizationPct(BigDecimal utilizationPct) { this.utilizationPct = utilizationPct; }

    public BigDecimal getAvgAprPct() { return avgAprPct; }
    public void setAvgAprPct(BigDecimal avgAprPct) { this.avgAprPct = avgAprPct; }

    public Long getTotalRewardsPoints() { return totalRewardsPoints; }
    public void setTotalRewardsPoints(Long totalRewardsPoints) { this.totalRewardsPoints = totalRewardsPoints; }

    public BigDecimal getAvgBalance() { return avgBalance; }
    public void setAvgBalance(BigDecimal avgBalance) { this.avgBalance = avgBalance; }

    public Long getNearLimitCount() { return nearLimitCount; }
    public void setNearLimitCount(Long nearLimitCount) { this.nearLimitCount = nearLimitCount; }

    public Long getZeroBalanceCount() { return zeroBalanceCount; }
    public void setZeroBalanceCount(Long zeroBalanceCount) { this.zeroBalanceCount = zeroBalanceCount; }
}
