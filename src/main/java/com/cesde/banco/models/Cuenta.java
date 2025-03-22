package com.cesde.banco.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "cuentas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cuenta {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private String numeroCuenta;
private Double Saldo;

@ManyToOne
@JoinColumn(name = "cliente_id")
private Cliente cliente;
    
}