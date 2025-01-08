package oo.heranca.desafio;

public class Automovel {

    public static void main(String[] args) {

        // Ferrari
        Ferrari ferrari = new Ferrari();
        ferrari.ligarTurbo();
        
        System.out.println("Velocidade Ferrari: " + ferrari.velocidade);
        ferrari.acelerar();
        System.out.println(ferrari.velocidadeDoAr());
        System.out.println("Velocidade Ferrari: " + ferrari.velocidade);

        // Civic
        Civic civic = new Civic(300);

        System.out.println("Velocidade Civic: " + civic.velocidade);
        civic.acelerar();
        System.out.println("Velocidade Civic: " + civic.velocidade);


    }
}
