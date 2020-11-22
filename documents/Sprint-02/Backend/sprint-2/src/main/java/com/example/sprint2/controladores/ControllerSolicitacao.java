//package com.example.sprint2.controladores;
//
//import com.example.sprint2.entity.Documentos;
//import com.example.sprint2.entity.Solicitacao;
//import com.example.sprint2.repositorios.DocumentosRepository;
//import com.example.sprint2.repositorios.SolicitacaoRepository;
//import com.google.cloud.storage.*;
//import com.google.common.base.Utf8;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.multipart.MultipartFile;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//
//@RestController
//@RequestMapping("/service")
//public class ControllerSolicitacao {
//
//    @Autowired
//    private SolicitacaoRepository solicitacaoRepository;
//
//    @Autowired
//    private DocumentosRepository documentosRepository;
//
//    //Serviços
//    @GetMapping
//    public ResponseEntity services(@RequestParam(required = true)  Boolean teste){
//
//        Integer tamanho = Math.toIntExact(solicitacaoRepository.count());
//
//        ArrayList<Iterable<Solicitacao>> solicitacaos = new ArrayList<>();
//
//        for(Integer i =0 ; i<tamanho;i++){
//            solicitacaos.add(solicitacaoRepository.findAll());
//        }
//
//        Iterator<Iterable<Solicitacao>> it = solicitacaos.iterator();
//
//        while (it.hasNext()){
//
//            for (Integer i=0; i< solicitacaoRepository.count();i++){
//                Solicitacao s = solicitacaoRepository.findById(i).get();
//                if (!teste.equals(s.isPresencial())){
//                    it.remove();
//                    return ResponseEntity.ok().body(it);
//                } else{
//                    return ResponseEntity.ok().body(it);
//                }
//            }
//        }
//        return ResponseEntity.ok().body("foi");
//    }
//
//    @PostMapping("/documentos/{idSolicitacao}")
//    public ResponseEntity documentos(@PathVariable Integer idSolicitacao, @RequestParam("file") MultipartFile file, @RequestParam(value = "tipoDoc", required = true) String tipoDoc) throws IOException {
//        System.out.println("Id da solicitacão: " + idSolicitacao);
//        System.out.println("Arquivo upload: " + file.getOriginalFilename());
//        Storage storage = StorageOptions.getDefaultInstance().getService();
//        Blob uploadFile = storage.create(BlobInfo.newBuilder("upload-files-simplify", file.getOriginalFilename()).build(), file.getBytes());
//        //Todos users podem ver;
//        uploadFile.createAcl(Acl.of(Acl.User.ofAllUsers(), Acl.Role.READER));
//        //Nome do arquivo;
//        String blobId = uploadFile.getBlobId().getName();
//        System.out.println("BlobID: " + blobId);
//        Documentos novoDoc = new Documentos();
//        novoDoc.setTipoDocumento(tipoDoc);
//        novoDoc.setSolicitacao(null);
//        novoDoc.setUrlUpload(uploadFile.getMediaLink());
//        documentosRepository.save(novoDoc);
//
//        return ResponseEntity.noContent().build();
//    }
//}