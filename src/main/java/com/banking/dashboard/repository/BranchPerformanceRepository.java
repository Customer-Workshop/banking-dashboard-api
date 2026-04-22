package com.banking.dashboard.repository;

import com.banking.dashboard.entity.BranchPerformance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BranchPerformanceRepository extends JpaRepository<BranchPerformance, Integer> {
}
