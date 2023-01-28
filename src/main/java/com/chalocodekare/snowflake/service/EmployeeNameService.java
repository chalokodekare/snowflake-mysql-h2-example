/**
 * Copyright © 2023, ChaloCodeKare, Inc. ALL RIGHTS RESERVED.
 * <p>
 * This software is the confidential information of ChaloCodeKare, Youtube Channel., and is licensed
 * as restricted rights software. The use,reproduction, or disclosure of this software
 * is subject to restrictions set forth in your license agreement with ChaloCodeKare.
 */
package com.chalocodekare.snowflake.service;

import com.chalocodekare.snowflake.entity.EmployeeName;
import com.chalocodekare.snowflake.repository.EmployeeNameRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EmployeeNameService {

    private final EmployeeNameRepository repository;

    public EmployeeNameService(EmployeeNameRepository repository) {
        this.repository = repository;
    }

    /**
     * Find All the entries from Employee Name table.
     *
     * @return entries from name table.
     */
    public List<EmployeeName> loadAll() {
        return repository.loadAll();
    }
}
