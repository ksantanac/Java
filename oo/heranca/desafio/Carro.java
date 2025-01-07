package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;

    int velocidade = 50;
    int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            velocidade += delta;
        }


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
