package com.freeTest.persistence.repository;

import com.freeTest.persistence.entity.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsersRepository extends CrudRepository<Users, Long> {
    Users findUsersByUFullNameAndUEmail(String fullName, String email);
    Users findUsersByUEmailAndUPassword(String email, String password);
    Users findUsersByULogin(String login);
    Users findUsersByUEmail(String email);
    Users findUsersByUStatus(Long status);


}
