package br.com.alura;

public class Aula implements  Comparable<Aula>{

    private String titulo;
    private int temp;

    public Aula(String titulo, int temp) {
        this.titulo = titulo;
        this.temp =  temp;

    }

    public int getTemp() {
        return temp;
    }

    public String getTitulo() {
        return titulo;
    }


    @Override
    public String toString() {
        return "Aula: " + this.titulo + ", " + this.temp + "minutos";
    }

    @Override
    public int compareTo(Aula outraAula) {
       return this.titulo.compareTo(outraAula.titulo);
    }
}
