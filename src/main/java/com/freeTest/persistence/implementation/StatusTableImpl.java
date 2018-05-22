package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.StatusTable;
import com.freeTest.persistence.iImpl.IStatusTable;
import com.freeTest.persistence.repository.StatusTableRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class StatusTableImpl implements IStatusTable {
    private StatusTableRepository statusTableRepository;

    public StatusTableImpl(StatusTableRepository statusTableRepository) {this.statusTableRepository = statusTableRepository;}

    @Override
    public Optional<StatusTable> findStatusTableById (Long sId) {return statusTableRepository.findById(sId);}

    @Override
    public Optional<StatusTable> findStatusTableByStatus (Integer status) {return Optional.ofNullable(statusTableRepository.findStatusTableByStatus(status));}

}
