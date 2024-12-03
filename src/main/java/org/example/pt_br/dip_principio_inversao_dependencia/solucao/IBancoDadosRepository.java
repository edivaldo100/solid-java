package org.example.pt_br.dip_principio_inversao_dependencia.solucao;

import org.example.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;

/**
 * DIP SOLUÇÃO
 */
public interface IBancoDadosRepository {
    
    boolean salvar(Pedido pedido);

}
