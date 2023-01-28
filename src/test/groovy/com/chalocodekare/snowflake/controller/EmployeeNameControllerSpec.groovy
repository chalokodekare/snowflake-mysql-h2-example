/*
 * Copyright © 2023, ChaloCodeKare, Inc. ALL RIGHTS RESERVED.
 * <p>
 * This software is the confidential information of ChaloCodeKare, Youtube Channel., and is licensed
 * as restricted rights software. The use,reproduction, or disclosure of this software
 * is subject to restrictions set forth in your license agreement with ChaloCodeKare.
 */
package com.chalocodekare.snowflake.controller


import com.chalocodekare.snowflake.entity.EmployeeName
import com.chalocodekare.snowflake.service.EmployeeNameService
import spock.lang.Specification

class EmployeeNameControllerSpec extends Specification {
    private EmployeeNameController employeeNameController

    def employeeNameService;

    def setup() {
        employeeNameService = Mock(EmployeeNameService)
        employeeNameController = new EmployeeNameController(employeeNameService)
    }

    def "test the service call"() {
        given: "returned & expected response"
        List<EmployeeName> expected = new ArrayList<>();

        when: "call load all employees function"
        def response = employeeNameController.loadAll();

        then: "expect service method call & verify response"
        1 * employeeNameService.loadAll() >> expected
        assert response == expected
    }
}
