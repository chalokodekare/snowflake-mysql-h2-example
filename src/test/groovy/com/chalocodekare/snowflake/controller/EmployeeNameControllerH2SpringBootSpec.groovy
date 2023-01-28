/*
 * Copyright © 2023, ChaloCodeKare, Inc. ALL RIGHTS RESERVED.
 * <p>
 * This software is the confidential information of ChaloCodeKare, Youtube Channel., and is licensed
 * as restricted rights software. The use,reproduction, or disclosure of this software
 * is subject to restrictions set forth in your license agreement with ChaloCodeKare.
 */
package com.chalocodekare.snowflake.controller


import com.chalocodekare.snowflake.entity.EmployeeName
import com.chalocodekare.snowflake.repository.EmployeeNameRepository
import com.chalocodekare.snowflake.service.EmployeeNameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.jdbc.Sql
import spock.lang.Specification

@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Sql("classpath:test.sql")
@SpringBootTest
class EmployeeNameControllerH2SpringBootSpec extends Specification {
    @Autowired
    EmployeeNameRepository repository;

    EmployeeNameService employeeNameService;

    def setup() {
        employeeNameService = new EmployeeNameService(repository)
    }

    def "Find employee names"() {
        when: "call method"
        List<EmployeeName> employeeNames = employeeNameService.loadAll()

        then: "employee names should be loaded"
        assert employeeNames.size() == 2
        assert employeeNames.get(0).getEmployeeName() == "first-h2"
        assert employeeNames.get(1).getEmployeeName() == "second-h2"
    }
}
