package org.example.loop;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada: ");
        int num = s.nextInt();
        for ( int i = 0; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + num*i);
        }
    }
}
