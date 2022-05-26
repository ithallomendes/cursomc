package com.ithallomendes.cursomc.repositories;

import com.ithallomendes.cursomc.domain.Categoria;
import com.ithallomendes.cursomc.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
