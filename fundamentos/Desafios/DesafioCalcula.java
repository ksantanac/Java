package fundamentos.Desafios;

import java.util.Scanner;

public class DesafioCalcula {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        var num1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        var num2 = entrada.nextDouble();

        System.out.println("Escolha a operação: (+, -, /, *, %)");
        var operacao = entrada.next();

        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 + num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
        entrada.close();

    }
}
