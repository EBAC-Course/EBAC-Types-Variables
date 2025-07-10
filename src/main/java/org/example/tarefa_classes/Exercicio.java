package org.example.tarefa_classes;

public class Exercicio {
    public static void main(String[] args) {
        Professor professorDeMath = new Professor();
        professorDeMath.setEspecialidade("Matematica");
        professorDeMath.setNome("Rafael");
        professorDeMath.setGenero("m");

        System.out.println(professorDeMath.sumarioProfessor());
    }
}
