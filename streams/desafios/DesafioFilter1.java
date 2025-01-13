package streams.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class DesafioFilter1 {

    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 3500.00, 0.15, 50.00);
        Produto p2 = new Produto("Smartphone", 2500.00, 0.10, 20.00);
        Produto p3 = new Produto("Monitor", 1200.00, 0.05, 30.00);
        Produto p4 = new Produto("Teclado", 200.00, 0.40, 0.00);
        Produto p5 = new Produto("Mouse", 150.00, 0.25, 5.00);
        Produto p6 = new Produto("Fone de Ouvido", 300.00, 0.10, 15.00);
        Produto p7 = new Produto("Webcam", 400.00, 0.50, 0.00);
        Produto p8 = new Produto("Impressora", 800.00, 0.08, 25.00);
        Produto p9 = new Produto("Tablet", 1500.00, 0.90, 0.00);
        Produto p10 = new Produto("HD Externo", 500.00, 0.78, 0.00);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

        // 1° Filtro -> Produtos com desconto > 30
        Predicate<Produto> desconto = d -> d.desconto > 0.30;

        // 2° Filtro -> Produtos com frete > gratis
        Predicate<Produto> freteGratis = f -> f.frete == 0.00;

        // Formatação de promoção
        Function<Produto, String> promocao =
                p -> "Produto " + p.nome + " com " + String.valueOf(p.desconto * 100).substring(0, 2)
                        + "% de desconto e frete gratis!!";

        produtos.stream()
                .filter(desconto)
                .filter(freteGratis)
                .map(promocao)
                .forEach(System.out::println);

    }

}
