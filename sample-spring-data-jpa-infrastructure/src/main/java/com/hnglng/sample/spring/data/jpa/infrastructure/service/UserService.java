package com.hnglng.sample.spring.data.jpa.infrastructure.service;

import com.hnglng.sample.spring.data.jpa.domain.model.User;
import com.hnglng.sample.spring.data.jpa.infrastructure.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by huang_liang on 2017/2/24.
 */
@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User findUserby(String name){
        return userRepository.findByName(name);
    }
}
