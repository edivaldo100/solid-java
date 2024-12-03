package org.example.pt_br.dip_principio_inversao_dependencia.solucao;

import org.example.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;

/**
 * DIP SOLUÇÃO
 */
public class Main {

    public static void main(String[] args) {

        PostgresRepository pgRepo = new PostgresRepository();
        OracleRepository oracleRepository = new OracleRepository();
        EnviarEmailConfirmacao sendMail = new EnviarEmailConfirmacao();

        Pedido pedido = new Pedido();

        ProcessaPedido orderProcessor = new ProcessaPedido(pgRepo, sendMail);

        orderProcessor.processar(pedido);
    }

}
