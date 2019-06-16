package com.hackaton.compgenblockdocs.service;

import com.hackaton.compgenblockdocs.model.UserModel;
import com.hackaton.compgenblockdocs.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


    public UserModel createUser(UserModel m){
        return repository.save(m);
    }
}
