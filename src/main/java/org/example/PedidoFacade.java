package org.example;

public class PedidoFacade {

    public static boolean verificarPendenciasProcessamento(Pedido pedido) {
        if (Estoque.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        if (Pagamento.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        return true;
    }
}