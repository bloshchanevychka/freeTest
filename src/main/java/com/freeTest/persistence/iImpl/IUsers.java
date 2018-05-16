package com.freeTest.persistence.iImpl;

import com.freeTest.persistence.entity.Users;
import java.util.Optional;

public interface IUsers  {
    Optional<Users> findUsersById(Long id);
    Optional<Users> findUsersByUFullNameAndUEmail(String fullName, String email);
    Optional<Users> findUsersByUEmailAndUPassword(String email, String password);
    Optional<Users> findUsersByULogin(String login);
    Optional<Users> findUsersByEmail(String email);
    Optional<Users> findUsersByUStatus(String status);
}
