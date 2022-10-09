package com.example.demo.service;

import com.example.demo.dto.request.UserDto;
import com.example.demo.dto.response.SuccessDto;

import java.util.List;

public interface IUserService {
    List<UserDto> listarUsurarios();

    SuccessDto crearUsuario(UserDto userDto);
}
