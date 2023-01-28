/**
 * Copyright © 2023, ChaloCodeKare, Inc. ALL RIGHTS RESERVED.
 * <p>
 * This software is the confidential information of ChaloCodeKare, Youtube Channel., and is licensed
 * as restricted rights software. The use,reproduction, or disclosure of this software
 * is subject to restrictions set forth in your license agreement with ChaloCodeKare.
 */
package com.chalocodekare.snowflake.repository;

import static com.chalocodekare.snowflake.constants.EmployeeNameConstants.EMPLOYEE_ID_COLUMN;
import static com.chalocodekare.snowflake.constants.EmployeeNameConstants.EMPLOYEE_NAME_COLUMN;
import static com.chalocodekare.snowflake.constants.EmployeeNameConstants.QUERY_TO_FETCH_ALL_EMPLOYEES;

import com.chalocodekare.snowflake.entity.EmployeeName;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeNameRepository {

    private final JdbcTemplate jdbcTemplate;

    public EmployeeNameRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    /**
     * Find All the entries from Employee Name table.
     *
     * @return entries from name table.
     */
    public List<EmployeeName> loadAll() {
        return jdbcTemplate.query(QUERY_TO_FETCH_ALL_EMPLOYEES, (resultSet, row) ->
                EmployeeName.builder().employeeId(resultSet.getLong(EMPLOYEE_ID_COLUMN))
                        .employeeName(resultSet.getString(EMPLOYEE_NAME_COLUMN))
                        .build()
        );
    }
}
