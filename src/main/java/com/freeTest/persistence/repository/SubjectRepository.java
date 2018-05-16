package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository <Subject, Long> {
    Subject findSubjectBySubject (String subject);
}
