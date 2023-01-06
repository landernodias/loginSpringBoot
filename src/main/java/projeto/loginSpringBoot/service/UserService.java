package projeto.loginSpringBoot.service;

import projeto.loginSpringBoot.dtos.UserDto;
import projeto.loginSpringBoot.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
