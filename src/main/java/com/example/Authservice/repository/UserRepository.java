package com.example.Authservice.repository;


import com.example.Authservice.entities.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Long>
{
    public UserInfo findByUsername(String username);
}