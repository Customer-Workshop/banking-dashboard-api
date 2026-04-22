package com.banking.dashboard.controller;

import com.banking.dashboard.dto.ApiResponse;
import com.banking.dashboard.dto.SchemaTableInfo;
import com.banking.dashboard.service.SchemaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/schema")
@Tag(name = "Schema", description = "Database schema introspection endpoints")
public class SchemaController {

    private final SchemaService schemaService;

    public SchemaController(SchemaService schemaService) {
        this.schemaService = schemaService;
    }

    @GetMapping("/tables")
    @Operation(summary = "Get schema tables and columns",
               description = "Returns all tables and columns in the banking schema from information_schema.")
    public ResponseEntity<ApiResponse<List<SchemaTableInfo>>> getTables() {
        List<SchemaTableInfo> data = schemaService.getSchemaTablesAndColumns();
        return ResponseEntity.ok(ApiResponse.success(data, data.size()));
    }
}
