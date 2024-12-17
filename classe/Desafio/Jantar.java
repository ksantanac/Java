package classe.Desafio;

public class Jantar {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Lorenzo", 30);
        
        Comida c1 = new Comida("Arroz", 0.500);
        Comida c2 = new Comida("Feijão", 0.834);
        
        System.out.println(p1.apresentar());
        p1.comer(c1);
        
        System.out.println(p1.apresentar());
        p1.comer(c2);
        
        System.out.println(p1.apresentar());
    }

}
