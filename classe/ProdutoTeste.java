package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Perfume";
        p1.preco = 500;
        p1.desconto = 0.3;

        var p2 = new Produto();
        p2.nome = "Notebook";
        p2.preco = 5787.89;
        p2.desconto = 0.25;

        System.out.println(p1.nome);
        System.out.println(p2.nome);

    }

}
