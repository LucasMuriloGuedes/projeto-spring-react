package com.lucasmurilo.dsvendas.resources;

import com.lucasmurilo.dsvendas.dto.SaleDTO;
import com.lucasmurilo.dsvendas.dto.SaleSuccessDTO;
import com.lucasmurilo.dsvendas.dto.SaleSumDTO;
import com.lucasmurilo.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sales")
public class SaleResource {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        Page<SaleDTO> list = service.findAll(pageable);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/sum-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amoutGroupedBySeller(Pageable pageable){
        List<SaleSumDTO> list = service.amoutGroupedBySeller();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(Pageable pageable){
        List<SaleSuccessDTO> list = service.successGroupedBySeller();
        return ResponseEntity.ok().body(list);
    }
}
