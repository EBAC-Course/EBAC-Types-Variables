package org.example.tarefa_classes;

public class Professor {

    private String nome;
    private String especialidade;
    private String genero;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getGenero() {
        return this.genero;
    }

    /*
    * Aceita valores m ou f
    * */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String sumarioProfessor() {

        if(this.genero == "m") {
            return this.nome + " é professor de: " + this.especialidade;
        } else if(this.genero == "f") {
            return this.nome + " é professora de: " + this.especialidade;
        } else {
            return this.nome + " é professor(a) de: " + this.especialidade;
        }

    }
}
