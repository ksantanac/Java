package lambdas.desafio;

import lambdas.Produto;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioProfessor {

    public static void main(String[] args) {

        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
        UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
        UnaryOperator<Double> frete = preco -> preco >= 300 ? preco + 100 : preco + 50;
        Function<Double, String> formatValor =
                preco -> "O preço final é R$" + String.format("%.2f", preco).replace('.', ',');

        Produto p = new Produto("IPad", 3235.893232, 0.13);
        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(frete)
                .andThen(formatValor)
                .apply(p);
        
        System.out.println(preco);

    }
}
