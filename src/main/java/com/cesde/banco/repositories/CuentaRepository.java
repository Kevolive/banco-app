package com.cesde.banco.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cesde.banco.models.Cuenta;


public interface CuentaRepository extends JpaRepository<Cuenta, Long> {

}
