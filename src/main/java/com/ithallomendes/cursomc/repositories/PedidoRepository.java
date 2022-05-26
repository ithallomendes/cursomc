package com.ithallomendes.cursomc.repositories;

import com.ithallomendes.cursomc.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
