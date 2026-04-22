package br.com.fiap.bean;

import javax.swing.*;

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
    public void calcularArea ( float lado){
        setLado(lado);
        float area = this.lado * this.lado;
        JOptionPane.showMessageDialog(null, String.format("Área do QUADRADO: %.2f", area));
    }
    public void calcularArea ( float lado, float altura){
        setLado(lado);
        setAltura(altura);
        float area = this.lado * this.altura;
        JOptionPane.showMessageDialog(null, String.format("Área do RETÂNGULO: %.2f", area));
    }
}
