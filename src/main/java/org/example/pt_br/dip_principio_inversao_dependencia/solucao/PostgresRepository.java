package org.example.pt_br.dip_principio_inversao_dependencia.solucao;

import org.example.pt_br.srp_principio_responsabilidade_unica.violacao.ConexaoPostgres;
import org.example.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;

/**
 * DIP SOLUÇÃO
 */
public class PostgresRepository implements IBancoDadosRepository {

    public boolean salvar(Pedido pedido) {
        ConexaoPostgres dbConnection = new ConexaoPostgres("database.url");

        try {
            dbConnection.salvar(pedido);
        } catch (Exception e) {
            // log
            return false;
        }

        return true;
    }

}
