package com.banking.dashboard.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class MonthlyTransactionVolumeId implements Serializable {

    private LocalDate month;
    private String channel;
    private String direction;

    public MonthlyTransactionVolumeId() {}

    public MonthlyTransactionVolumeId(LocalDate month, String channel, String direction) {
        this.month = month;
        this.channel = channel;
        this.direction = direction;
    }

    public LocalDate getMonth() { return month; }
    public void setMonth(LocalDate month) { this.month = month; }

    public String getChannel() { return channel; }
    public void setChannel(String channel) { this.channel = channel; }

    public String getDirection() { return direction; }
    public void setDirection(String direction) { this.direction = direction; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonthlyTransactionVolumeId that = (MonthlyTransactionVolumeId) o;
        return Objects.equals(month, that.month) &&
               Objects.equals(channel, that.channel) &&
               Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(month, channel, direction);
    }
}
