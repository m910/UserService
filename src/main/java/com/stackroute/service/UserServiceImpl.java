package com.stackroute.service;

import com.stackroute.domain.User;
import com.stackroute.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User saveUser(User user) {

        User saveUser=userRepository.save(user);
         return saveUser;

    }

    @Override
    public User getUserById(int id) {

        User retrivedUser=userRepository.findById(id).get();
        return retrivedUser;
    }

}
