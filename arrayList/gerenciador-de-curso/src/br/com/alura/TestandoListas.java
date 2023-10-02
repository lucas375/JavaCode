package br.com.alura;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
        String aula1 = "conhecendo mais de listas";
        String aula2 = " modelando a classee aula";
        String aula3 = " Trabalhando com Cursos e sets";


        ArrayList<String> aulas = new ArrayList<>();

        // add -> adiciona na lista
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        System.out.println(aulas);

        // remove pelo index
        aulas.remove(0);
        System.out.println(aulas);


        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0);
        System.out.println("A primeira aula  é " + primeiraAula);


        //percorrer lista pleo indice
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("Aula : " + aulas.get(i));
        }

        //lambdas forma mais BONITA de percorrer uma lista
        aulas.forEach(aula -> {
            System.out.println("Percorendo");
            System.out.println("Aula: " + aula);
        });

        //Collection para ordenar a lista
        aulas.add("Aumentando nosso conhecimento ");
        Collections.sort(aulas);
        System.out.println(aulas);
    }
}
