package com.Silent.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Silent.demo.dto.DtoResponse;
import com.Silent.demo.dto.DtoRequest;
import com.Silent.demo.model.User;
import com.Silent.demo.repository.UserRepository;


@Service
public class UserService {
    
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public DtoResponse createUser(DtoRequest dto) {

    User user = new User();
    user.setNome(dto.getNome());
    user.setEmail(dto.getEmail());
    user.setSenha(dto.getSenha());

    User saved = repository.save(user);

    return new DtoResponse(
        saved.getId(),
        saved.getNome(),
        saved.getEmail()
    );
    }

    public List<DtoResponse> getAllUsers() {
    return repository.findAll()
        .stream()
        .map(user -> new DtoResponse(
            user.getId(),
            user.getNome(),
            user.getEmail()
        ))
        .toList();
    }

}

