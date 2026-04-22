package br.com.fiap.bean;

public class Geometria {
    //Atributos
    private float lado;
    private float altura;
    private double raio;

    //Construtores ( Alt + insert )
    public Geometria(){
    }

    //Get/Set
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    //Métodos da classe
}
