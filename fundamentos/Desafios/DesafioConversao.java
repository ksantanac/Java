package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro salário: ");
        String sal1 = entrada.next().replace(",", ".");

        System.out.println("Digite o segundo salário: ");
        String sal2 = entrada.next().replace(",", ".");

        System.out.println("Digite o terceiro salário: ");
        String sal3 = entrada.next().replace(",", ".");

        double n1 = Double.parseDouble(sal1);
        double n2 = Double.parseDouble(sal2);
        double n3 = Double.parseDouble(sal3);

        double media = (n1 + n2 + n3) / 3;

        System.out.println("Média de salário: " + media);

        entrada.close();
    }
}
