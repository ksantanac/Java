package Controle;

import javax.swing.*;

public class ElseIf {
    public static void main(String[] args) {

        String valor = JOptionPane.showInputDialog("Informe o número: ");
        int numero = Integer.parseInt(valor);

        if (numero >= 7) {
            System.out.println("Aprovado.");
        } else if (numero >= 5) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        };
    }
}
