package com.simplify.usersapi.controllers;

import com.simplify.usersapi.entities.Usuario;
import com.simplify.usersapi.entregaveis.ListaObj;
import com.simplify.usersapi.repositories.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LayoutControllerTest {

    @Autowired
    LayoutController controller;

    @MockBean
    UsuarioRepository repository;

    @Test
    void download() {
        String clientezinho = "00CLIENTE2020231-12-1969 21:33:3801\r\n" +
                "02nullnullnull\r\n" +
                "010000000001\r\n";
        controller.dataDeHoje = new Date(2020215-12-2020);
        List<Usuario> usuarios = new ArrayList<>();
        Mockito.when(repository.findAll()).thenReturn(usuarios);
        Usuario user = new Usuario();
        usuarios.add(user);
        Mockito.when(repository.count()).thenReturn((long) 1);
        ResponseEntity resposta = controller.download();
        assertEquals(200, resposta.getStatusCodeValue());

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition",
                "attachment; filename= cliente.txt "
        );
        assertEquals(headers,resposta.getHeaders());
        assertEquals(clientezinho, resposta.getBody().toString());
    }

    @Test
    void importar() {
    }
}