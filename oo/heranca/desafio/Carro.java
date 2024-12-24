package oo.heranca.desafio;

public class Carro {

    int velocidade = 50;

    void acelerar() {
        velocidade += 10;
    }

    void frear() {

        if (velocidade == 0) {
            System.out.println("Carro parado!");
            velocidade = 0;
        }else{
            velocidade -= 10;
        }


    }
}
