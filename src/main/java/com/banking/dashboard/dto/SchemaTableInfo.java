package com.banking.dashboard.dto;

public class SchemaTableInfo {

    private String tableName;
    private String tableType;
    private String columnName;
    private String dataType;
    private String isNullable;
    private Integer ordinalPosition;

    public SchemaTableInfo() {}

    public SchemaTableInfo(String tableName, String tableType, String columnName,
                           String dataType, String isNullable, Integer ordinalPosition) {
        this.tableName = tableName;
        this.tableType = tableType;
        this.columnName = columnName;
        this.dataType = dataType;
        this.isNullable = isNullable;
        this.ordinalPosition = ordinalPosition;
    }

    public String getTableName() { return tableName; }
    public void setTableName(String tableName) { this.tableName = tableName; }

    public String getTableType() { return tableType; }
    public void setTableType(String tableType) { this.tableType = tableType; }

    public String getColumnName() { return columnName; }
    public void setColumnName(String columnName) { this.columnName = columnName; }

    public String getDataType() { return dataType; }
    public void setDataType(String dataType) { this.dataType = dataType; }

    public String getIsNullable() { return isNullable; }
    public void setIsNullable(String isNullable) { this.isNullable = isNullable; }

    public Integer getOrdinalPosition() { return ordinalPosition; }
    public void setOrdinalPosition(Integer ordinalPosition) { this.ordinalPosition = ordinalPosition; }
}
