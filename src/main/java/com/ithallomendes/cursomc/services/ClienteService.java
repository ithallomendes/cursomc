package com.ithallomendes.cursomc.services;

import com.ithallomendes.cursomc.domain.Cliente;
import com.ithallomendes.cursomc.repositories.ClienteRepository;
import com.ithallomendes.cursomc.services.exceptions.ObjNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repo;

    public Cliente buscar(Integer id) {
        Optional<Cliente> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjNotFoundException(
                "Objeto não encontrado! ID:" + id + ", Tipo" + Cliente.class.getName()));
    }
}
