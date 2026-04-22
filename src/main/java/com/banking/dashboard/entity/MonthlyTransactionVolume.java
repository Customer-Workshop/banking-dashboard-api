package com.banking.dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "mv_monthly_transaction_volume", schema = "banking")
@IdClass(MonthlyTransactionVolumeId.class)
public class MonthlyTransactionVolume {

    @Id
    @Column(name = "month")
    private LocalDate month;

    @Id
    @Column(name = "channel")
    private String channel;

    @Id
    @Column(name = "direction")
    private String direction;

    @Column(name = "transaction_count")
    private Long transactionCount;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @Column(name = "avg_amount")
    private BigDecimal avgAmount;

    @Column(name = "min_amount")
    private BigDecimal minAmount;

    @Column(name = "max_amount")
    private BigDecimal maxAmount;

    public LocalDate getMonth() { return month; }
    public void setMonth(LocalDate month) { this.month = month; }

    public String getChannel() { return channel; }
    public void setChannel(String channel) { this.channel = channel; }

    public String getDirection() { return direction; }
    public void setDirection(String direction) { this.direction = direction; }

    public Long getTransactionCount() { return transactionCount; }
    public void setTransactionCount(Long transactionCount) { this.transactionCount = transactionCount; }

    public BigDecimal getTotalAmount() { return totalAmount; }
    public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; }

    public BigDecimal getAvgAmount() { return avgAmount; }
    public void setAvgAmount(BigDecimal avgAmount) { this.avgAmount = avgAmount; }

    public BigDecimal getMinAmount() { return minAmount; }
    public void setMinAmount(BigDecimal minAmount) { this.minAmount = minAmount; }

    public BigDecimal getMaxAmount() { return maxAmount; }
    public void setMaxAmount(BigDecimal maxAmount) { this.maxAmount = maxAmount; }
}
