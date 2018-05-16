package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.StatusTable;
import org.springframework.data.repository.CrudRepository;

public interface StatusTableRepository extends CrudRepository<StatusTable, Long> {
    StatusTable findStatusTableByStatus (Integer status);
}

