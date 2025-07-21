package com.company.varnaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.varnaa.entity.invoice;

public interface invoiceRepository extends JpaRepository<invoice,Integer> {

}