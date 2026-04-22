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
                switch (opcao){
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Dígite o valor do lado: ");
                        lado = Float.parseFloat(auxiliar);
                        geo1.calcularArea(lado);
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Dígite o valor do lado: ");
                        lado = Float.parseFloat(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Dígite o valor da altura");
                        altura = Float.parseFloat(auxiliar);
                        geo1.calcularArea(lado);
                        break;
                    case 3:
                        auxiliar = JOptionPane.showInputDialog("Dígite o valor do raio: ");
                        raio = Double.parseDouble(auxiliar);
                        geo1.calcularArea(raio);
                        break;
                    default:
                        throw new Exception("Escolha incorreta!!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa, Volte sempre!!");
    }
}
