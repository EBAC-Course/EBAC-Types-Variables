package org.example.loop;

import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Deseja gerar a tabuada de algum número? ");
        String resposta = s.next();

        while(resposta.equals("Sim")) {
            System.out.print("Digite um número para gerar a tabuada: ");
            int num = s.nextInt();
            for ( int i = 0; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + num*i);
            }

            System.out.println("Deseja gerar novamente a tabuada de algum número ?");
            resposta = s.next();
        }

        System.out.println("Obrigado");
    }
}
