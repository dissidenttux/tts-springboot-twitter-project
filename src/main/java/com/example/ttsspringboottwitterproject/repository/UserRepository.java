package com.example.ttsspringboottwitterproject.repository;

import com.example.ttsspringboottwitterproject.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}