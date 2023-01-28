/**
 * Copyright © 2023, ChaloCodeKare, Inc. ALL RIGHTS RESERVED.
 * <p>
 * This software is the confidential information of ChaloCodeKare, Youtube Channel., and is licensed
 * as restricted rights software. The use,reproduction, or disclosure of this software
 * is subject to restrictions set forth in your license agreement with ChaloCodeKare.
 */
package com.chalocodekare.snowflake.repository;

import com.chalocodekare.snowflake.entity.EmployeeNameJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpaRepository extends JpaRepository<EmployeeNameJpaEntity, Long> {

}
