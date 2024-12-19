package oo.composicao.desafioBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    String nome;
    int id;
    
    List<Emprestimo> emprestimos = new ArrayList<>();

    Usuario(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    void adicionarEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }

    void mostraEmprestimo() {
        System.out.println("Usuário: " + this.nome + "\nEmprestimos:");

        int qtdEmprestimos = 0;
        for (Emprestimo emprestimo: emprestimos) {

            qtdEmprestimos += 1;
            System.out.println(
                    qtdEmprestimos + ". " + "Título: " + emprestimo.livro.titulo +
                            "\nAutor: " + emprestimo.livro.autor.nome +
                            "\nData de Empréstimo: " + emprestimo.dataEmprestimo +
                            "\nData de Devolução: " + emprestimo.dataDevolucao
            );
        };
    }


}
