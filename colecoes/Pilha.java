package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        // Ultimo a entrar é o primeiro a sair.
        Deque<String> livros = new ArrayDeque<>();

        livros.add("Pequeno Principe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        // Get
        livros.peek();
        livros.element();

        // Remove
        livros.poll();
        livros.remove();
        livros.pop();


    }
}
