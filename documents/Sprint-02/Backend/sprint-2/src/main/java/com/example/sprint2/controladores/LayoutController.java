package com.example.sprint2.controladores;

import com.example.sprint2.GravaArquivo;
import com.example.sprint2.dominios.ListaObj;
import com.example.sprint2.entity.Cliente;
import com.example.sprint2.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.List;

@RestController
@RequestMapping("/layout")
public class LayoutController {
    @Autowired
    private UsuarioRepository repository;

    int tam = 7;
    ListaObj<Cliente> listaExportar = new ListaObj<>(tam);
    Date dataDeHoje = new Date();
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");


    @GetMapping(value = "download", produces = {"app/txt"})
    public ResponseEntity download(){
        FileWriter arquivo;
        Formatter exit = null;
        List<Cliente> clientes = repository.findAll();
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
                Cliente c = listaExportar.getElemento(i);

                //corpo
                if ( i<1){
                    body += "02";

                } else {
                    body = "02";

                }
                body+= String.format("%-45s",c.getNome());
                body+= String.format("%-35s",c.getEmail());
                body+= String.format("%-15s",c.getTelefone());
                body+= String.format("%-13s",c.getCpf());
                body+= String.format("%-9s",c.getRg());
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



}}
