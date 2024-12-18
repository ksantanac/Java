package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();
        
        // Add elementos na fila
        fila.add("Ana"); // Lança exceção se a fila não puder aceitar mais dado
        fila.offer("Bia"); // Retorna false se a fila não puder aceitar mais dado
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

        // Pegar elementos da fila
        System.out.println(fila.peek()); // Retorna null caso esteja vazia
        System.out.println(fila.element()); // Lança exceção caso esteja vazia

        // fila.size();
        // fila.clear();
        // fila.isEmpty();

        fila.poll(); // Retorna o primeiro elemento da fila já removendo

    }
}
