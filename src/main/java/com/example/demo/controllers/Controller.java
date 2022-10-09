package com.example.demo.controllers;

import com.example.demo.dto.request.UserDto;
import com.example.demo.dto.response.SuccessDto;
import com.example.demo.service.IUserService;
import com.example.demo.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    IUserService userService;

    public Controller(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/listar")
    public ResponseEntity<List<UserDto>> listarUsuarios(){
        return new ResponseEntity<>(userService.listarUsurarios(), HttpStatus.OK);
    }

    @PostMapping("/crear")
    //@ResponseBody
    public ResponseEntity<SuccessDto> crearUsuario(@RequestBody UserDto userDto){
        return new ResponseEntity<>(userService.crearUsuario(userDto), HttpStatus.OK);
    }
}
