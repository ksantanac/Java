package classe;

public class Produto {

    String nome;
    double preco;
    double desconto;

    Produto() {

    };

    Produto(String nomeInicial) {
        nome = nomeInicial;
    };

    Produto(String nomeInicial, double precoInicial, double descontoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
        desconto = descontoInicial;
    };

    // Metodos
    double precoComDesconto(){
        return preco - (preco * desconto);
    };

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    };
}
