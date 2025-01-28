package generics;

public class CaixaNumeroTeste {

    public static void main(String[] args) {

        CaixaNumero<Double> caixaA = new CaixaNumero();
        caixaA.guardar(3.345);
        System.out.println(caixaA.abrir());
    }
}
