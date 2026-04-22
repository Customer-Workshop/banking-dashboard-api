package com.banking.dashboard.service;

import com.banking.dashboard.dto.SchemaTableInfo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SchemaService {

    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    public List<SchemaTableInfo> getSchemaTablesAndColumns() {
        String sql = """
                SELECT t.table_name, t.table_type, c.column_name, c.data_type, c.is_nullable, c.ordinal_position
                FROM information_schema.tables t
                JOIN information_schema.columns c ON t.table_name = c.table_name AND t.table_schema = c.table_schema
                WHERE t.table_schema = 'banking'
                ORDER BY t.table_name, c.ordinal_position
                """;

        Query query = entityManager.createNativeQuery(sql);
        List<Object[]> results = query.getResultList();

        return results.stream()
                .map(row -> new SchemaTableInfo(
                        (String) row[0],
                        (String) row[1],
                        (String) row[2],
                        (String) row[3],
                        (String) row[4],
                        ((Number) row[5]).intValue()
                ))
                .collect(Collectors.toList());
    }
}
