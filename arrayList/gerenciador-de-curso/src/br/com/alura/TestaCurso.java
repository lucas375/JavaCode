package br.com.alura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso curso = new Curso("Dominando as colecoes do java ",  "LUCAS");
//      curso.getAulas().add(new Aula("Trabalahndo com ArrayList", 21));
        curso.adiciona(new Aula("Trabalhando com ArrayList", 21));
        System.out.println(curso.getAulas());





    }
}
