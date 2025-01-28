package generics;

public class CaixaObjetoTeste {

    public static void main(String[] args) {
        // Double
        CaixaObjeto caixaA = new CaixaObjeto();
        caixaA.guardar(2.3);
        
        Double coisa = (Double) caixaA.abrir();
        System.out.println(coisa);

        // String
        CaixaObjeto caixaB = new CaixaObjeto();
        caixaB.guardar("Olá");

        String coisaB = (String) caixaB.abrir();
        System.out.println(coisaB);
    }
    
}
