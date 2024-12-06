package Controle.Desafios;

import javax.swing.*;

public class DesafioDiaSemana {

    public static void main(String[] args) {

        String diaSemana = JOptionPane.showInputDialog("Digite o dia da semana: ");

        if (diaSemana.equalsIgnoreCase("Domingo")) {
            System.out.println(1);
        } else if (diaSemana.equalsIgnoreCase("Segunda")) {
            System.out.println(2);
        } else if (diaSemana.equalsIgnoreCase("Terça")) {
            System.out.println(3);
        } else if (diaSemana.equalsIgnoreCase("Quarta")) {
            System.out.println(4);
        } else if (diaSemana.equalsIgnoreCase("Quinta")) {
            System.out.println(5);
        } else if (diaSemana.equalsIgnoreCase("Sexta")) {
            System.out.println(6);
        } else if (diaSemana.equalsIgnoreCase("Sabado")) {
            System.out.println(7);
        } else {
            System.out.println("Valor digitado não reconhecido no sistema.");
        }

        // =============================================================
        // COM SWITCH CASE

//        String diaSemana = JOptionPane.showInputDialog("Digite o dia da semana: ").toLowerCase();
//
//        switch (diaSemana) {
//            case "domingo" -> System.out.println(1);
//            case "segunda" -> System.out.println(2);
//            case "terça", "terca" -> System.out.println(3); // Aceita ambas as grafias
//            case "quarta" -> System.out.println(4);
//            case "quinta" -> System.out.println(5);
//            case "sexta" -> System.out.println(6);
//            case "sábado", "sabado" -> System.out.println(7); // Aceita ambas as grafias
//            default -> System.out.println("Valor digitado não reconhecido no sistema.");
    }
}

