package oo.composicao.desafioBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Emprestimo {

    String dataEmprestimo;
    String dataDevolucao;
    Usuario usuario;
    Livro livro;

    Emprestimo(Livro livro, String dataEmprestimo, String dataDevolucao){
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.livro = livro;
    }

}
