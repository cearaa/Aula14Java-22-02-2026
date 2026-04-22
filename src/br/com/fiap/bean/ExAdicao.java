package br.com.fiap.bean;

import javax.swing.*;

public class ExAdicao {
    //Atributos
    private int numInt1;
    private int NumInt2;
    private double numReal1;
    private double numReal2;

    //Construtor vazio
    public ExAdicao(){
    }

    //Métodos getters e setters
    public int getNumInt1() {
        return numInt1;
    }
    public void setNumInt1(int numInt1) {
        this.numInt1 = numInt1;
    }
    public int getNumInt2() {
        return NumInt2;
    }
    public void setNumInt2(int numInt2) {
        NumInt2 = numInt2;
    }
    public double getNumReal1() {
        return numReal1;
    }
    public void setNumReal1(double numReal1) {
        this.numReal1 = numReal1;
    }
    public double getNumReal2() {
        return numReal2;
    }
    public void setNumReal2(double numReal2) {
        this.numReal2 = numReal2;
    }

    //Métodos da classe
    public void somar ( int numInt1, int numInt2){
        setNumInt1(numInt1);
        setNumInt2(numInt2);
        int soma = numInt1 + numInt2;
        JOptionPane.showMessageDialog(null, String.format("A soma dos dois números inteiros é: %d", soma ));
    }
    public void somar ( double numReal1, double numReal2){
        setNumReal1(numReal1);
        setNumReal2(numReal2);
        double soma = numReal1 + numReal2;
        JOptionPane.showMessageDialog(null, String.format("A soma dos dois números reais é: %.2f", soma));
    }
}
