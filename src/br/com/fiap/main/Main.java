package br.com.fiap.main;

import br.com.fiap.bean.Geometria;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Geometria geo1 = new Geometria();
        String auxiliar, escolha = "sim";
        int opcao;
        float lado, altura;
        double raio;
        while (escolha.equalsIgnoreCase("sim")){
            try {
                auxiliar = JOptionPane.showInputDialog("Qual área deseja calcular? \n1. QUADRADO \n2. RETÂNGULO \n3. CÌRCULO");
                opcao = Integer.parseInt(auxiliar);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa");
    }
}
