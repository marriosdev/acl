package com.example.marrios.acl.modules.User.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.marrios.acl.modules.User.models.User;

public interface UserRepository extends JpaRepository<User, Long>  {
    
}
