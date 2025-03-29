package com.fiap.arquitetura.cp1.repository;

import com.fiap.arquitetura.cp1.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long>  {

}
