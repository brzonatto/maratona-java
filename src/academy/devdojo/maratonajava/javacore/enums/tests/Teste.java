package academy.devdojo.maratonajava.javacore.enums.tests;

import academy.devdojo.maratonajava.javacore.enums.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.enums.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.enums.dominio.TipoPagamento;

public class Teste {
    public static void main(String[] args) {
       Cliente c1 = new Cliente("João", TipoCliente.PESSOA_FISICA, TipoPagamento.CARTAO_CREDITO);
       Cliente c2 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CARTAO_DEBITO);
        
        System.out.println(c1);
        System.out.println(c2);

        var tipoCliente = TipoCliente.tipoClientePorDescricao("Pessoa Física");
        System.out.println(tipoCliente);
    }
}
