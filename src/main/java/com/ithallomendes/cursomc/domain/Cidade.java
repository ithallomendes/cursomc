package com.ithallomendes.cursomc.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cidade implements Serializable {
    private Integer id;
    private String nome;
    private List<Cidade> cidades = new ArrayList<>();

    public Cidade() {
    }

    public Cidade(Integer id, String nome, List<Cidade> cidades) {
        this.id = id;
        this.nome = nome;
        this.cidades = cidades;
    }
}
