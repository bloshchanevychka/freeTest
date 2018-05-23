package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.Subject;
import java.util.Optional;

public interface ISubject {
    Optional<Subject> findSubjectById (Long sId);
    Optional<Subject> findSubjectBySubject (String subject);
    Iterable<Subject> findAll();
    Subject save(Subject subject);
}
