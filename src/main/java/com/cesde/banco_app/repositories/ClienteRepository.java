package com.cesde.banco_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesde.banco_app.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
