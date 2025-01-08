package oo.heranca.desafio;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    int velocidadeAtual;

    int velocidade = 50;
    private int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar() {
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }else {
            velocidade += getDelta();
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

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

}
