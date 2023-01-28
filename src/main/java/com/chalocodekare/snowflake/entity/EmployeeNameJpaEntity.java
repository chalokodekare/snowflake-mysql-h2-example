/**
 * Copyright © 2023, ChaloCodeKare, Inc. ALL RIGHTS RESERVED.
 * <p>
 * This software is the confidential information of ChaloCodeKare, Youtube Channel., and is licensed
 * as restricted rights software. The use,reproduction, or disclosure of this software
 * is subject to restrictions set forth in your license agreement with ChaloCodeKare.
 */
package com.chalocodekare.snowflake.entity;

import static com.chalocodekare.snowflake.constants.EmployeeNameConstants.EMPLOYEE_ID_COLUMN;
import static com.chalocodekare.snowflake.constants.EmployeeNameConstants.EMPLOYEE_NAME_COLUMN;
import static com.chalocodekare.snowflake.constants.EmployeeNameConstants.EMPLOYEE_TABLE_NAME;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = EMPLOYEE_TABLE_NAME)
public class EmployeeNameJpaEntity {

    @Id
    @Column(name = EMPLOYEE_ID_COLUMN)
    private long employeeId;

    @Column(name = EMPLOYEE_NAME_COLUMN)
    private String employeeName;
}
