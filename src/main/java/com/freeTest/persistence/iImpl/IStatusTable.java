package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.StatusTable;
import java.util.Optional;

public interface IStatusTable {
    Optional<StatusTable> findStatusTableById (Long sId);
    Optional<StatusTable> findStatusTableByStatus (Integer status);
    Optional<StatusTable> findAll();
}
