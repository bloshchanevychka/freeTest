package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.Test;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository <Test, Long> {
    Test findTestByTestName (String testName);
    Test findTestByTestSubj (Long subj);
}
