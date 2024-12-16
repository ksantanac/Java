package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto = 0.25;

    Produto(String perfume, int i) {

    };

    Produto(String nomeInicial, double precoInicial) {
        nome = nomeInicial;
        preco = precoInicial;
    };

    // Metodos
    double precoComDesconto(){
        return preco * (1 - desconto);
    };

    double precoComDesconto(double descontoDoGerente) {
        return preco * (1 - desconto + descontoDoGerente);
    };
}
