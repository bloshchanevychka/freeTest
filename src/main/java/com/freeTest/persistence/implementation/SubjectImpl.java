package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.Subject;
import com.freeTest.persistence.iImpl.ISubject;
import com.freeTest.persistence.repository.SubjectRepository;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@AllArgsConstructor
public class SubjectImpl implements ISubject {
    private SubjectRepository subjectRepository;

    @Override
    public  Optional<Subject> findSubjectById(Long sId) {return subjectRepository.findById(sId);}

    @Override
    public Optional<Subject> findSubjectBySubject(String subject) {return Optional.ofNullable(subjectRepository.findSubjectBySubject(subject)); }

    @Override
    public List<Subject> findAll() {return Lists.newArrayList(subjectRepository.findAll());}

    @Override
    public Subject save(Subject subject){return subjectRepository.save(subject);}
}
