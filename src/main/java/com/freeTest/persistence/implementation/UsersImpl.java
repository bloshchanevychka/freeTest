package com.freeTest.persistence.implementation;

import com.freeTest.persistence.entity.Users;
import com.freeTest.persistence.iImpl.IUsers;
import com.freeTest.persistence.repository.UsersRepository;
import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@AllArgsConstructor
public class UsersImpl implements IUsers {

    private UsersRepository usersRepository;

    @Override
    public Optional<Users> findUsersById(Long id) {
        return usersRepository.findById(id);
    }

   @Override
    public Optional<Users> findUsersByUFullNameAndUEmail(String fullName, String email) {return Optional.ofNullable(usersRepository.findUsersByUFullNameAndUEmail(fullName, email));    }

    @Override
    public Optional<Users> findUsersByUEmailAndUPassword(String email, String password) {return Optional.ofNullable(usersRepository.findUsersByUEmailAndUPassword(email, password));    }

    @Override
    public Optional<Users> findUsersByULogin(String login) {return Optional.ofNullable(usersRepository.findUsersByULogin(login));}

    @Override
    public Optional<Users> findUsersByEmail(String email) {return Optional.ofNullable(usersRepository.findUsersByUEmail(email));}

    @Override
    public Optional<Users> findUsersByUStatus(Long status) {return Optional.ofNullable(usersRepository.findUsersByUStatus(status));}

    @Override
    public List<Users> findAll() {return Lists.newArrayList(usersRepository.findAll());}

    @Override
    public Users save(Users users) {return usersRepository.save(users);}
}