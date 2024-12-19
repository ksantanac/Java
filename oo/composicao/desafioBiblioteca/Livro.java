package oo.composicao.desafioBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Livro {

    String titulo;
    String anoPublicacao;
    Autor autor;

    Livro(String titulo, String anoPublicacao, Autor autor){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

}
