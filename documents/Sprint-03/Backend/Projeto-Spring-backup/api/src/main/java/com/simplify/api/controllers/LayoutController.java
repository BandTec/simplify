package com.simplify.api.controllers;


import com.simplify.api.entities.Usuario;
import com.simplify.api.entregaveis.GravaArquivo;
import com.simplify.api.entregaveis.ListaObj;
import com.simplify.api.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
@RequestMapping("/layout")
public class LayoutController {
    @Autowired
    private UsuarioRepository repository;

    int tam = 7;
    ListaObj<Usuario> listaExportar = new ListaObj<>(tam);
    Date dataDeHoje = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    @GetMapping(value = "download", produces = {"app/txt"})
    public ResponseEntity download(){
        FileWriter arquivo;
        Formatter exit = null;
        List<Usuario> clientes = repository.findAll();
        String clientezinho ="";
        String header = "";
        String body = "";
        String trailer = "";
        String nomeArq = "layout.txt";
        Integer contReg = 0;

        header += "00CLIENTE20202";
        header += formatter.format(dataDeHoje);
        header += "01";
        GravaArquivo.gravaRegistro(nomeArq,header);
        clientezinho +=String.format("%s%n",header);

        listaExportar.limpa();
        for (int i = 0; i < repository.count();i++){
            listaExportar.adiciona(clientes.get(i));
        } try{
            arquivo = new FileWriter("layout.txt",false);
            exit = new Formatter(arquivo);

        }catch (IOException erro){
            return ResponseEntity.badRequest().body(erro);
        }
        try {
            for (int i = 0; i< listaExportar.getTamanho(); i++){
                Usuario c = listaExportar.getElemento(i);

                //corpo
                if ( i<1){
                    body += "02";

                } else {
                    body = "02";

                }
                body+= c.getNome();

                body+= c.getEmail();
                body+= c.getDataNascimento();
                clientezinho += String.format("%s%n",body);
                contReg++;
            }exit.close();
        }catch (FormatterClosedException e){
            return ResponseEntity.badRequest().body(e);
        }
        trailer += "01";
        trailer += String.format("%010d", contReg);
        GravaArquivo.gravaRegistro(nomeArq,trailer);
        clientezinho += String.format("%s%n",trailer);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition",
                "attachment; filename= cliente.txt "
        );
        return new ResponseEntity(clientezinho ,headers, HttpStatus.OK);

    }
    @PostMapping("/importacoes")
    public void importar(@RequestBody byte[] txt){
        String doc = new String(txt);
        List<Usuario> usuarios = new ArrayList<>();
        String[] linha = doc.split("\n");
        for (int i = 0; i < linha.length; i++){
            String line = linha[i];
            System.out.println(line);
            if (line.indexOf("02")==0){
                Usuario cliente = new Usuario();
                cliente.setId(Integer.valueOf(line.substring(1,2)));
                cliente.setNome(line.substring(3,9));
                cliente.setEmail(line.substring(10,25));
                cliente.setDataNascimento(line.substring(26,35));
                repository.save(cliente);
            }
        }

    }
}
