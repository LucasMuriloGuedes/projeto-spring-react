package com.lucasmurilo.dsvendas.repositories;

import com.lucasmurilo.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {
}
