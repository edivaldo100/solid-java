package org.example.pt_br.ocp_principio_aberto_fechado.solucao;

import org.example.pt_br.srp_principio_responsabilidade_unica.solucao.ProcessaPedido;
import org.example.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;

/**
 * OCP SOLUÇÃO
 */
public class ProcessaPedidoComAlteracaoRequerida extends ProcessaPedido {
    
    public void processar(Pedido pedido) {
        // Antes do processamento
        if (!pedido.possuiItens()) {
            throw new RuntimeException("Não é possível continuar! Pedido sem itens.");
        }
        
        super.processar(pedido);

        // Depois do processamento
        if (!pedido.isValid()) {
            throw new RuntimeException("Não é possível continuar! Pedido sem Id");
        }

    }

}
