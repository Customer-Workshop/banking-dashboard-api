package com.banking.dashboard.repository;

import com.banking.dashboard.entity.MonthlyTransactionVolume;
import com.banking.dashboard.entity.MonthlyTransactionVolumeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonthlyTransactionVolumeRepository extends JpaRepository<MonthlyTransactionVolume, MonthlyTransactionVolumeId> {
}
