package com.ithallomendes.cursomc.domain;

import com.ithallomendes.cursomc.enums.TipoCliente;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String email;
    private String CpfOuCnpj;
    private TipoCliente tipo;

    private List<Endereco> enderecos = new ArrayList<>();

    private Set<String> telefones = new HashSet<>();
}
