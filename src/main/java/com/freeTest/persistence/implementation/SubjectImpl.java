package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.Subject;
import com.freeTest.persistence.iImpl.ISubject;
import com.freeTest.persistence.repository.SubjectRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public class SubjectImpl implements ISubject {
    private SubjectRepository subjectRepository;

    public SubjectImpl(SubjectRepository subjectRepository) {this.subjectRepository = subjectRepository;}

    @Override
    public  Optional<Subject> findSubjectById(Long sId) {return subjectRepository.findById(sId);}

    @Override
    public Optional<Subject> findSubjectBySubject(String subject) {return Optional.ofNullable(subjectRepository.findSubjectBySubject(subject)); }

    @Override
    public Iterable<Subject> findAll() {return subjectRepository.findAll();}
}
