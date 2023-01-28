/**
 * Copyright © 2023, ChaloCodeKare, Inc. ALL RIGHTS RESERVED.
 * <p>
 * This software is the confidential information of ChaloCodeKare, Youtube Channel., and is licensed
 * as restricted rights software. The use,reproduction, or disclosure of this software
 * is subject to restrictions set forth in your license agreement with ChaloCodeKare.
 */
package com.chalocodekare.snowflake.service;

import com.chalocodekare.snowflake.entity.EmployeeNameJpaEntity;
import com.chalocodekare.snowflake.repository.EmployeeJpaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeNameJpaService {

    private final EmployeeJpaRepository employeeJpaRepository;

    public EmployeeNameJpaService(EmployeeJpaRepository employeeJpaRepository) {
        this.employeeJpaRepository = employeeJpaRepository;
    }

    /**
     * Find All the entries from Employee Name table using JPA.
     *
     * @return entries from name table.
     */
    public List<EmployeeNameJpaEntity> loadAll() {
        return employeeJpaRepository.findAll();
    }
}
