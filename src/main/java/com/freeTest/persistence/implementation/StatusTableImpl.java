package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.StatusTable;
import com.freeTest.persistence.iImpl.IStatusTable;
import com.freeTest.persistence.repository.StatusTableRepository;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@AllArgsConstructor
public class StatusTableImpl implements IStatusTable {
    private StatusTableRepository statusTableRepository;

    @Override
    public Optional<StatusTable> findStatusTableById(Long sId) {return statusTableRepository.findById(sId);}

    @Override
    public Optional<StatusTable> findStatusTableByStatus(Integer status) {return Optional.ofNullable(statusTableRepository.findStatusTableByStatus(status));}

    @Override
    public List<StatusTable> findAll() {return Lists.newArrayList(statusTableRepository.findAll());}

    @Override
    public StatusTable save(StatusTable statusTable) {return statusTableRepository.save(statusTable);}

}
