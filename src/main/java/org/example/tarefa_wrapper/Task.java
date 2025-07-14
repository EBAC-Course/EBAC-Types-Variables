package org.example.tarefa_wrapper;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor numérico (inteiro por favor): ");
        int numero = scanner.nextInt();

        // não precisa do casting, só to colocando porque quero.
        Integer wrapperType = (Integer) numero;

        System.out.println("Sua variável convertida para o wrapper dela: " + wrapperType);
    }
}
