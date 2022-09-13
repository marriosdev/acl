package com.example.marrios.acl.modules.User.services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.marrios.acl.modules.User.dto.UserDto;
import com.example.marrios.acl.modules.User.repositories.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
    
    private UserRepository userRepository;

    public List<UserDto> findAll() {
        List<UserDto> users = userRepository.findAll().stream().map(x-> new UserDto(x)).collect(Collectors.toList());
        return users;
    }
}
