package academy.devdojo.maratonajava.javacore.enums.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    public final String DESCRICAO;

    TipoCliente(int tipo, String descricao) {
        this.VALOR = tipo;
        this.DESCRICAO = descricao;
    }

    public static TipoCliente tipoClientePorDescricao(String descricao) {
        for (TipoCliente tipo : values()) {
            if (tipo.DESCRICAO.equals(descricao)) {
                return tipo;
            }
        }
        return null;
    }
}
