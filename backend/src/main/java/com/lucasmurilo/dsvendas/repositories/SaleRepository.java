package com.lucasmurilo.dsvendas.repositories;

import com.lucasmurilo.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
