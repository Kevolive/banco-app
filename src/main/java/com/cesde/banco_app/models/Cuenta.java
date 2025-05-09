package com.cesde.banco_app.models;

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
private Double saldo;

@ManyToOne
@JoinColumn(name = "cliente_id", nullable = false)
private Cliente cliente;
    
}