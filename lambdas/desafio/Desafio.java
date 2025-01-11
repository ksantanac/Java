package lambdas.desafio;

import lambdas.Produto;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Produto p = new Produto("IPad", 3235.893232, 0.13);
        
        // Preco com desconto
        BiFunction<Double, Double, Double> precoComDesconto =
            (preco, desconto) -> preco * (1 - desconto);
        double precoComDescontoFinal = precoComDesconto.apply(p.preco, p.desconto);
        
        // Imposto Municipal
        BiFunction<Double, Double, Double> impostoMunicipal =
                (preco, imposto) -> preco >= 2500 ? (preco + (preco * imposto)) : preco;
        double precoComImposto = impostoMunicipal.apply(precoComDescontoFinal, 0.085);
        
        // Frete
        UnaryOperator<Double> frete = preco -> preco >= 3000 ? (preco + 100) : (preco + 50);
        double precoFinalComFrete = frete.apply(precoComImposto);

        // Formatacao 2 casas decimais
        Function<Double, String> formatValor =
                preco -> "O preço final é R$" + String.format("%.2f", preco).replace('.', ',');

        // Exibindo o preço final formatado
        System.out.println(formatValor.apply(precoFinalComFrete)); // Exibe o preço final com formatação

    }
}
