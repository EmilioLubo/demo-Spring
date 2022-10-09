package com.example.demo.service;

import com.example.demo.dto.request.UserDto;
import com.example.demo.dto.response.SuccessDto;
import com.example.demo.entities.User;
import com.example.demo.repository.IUserRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements IUserService{

    IUserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> listarUsurarios() {
        List<User> userList = userRepository.findAllUsers();
        return userList.stream().map(user -> new UserDto(user.getNombre(), user.getApellido())).collect(Collectors.toList());
    }

    @Override
    public SuccessDto crearUsuario(UserDto userDto) {
        User user = new User(userDto.getNombre(), userDto.getApellido());
        userRepository.saveUser((user));
        return new SuccessDto("¡Usuario creado con éxito!");
    }
}
