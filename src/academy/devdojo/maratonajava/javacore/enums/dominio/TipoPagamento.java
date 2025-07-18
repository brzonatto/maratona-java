package academy.devdojo.maratonajava.javacore.enums.dominio;

public enum TipoPagamento {
        CARTAO_DEBITO(1, "Cartão de Débito") {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.01;
            }
        },
        CARTAO_CREDITO(2, "Cartão de Crédito") {
            @Override
            public double calcularDesconto(double valor) {
                return valor * 0.05;
            }
        };

    public final int VALOR;
    public final String DESCRICAO;

    TipoPagamento(int valor, String descricao) {
        this.VALOR = valor;
        this.DESCRICAO = descricao;
    }

    public abstract double calcularDesconto(double valor);
}
