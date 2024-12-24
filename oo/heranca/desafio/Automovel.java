package oo.heranca.desafio;

public class Automovel {

    public static void main(String[] args) {

        // Ferrari
        Ferrari ferrari = new Ferrari();
        
        System.out.println("Velocidade Ferrari: " + ferrari.velocidade);
        ferrari.acelerar();
        System.out.println("Velocidade Ferrari: " + ferrari.velocidade);

        // Civic
        Civic civic = new Civic();

        System.out.println("Velocidade Civic: " + civic.velocidade);
        civic.acelerar();
        System.out.println("Velocidade Civic: " + civic.velocidade);


    }
}
