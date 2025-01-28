package generics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {
        // Double
        CaixaOjeto caixaA = new CaixaOjeto();
        caixaA.aguardar(2.3);
        
        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);

        // String
        CaixaOjeto caixaB = new CaixaOjeto();
        caixaB.aguardar("Olá");

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);
    }
    
}
