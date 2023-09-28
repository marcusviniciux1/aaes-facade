package org.example;

public class Pedido {

    public boolean processar() {
        return PedidoFacade.verificarPendenciasProcessamento(this);
    }
}