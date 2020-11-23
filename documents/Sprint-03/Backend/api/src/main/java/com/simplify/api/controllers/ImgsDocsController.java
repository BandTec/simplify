package com.simplify.api.controllers;

import com.google.cloud.storage.*;
import com.simplify.api.entities.ImgsDocs;
import com.simplify.api.repositories.ImgsDocsRepository;
import com.simplify.api.repositories.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public class ImgsDocsController {

    @Autowired
    private ImgsDocsRepository documentosRepository;

    @Autowired
    private SolicitacaoRepository solicitacaoRepository;


    //Importação
    @PostMapping("/documentos/{idSolicitacao}")
    public ResponseEntity documentos(@PathVariable Integer idSolicitacao, @RequestParam("file") MultipartFile file, @RequestParam(value = "tipoDoc", required = true) String tipoDoc) throws IOException {
        System.out.println("Id da solicitacão: " + idSolicitacao);
        System.out.println("Arquivo upload: " + file.getOriginalFilename());
        Storage storage = StorageOptions.getDefaultInstance().getService();
        Blob uploadFile = storage.create(BlobInfo.newBuilder("upload-files-simplify", file.getOriginalFilename()).build(), file.getBytes());
        //Todos users podem ver;
        uploadFile.createAcl(Acl.of(Acl.User.ofAllUsers(), Acl.Role.READER));
        //Nome do arquivo;
        String blobId = uploadFile.getBlobId().getName();
        System.out.println("BlobID: " + blobId);
        ImgsDocs novoDoc = new ImgsDocs();
        novoDoc.setTipoDocumento(tipoDoc);
        novoDoc.setSolicitacao(null);
        novoDoc.setUrlUpload(uploadFile.getMediaLink());
        documentosRepository.save(novoDoc);

        return ResponseEntity.noContent().build();
    }

}