package com.ithallomendes.cursomc.repositories;

import com.ithallomendes.cursomc.domain.Cidade;
import com.ithallomendes.cursomc.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
