package com.company.menumaker.repositories;

import com.company.menumaker.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer>, JpaSpecificationExecutor<User> {

    Optional<User> findByEmail(String  email);
    Optional<User> findByPhone(String  phone);
    Optional<User> findByPassword(String  password);
    Optional<User> findByState(Integer  state);
}