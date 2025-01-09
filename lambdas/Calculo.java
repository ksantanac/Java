package lambdas;

@FunctionalInterface // Para a interface ter apenas 1 metodo/função
public interface Calculo {

    double executar(double a, double b);
}
