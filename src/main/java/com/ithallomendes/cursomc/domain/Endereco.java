package com.ithallomendes.cursomc.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Endereco implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;

    @OneToMany
    private Cliente cliente;
}
