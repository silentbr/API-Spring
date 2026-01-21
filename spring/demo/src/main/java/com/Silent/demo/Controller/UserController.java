package com.Silent.demo.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.Silent.demo.dto.DtoRequest;
import com.Silent.demo.dto.DtoResponse;
import com.Silent.demo.service.UserService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@RequestMapping("user")
@Tag(name = "Usuários", description = "Operações relacionadas a usuários")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping("status")
    public String hello(){
        return "API live" ;
    }

    @Operation(summary = "Listar usuários", 
           description = "Retorna uma lista com todos os usuários cadastrados")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Usuários listados com sucesso"),
        @ApiResponse(responseCode = "500", description = "Erro interno do servidor")
    })
    @GetMapping
    public List<DtoResponse> getAllUsers() {
        return service.getAllUsers();
    }

    @Operation(summary = "Criar usuário",
           description = "Cadastra um novo usuário no sistema")
    @ApiResponses({
        @ApiResponse(responseCode = "201", description = "Usuário criado com sucesso"),
        @ApiResponse(responseCode = "400", description = "Dados inválidos")
    })
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public DtoResponse create(@RequestBody DtoRequest dto) {
        return service.createUser(dto);
    }

}
