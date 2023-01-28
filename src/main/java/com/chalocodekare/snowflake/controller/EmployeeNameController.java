/**
 * Copyright © 2023, ChaloCodeKare, Inc. ALL RIGHTS RESERVED.
 * <p>
 * This software is the confidential information of ChaloCodeKare, Youtube Channel., and is licensed
 * as restricted rights software. The use,reproduction, or disclosure of this software
 * is subject to restrictions set forth in your license agreement with ChaloCodeKare.
 */
package com.chalocodekare.snowflake.controller;

import com.chalocodekare.snowflake.entity.EmployeeName;
import com.chalocodekare.snowflake.service.EmployeeNameService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/v1/employee/names")
public class EmployeeNameController {

    private EmployeeNameService employeeNameService;

    public EmployeeNameController(EmployeeNameService employeeNameService) {
        this.employeeNameService = employeeNameService;
    }

    @GetMapping
    public List<EmployeeName> loadAll() {
        return employeeNameService.loadAll();
    }
}
