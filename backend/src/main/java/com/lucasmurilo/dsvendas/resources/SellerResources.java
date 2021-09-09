package com.lucasmurilo.dsvendas.resources;

import com.lucasmurilo.dsvendas.dto.SellerDTO;
import com.lucasmurilo.dsvendas.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sellers")
public class SellerResources {

    @Autowired
    private SellerService service;

    @GetMapping
    public ResponseEntity<List<SellerDTO>> findAll(){
        List<SellerDTO> listDTO = service.findAll();
        return ResponseEntity.ok().body(listDTO);
    }
}
