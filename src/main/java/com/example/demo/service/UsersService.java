package com.example.demo.service;

import com.example.demo.database.user.Users;
import com.example.demo.database.user.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersService {

  private final UsersRepository usersRepository;

  public Users createUsers(Users users) {
    usersRepository.save(users);
    return null;
  }

  public boolean existsUsers(Users users) {
    return usersRepository.existsById(users.getId());
  }
}
