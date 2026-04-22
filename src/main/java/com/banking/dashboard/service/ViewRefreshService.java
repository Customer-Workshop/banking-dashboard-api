package com.banking.dashboard.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ViewRefreshService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void refreshAllViews() {
        entityManager.createNativeQuery("SELECT banking.refresh_all_views()").getSingleResult();
    }
}
