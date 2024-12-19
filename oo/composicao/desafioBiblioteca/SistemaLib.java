package oo.composicao.desafioBiblioteca;

public class SistemaLib {

    public static void main(String[] args) {

        // Criando autores
        Autor autor1 = new Autor("Karina Anjos", "Italiana");
        Autor autor2 = new Autor("Renata Santana", "Alemã");

        // Criando livros
        Livro livro1 = new Livro("Código Limpo", "1998", autor1);
        Livro livro2 = new Livro("1984", "1949", autor2);

        // Criando Biblioteca e add livros
        Biblioteca lib = new Biblioteca("DaCidade Lib");
        lib.adicionarLivros(livro1);
        lib.adicionarLivros(livro2);

        // Criando usuário
        Usuario user1 = new Usuario("Lorenzo", 1);
        Usuario user2 = new Usuario("Fabio", 2);

        // Criando Empréstimo
        Emprestimo emprest1 = new Emprestimo(livro1, "01/01/2023", "01/02/2023");
        Emprestimo emprest2 = new Emprestimo(livro2, "01/05/2023", "01/06/2023");

        // Usuário pegando livros emprestados
        user1.adicionarEmprestimo(emprest1);
        user2.adicionarEmprestimo(emprest2);

        // Exibindo Informações
        lib.mostraLivros();
        System.out.println();

        user1.mostraEmprestimo();
        System.out.println();

        user2.mostraEmprestimo();
        System.out.println();


    }
}
