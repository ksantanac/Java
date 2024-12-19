package oo.composicao.desafioBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    String nomeLib;
    List<Livro> livros = new ArrayList<>();

    Biblioteca(String nomeLib){
        this.nomeLib = nomeLib;
    }

    void adicionarLivros(Livro livro){
        livros.add(livro);
    }
    
    void mostraLivros() {
        System.out.println("Livros na biblioteca " + nomeLib + ":");

        for (Livro livro: livros) {
            System.out.println(
                    "Título: " + livro.titulo +
                    ", Ano de Publicação: " + livro.anoPublicacao +
                    ", Autor: " + livro.autor.nome);
        };
    }
    
}