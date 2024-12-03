package org.example.pt_br.srp_principio_responsabilidade_unica.solucao;

import org.example.pt_br.srp_principio_responsabilidade_unica.violacao.ConexaoPostgres;
import org.example.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;

/**
 * SRP SOLUÇÃO
 */
public class PostgresRepository {

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
