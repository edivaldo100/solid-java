package org.example.pt_br.dip_principio_inversao_dependencia.solucao;

import org.example.pt_br.dip_principio_inversao_dependencia.violacao.ConexaoOracle;
import org.example.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;

/**
 * DIP SOLUÇÃO
 */
public class OracleRepository implements IBancoDadosRepository {

    public boolean salvar(Pedido pedido) {
        ConexaoOracle dbConnection = new ConexaoOracle("database.url");

        try {
            dbConnection.salvar(pedido);
        } catch (Exception e) {
            // log
            return false;
        }

        return true;
    }

}
