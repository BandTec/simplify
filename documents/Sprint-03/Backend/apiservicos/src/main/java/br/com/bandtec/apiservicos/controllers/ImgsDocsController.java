package br.com.bandtec.apiservicos.controllers;

import br.com.bandtec.apiservicos.entities.ImgsDocs;
import br.com.bandtec.apiservicos.repositories.ImgsDocsRepository;
import br.com.bandtec.apiservicos.repositories.SolicitacaoRepository;
import com.google.cloud.storage.Acl;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import com.google.common.base.Utf8;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import com.google.api.client.json.jackson2.JacksonFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

@RestController
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
        Blob uploadFile = storage.create(BlobInfo.newBuilder("upload-files-simplify-01", file.getOriginalFilename()).build(), file.getBytes());
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
