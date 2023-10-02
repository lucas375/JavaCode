package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteCurso2 {
    public static void main(String[] args) {
        Curso curso = new Curso("Dominando as colecoes do java ",  "LUCAS");
//

        curso.adiciona(new Aula("Trabalhando com ArrayList", 10));
        curso.adiciona(new Aula("Criando uma aula", 20));
        curso.adiciona(new Aula("Modelando uma aula", 12));
        curso.adiciona(new Aula("Aula da aula ", 13));

        List<Aula> aulasImutaveis = curso.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(curso.getTempoTotal());

        System.out.println(curso );
    }


}
