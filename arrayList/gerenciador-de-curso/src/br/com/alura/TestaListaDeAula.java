package br.com.alura;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

    public static void main(String[] args) {
        Aula a1 = new Aula("Revisando as AarrayLists ", 40);
        Aula a2 = new Aula("listas de objetos ", 22);
        Aula a3= new Aula("Relacionamento de listas e objetos ", 30);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);



        System.out.println(aulas);

        // como ordernar por um obejto ordenando por ordem alfabetica
        Collections.sort(aulas);
        System.out.println(aulas);


        //Collections.sort(aulas, Comparator.comparing(Aula::getTemp));
        aulas.sort(Aula::compareTo);
        System.out.println("\n COMPARANDO PELO TEMPO DE AULA");
        System.out.println(aulas);
    }
}
