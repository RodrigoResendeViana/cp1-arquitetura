package com.fiap.arquitetura.cp1.service;

import com.fiap.arquitetura.cp1.model.Pedido;
import com.fiap.arquitetura.cp1.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

	@Autowired
    private PedidoRepository pedidoRepository;

    public List<Pedido>listarTodos() {
        return pedidoRepository.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return pedidoRepository.findById(id);
    }

    public Pedido salvar(Pedido pedido) {
    	if(pedido.getValorTotal() < 0) {
    		throw new Error("Insira um valor maior que 0");
    	}
        if(pedido.getClienteNome().isEmpty()) {
            throw new Error("Insira um valor maior que 0");
        }

        return pedidoRepository.save(pedido);
    }

    public void deletar(Long id) {
        pedidoRepository.deleteById(id);
    }
}
