package com.innovation.Innovation.ai.Service;

import com.innovation.Innovation.ai.Model.User;
import com.innovation.Innovation.ai.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUser(){
        return userRepository.findAll();
    }

    public User saveUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(String id){
        userRepository.deleteById(Integer.valueOf(id));
    }

    public User updateUser(String id, User user){
        User update  = new User();
        update.setName(user.getName());
        update.setEmail(user.getEmail());
        update.setIssue(user.getIssue());

        return userRepository.save(update);
    }

}
