package com.example.demo.repository;

import com.example.demo.entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.example.demo.utils.Utils.cargar;
@Repository
public class UserRepository implements IUserRepository{

    private final List<User> usuarios = cargar();

    @Override
    public List<User> findAllUsers() {
        return usuarios;
    }

    @Override
    public void saveUser(User user) {
        usuarios.add(user);
    }
}
