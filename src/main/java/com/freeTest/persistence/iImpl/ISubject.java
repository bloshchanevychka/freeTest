package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.Subject;

import java.util.List;
import java.util.Optional;

public interface ISubject {
    Optional<Subject> findSubjectById (Long sId);
    Optional<Subject> findSubjectBySubject (String subject);
    List<Subject> findAll();
    Subject save(Subject subject);
}
