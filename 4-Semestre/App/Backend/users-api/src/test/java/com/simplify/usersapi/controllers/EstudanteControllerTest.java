package com.simplify.usersapi.controllers;

import com.simplify.usersapi.entities.Login;
import com.simplify.usersapi.entities.Estudante;
import com.simplify.usersapi.entregaveis.FilaObj;
import com.simplify.usersapi.entregaveis.ListaObj;
import com.simplify.usersapi.entregaveis.PilhaObj;
import com.simplify.usersapi.repositories.EstudanteRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EstudanteControllerTest {

    @Autowired
    EstudanteController controller;

    @MockBean
    EstudanteRepository repository;

    @Test
    @DisplayName("Get geral sem if")
    void getAll() {
        Map<UUID, List<Estudante>> reqFeitas = new HashMap<>();
        FilaObj<UUID> filaUUID = new FilaObj<>(10);
        UUID identificador = UUID.randomUUID();
        filaUUID.insert(identificador);
        //List<Usuario> users = Arrays.asList(Mockito.mock(Usuario.class));
        List<Estudante> users = new ArrayList<>();
        reqFeitas.put(identificador, users);

        //Mockito.when(repository.findAll()).thenReturn((List<Usuario>) reqFeitas);

        ResponseEntity resposta = controller.getAll();
        assertEquals(202, resposta.getStatusCodeValue());

    }

    @Test
    void executarScheduler() {
        Estudante user = new Estudante();
        //repository.save(user);
        //Map<UUID, List<Usuario>> reqFeitas = new HashMap<>();
        //FilaObj<UUID> fila = new FilaObj<>(10);
        //UUID identificador = UUID.randomUUID();
        //fila.insert(identificador);
        UUID id = UUID.randomUUID();
        //reqFeitas.put(identificador, repository.findAll());
        FilaObj<UUID> filaUUID = new FilaObj<>(10);
        filaUUID = controller.filaUUID;

        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(user);
        Mockito.when(filaUUID.isEmpty()).thenReturn(false);
        Mockito.when(repository.count()).thenReturn((long) 1);
        Mockito.when(repository.findAll()).thenReturn(estudantes);
        Mockito.when(filaUUID.poll()).thenReturn(id);

        controller.executarScheduler();
        assertEquals(1,controller.reqFeitas.size());
        assertEquals(controller.reqFeitas.get(id), estudantes);
    }

    @Test
    void resultadoCenario1() {
        UUID identificador = UUID.randomUUID();
        String id = identificador.toString();
        UUID identificadorObj = UUID.fromString(id);

        //Map<UUID, List<Usuario>> reqFeitas = new HashMap<>();
        controller.reqFeitas.put(identificadorObj, repository.findAll());

        ResponseEntity resposta = controller.resultado(id);
        assertEquals(200, resposta.getStatusCodeValue());
    }

    @Test
    void resultadoCenario2() {
        UUID identificador = UUID.randomUUID();
        String id = identificador.toString();
        UUID identificadorObj = UUID.fromString(id);

        Map<UUID, List<Estudante>> reqFeitas = new HashMap<>();
        reqFeitas.put(identificadorObj, repository.findAll());

        ResponseEntity resposta = controller.resultado(id);
        assertEquals(404, resposta.getStatusCodeValue());
    }

    @Test
    void postPilha() {
        PilhaObj<Estudante> aux = new PilhaObj<>(10);
        Estudante user = Mockito.mock(Estudante.class);

        aux.push(user);
        repository.save(user);

        ResponseEntity resposta = controller.postPilha(user);
        assertEquals(201, resposta.getStatusCodeValue());
    }

    @Test
    void deletePilha() {
        Integer id = 1;
        Estudante user = Mockito.mock(Estudante.class);
        controller.aux.push(user);

        ResponseEntity resposta = controller.deletePilha(id);

        assertEquals(200, resposta.getStatusCodeValue());
    }

    @Test
    void deletePilhaCenario2() {
        Integer id = 10;

        //Mockito.when(controller.aux.isEmpty()).thenReturn(true);
        controller.aux.pop();

        ResponseEntity resposta = controller.deletePilha(id);
        assertEquals(204, resposta.getStatusCodeValue());
    }

    @Test
    void post() {
        Estudante user = Mockito.mock(Estudante.class);
        ListaObj<Estudante> users = new ListaObj<>(10);
        users.adiciona(user);

        ResponseEntity resposta = controller.post(user);
        assertEquals(201, resposta.getStatusCodeValue());
    }

    @Test
    void getById() {
        Estudante user = Mockito.mock(Estudante.class);
        Integer id = 0;
        Mockito.when(repository.existsById(id)).thenReturn(true);

        ResponseEntity resposta = controller.getById(id);
        assertEquals(200, resposta.getStatusCodeValue());
    }

    @Test
    void getByIdCenario2() {
        Estudante user = Mockito.mock(Estudante.class);
        Integer id = 0;
        repository.save(user);

        ResponseEntity resposta = controller.getById(id);
        assertEquals(204, resposta.getStatusCodeValue());
    }

    @Test
    void deleteById() {
        Estudante user = Mockito.mock(Estudante.class);
        Integer id = 0;
        Mockito.when(repository.existsById(id)).thenReturn(true);

        ResponseEntity resposta = controller.deleteById(id);
        assertEquals(200, resposta.getStatusCodeValue());
    }

    @Test
    void deleteByIdCenario2() {
        Integer id = 0;

        Mockito.when(repository.existsById(id)).thenReturn(false);
        ResponseEntity resposta = controller.deleteById(id);
        assertEquals(204, resposta.getStatusCodeValue());
    }

    @Test
    void login() {
        List<Estudante> estudantes = new ArrayList<>();
        Login login = new Login("teste@simplify","123");
        Estudante user = new Estudante();
        user.setEmail("teste@simplify");
        user.setSenha("123");
        estudantes.add(user);
        Mockito.when(repository.findAll()).thenReturn(estudantes);
        Mockito.when(repository.count()).thenReturn((long) 1);
        ResponseEntity resposta = controller.login(login);
        assertEquals(200, resposta.getStatusCodeValue());
    }

    @Test
    void loginCenario2() {
        List<Estudante> estudantes = new ArrayList<>();
        Login login = new Login("teste@simplify","4123");
        Estudante user = new Estudante();
        user.setEmail("teste@simplify");
        user.setSenha("123");
        estudantes.add(user);
        Mockito.when(repository.findAll()).thenReturn(estudantes);
        Mockito.when(repository.count()).thenReturn((long) 1);
        ResponseEntity resposta = controller.login(login);
        assertEquals(403, resposta.getStatusCodeValue());
    }

    @Test
    void hasSignIn() {
        controller.isSignin = true;

        ResponseEntity resposta = controller.hasSignIn();
        assertEquals(200, resposta.getStatusCodeValue());
    }

    @Test
    void hasSignInCenario2() {
        controller.isSignin = false;

        ResponseEntity resposta = controller.hasSignIn();
        assertEquals(204, resposta.getStatusCodeValue());
    }

    @Test
    void logoff() {
        List<Estudante> estudantes = new ArrayList<>();
        Login login = new Login("teste@simplify","123");
        Estudante user = new Estudante();
        user.setEmail("teste@simplify");
        user.setSenha("123");
        estudantes.add(user);
        Mockito.when(repository.findAll()).thenReturn(estudantes);
        Mockito.when(repository.count()).thenReturn((long) 1);
        ResponseEntity resposta = controller.logoff(login);
        assertEquals(200, resposta.getStatusCodeValue());
    }

    @Test
    void logoffCenario2() {
        List<Estudante> estudantes = new ArrayList<>();
        Login login = new Login("teste@simplify","4123");
        Estudante user = new Estudante();
        user.setEmail("teste@simplify");
        user.setSenha("123");
        estudantes.add(user);
        Mockito.when(repository.findAll()).thenReturn(estudantes);
        Mockito.when(repository.count()).thenReturn((long) 1);
        ResponseEntity resposta = controller.logoff(login);
        assertEquals(403, resposta.getStatusCodeValue());
    }
}