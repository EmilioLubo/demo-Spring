package com.example.demo.utils;

import com.example.demo.entities.User;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<User> cargar(){
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("Carlos", "Almeida"));
        usuarios.add(new User("Fabiana", "Lopez"));
        usuarios.add(new User("Alberto", "Perez"));
        usuarios.add(new User("José", "Rearte"));

        return usuarios;
    }
}
