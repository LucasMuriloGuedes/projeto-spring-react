package com.lucasmurilo.dsvendas.services;

import com.lucasmurilo.dsvendas.dto.SellerDTO;
import com.lucasmurilo.dsvendas.entities.Seller;
import com.lucasmurilo.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll(){
        List<Seller> list = repository.findAll();
        return list.stream().map(obj -> new SellerDTO(obj)).collect(Collectors.toList());
    }
    
}
