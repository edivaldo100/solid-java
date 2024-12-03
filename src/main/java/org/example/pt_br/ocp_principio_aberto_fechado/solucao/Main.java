package org.example.pt_br.ocp_principio_aberto_fechado.solucao;
import org.example.pt_br.srp_principio_responsabilidade_unica.violacao.Pedido;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Exemplo processar
        ProcessaPedidoComAlteracaoRequerida processor = new ProcessaPedidoComAlteracaoRequerida();
        Pedido pedido = new Pedido();
        ArrayList<String> objects = new ArrayList<String>(2);
        objects.add("item 1 ");objects.add("item 2");
        pedido.setItens(objects);
        processor.processar(pedido);

    }

}
