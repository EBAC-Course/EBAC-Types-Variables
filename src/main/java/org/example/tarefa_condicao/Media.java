package org.example.tarefa_condicao;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a sua primeira nota: ");
        int primeiraNota = s.nextInt();

        System.out.print("Digite a sua segunda nota: ");
        int segundaNota = s.nextInt();

        System.out.print("Digite a sua terceira nota: ");
        int terceiraNota = s.nextInt();

        System.out.print("Digite a sua quarta nota: ");
        int quartaNota = s.nextInt();

        float media = (float) (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        System.out.println("Sua média ficou em: " + media);
        if(media >= 7) {
            System.out.println("Parabens, você passou");
        } else if(media >= 5) {
            System.out.println("Você está de recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
