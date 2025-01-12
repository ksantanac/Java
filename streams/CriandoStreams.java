package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        // Um Consumer que imprime Strings no console
        Consumer<String> print = System.out::print;

        // Um Consumer que imprime Integers no console com quebra de linha
        Consumer<Integer> println = System.out::println;

        // Cria uma Stream de Strings usando Stream.of
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        // Aplica o método forEach para imprimir cada elemento da Stream
        langs.forEach(print);

        // Um array de Strings contendo mais linguagens
        String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };

        // Cria uma Stream a partir do array e imprime os elementos
        Stream.of(maisLangs).forEach(print);

        // Outra forma de criar uma Stream a partir de um array com Arrays.stream
        Arrays.stream(maisLangs).forEach(print);

        // Cria uma Stream a partir de uma fatia do array (índices 1 a 2, exclusivo do último índice)
        Arrays.stream(maisLangs, 1, 2).forEach(print);

        // Cria uma lista de Strings com linguagens
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");

        // Cria uma Stream a partir da lista e imprime os elementos
        outrasLangs.stream().forEach(print);

        // Cria uma Stream paralela a partir da lista e imprime os elementos
        // (a ordem de saída pode ser diferente devido à execução paralela)
        outrasLangs.parallelStream().forEach(print);

        // Stream.generate(() -> "a").forEach(print);
        // Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
