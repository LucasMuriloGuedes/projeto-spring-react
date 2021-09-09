package com.lucasmurilo.dsvendas.services;

import com.lucasmurilo.dsvendas.dto.SaleDTO;
import com.lucasmurilo.dsvendas.dto.SaleSuccessDTO;
import com.lucasmurilo.dsvendas.dto.SaleSumDTO;
import com.lucasmurilo.dsvendas.entities.Sale;
import com.lucasmurilo.dsvendas.repositories.SaleRepository;
import com.lucasmurilo.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sellerRepository.findAll();
        Page<Sale> list = repository.findAll(pageable);
        return list.map(obj -> new SaleDTO(obj));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amoutGroupedBySeller(){
        return repository.amoutGroupedBySeller();

    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller(){
        return repository.successGroupedBySeller();
    }
}
