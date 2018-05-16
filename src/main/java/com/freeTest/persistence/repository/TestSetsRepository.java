package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.TestSets;
import org.springframework.data.repository.CrudRepository;

public interface TestSetsRepository extends CrudRepository  <TestSets, Long>{
    TestSets findTestSetsByQuestionId (Long question);
    TestSets findTestSetsByTestId (Long test);
}
