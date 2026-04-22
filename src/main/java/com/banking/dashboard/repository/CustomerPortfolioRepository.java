package com.banking.dashboard.repository;

import com.banking.dashboard.entity.CustomerPortfolio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerPortfolioRepository extends JpaRepository<CustomerPortfolio, Integer> {
}
