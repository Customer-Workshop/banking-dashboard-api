package com.banking.dashboard.repository;

import com.banking.dashboard.entity.TopCustomerAum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopCustomerAumRepository extends JpaRepository<TopCustomerAum, Integer> {

    List<TopCustomerAum> findByTier(String tier);
}
