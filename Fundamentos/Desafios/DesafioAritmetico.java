package Fundamentos.Desafios;

public class DesafioAritmetico {
    public static void main(String[] args) {

        int eq1 = (int) Math.pow(6 * (3 + 2), 2) / (3 * 2);
        int eq2 = (int) Math.pow((1- 5) * (2 - 7) / 2, 2);

        int eqs = (int) Math.pow((eq1 - eq2), 3);
        int divisor = (int) Math.pow(10, 3);
        int resultado = eqs / divisor;

        System.out.println(eq1);
        System.out.println(eq2);

        System.out.println(resultado);

    }
}
