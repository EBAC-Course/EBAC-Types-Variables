package org.example;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.cadastrarEndereco("Rua Teste");
        cliente.setCodigo(1);
        cliente.setNome("Rafael");
        System.out.println(cliente.getEndereco());
        System.out.println(cliente.getCodigo());
        cliente.imprimirEndereco();
        System.out.println(cliente.retornarNomeCliente());
    }
}
