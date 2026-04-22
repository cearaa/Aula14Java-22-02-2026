package br.com.fiap.main;

import br.com.fiap.bean.ExAdicao;

import javax.swing.*;

public class MainAd {
    public static void main(String[] args) {
        ExAdicao adi1 = new ExAdicao();
        String auxiliar, escolha = "sim";
        int opcao, numInt1, numInt2;
        double numReal1, numReal2;
        while (escolha.equalsIgnoreCase("sim")){
            try {
                auxiliar = JOptionPane.showInputDialog("Qual tipo de soma deseja calcular? \n1. Números inteiros \n2. Números reais");
                opcao = Integer.parseInt(auxiliar);
                switch (opcao){
                    case 1:
                        auxiliar = JOptionPane.showInputDialog("Dígite um número inteiro: ");
                        numInt1 = Integer.parseInt(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Dígite outro número inteiro: ");
                        numInt2 = Integer.parseInt(auxiliar);
                        adi1.somar(numInt1, numInt2);
                        break;
                    case 2:
                        auxiliar = JOptionPane.showInputDialog("Dígite um número real: ");
                        numReal1 = Double.parseDouble(auxiliar);
                        auxiliar = JOptionPane.showInputDialog("Dígite outro número real: ");
                        numReal2 = Double.parseDouble(auxiliar);
                        adi1.somar(numReal1, numReal2);
                        break;
                    default:
                        throw new Exception("Escolha Incorreta!!");
                }
                escolha = JOptionPane.showInputDialog("Deseja continuar?");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        JOptionPane.showMessageDialog(null, "Fim de Programa, Volte sempre!!");
    }
}
