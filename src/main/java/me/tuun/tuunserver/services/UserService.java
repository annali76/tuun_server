package me.tuun.tuunserver.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.tuun.tuunserver.models.User;
import me.tuun.tuunserver.repositories.UserRepository;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public User getUserById(Integer userId) {
    User userToGet = userRepository.findById(userId).get();
    return userToGet;
  }

}
