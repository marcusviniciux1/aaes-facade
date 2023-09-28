package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarPendenciaEstoquePedido() {
        Pedido pedido = new Pedido();
        Estoque.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.processar());
    }

    @Test
    void deveRetornarPendenciaPagamentoPedido() {
        Pedido pedido = new Pedido();
        Pagamento.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.processar());
    }

    @Test
    void deveRetornarPedidoSemPendencia() {
        Pedido pedido = new Pedido();

        assertEquals(true, pedido.processar());
    }

}