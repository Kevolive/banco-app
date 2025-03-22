package com.cesde.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesde.banco.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
