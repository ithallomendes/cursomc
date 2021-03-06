package com.ithallomendes.cursomc.services;

import com.ithallomendes.cursomc.domain.Categoria;
import com.ithallomendes.cursomc.repositories.CategoriaRepository;
import com.ithallomendes.cursomc.services.exceptions.ObjNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository repo;

    public Categoria buscar(Integer id) {
        Optional<Categoria> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjNotFoundException(
                "Objeto não encontrado! ID:" + id + ", Tipo" + Categoria.class.getName()));
    }
}
