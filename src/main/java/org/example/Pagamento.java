package org.example;

public class Pagamento extends Setor {

    private static Pagamento pagamento = new Pagamento();

    private Pagamento() {};

    public static Pagamento getInstancia() {
        return pagamento;
    }
}