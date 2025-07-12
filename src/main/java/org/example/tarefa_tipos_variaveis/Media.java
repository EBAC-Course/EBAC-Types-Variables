package org.example.tarefa_tipos_variaveis;

public class Media {

    public static void main(String[] args) {
        mediaSimples();
    }

    public static void mediaSimples() {
        int nota1 = 4;
        int nota2 = 2;
        int nota3 = 10;
        int nota4 = 9;

        double media = (double) (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println(media);
    }
}
