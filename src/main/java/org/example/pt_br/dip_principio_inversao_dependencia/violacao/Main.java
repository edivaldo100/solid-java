package org.example.pt_br.dip_principio_inversao_dependencia.violacao;

import org.example.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;

/**
 * DIP VIOLAÇÃO
 */
public class Main {
    
    public static void main(String[] args) {
        
        ProcessaPedido processaPedido = new ProcessaPedido();

        processaPedido.processar(new Pedido());

    }

}
