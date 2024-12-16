package classe;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto p1 = new Produto("Perfume", 500.87);
        System.out.println(p1.precoComDesconto());
        p1.precoComDesconto();


//        Produto p1 = new Produto("Perfume", 500, 0.3);
//        // p1.nome = "Perfume";
//        // p1.preco = 500;
//        // p1.desconto = 0.3;
//
//        var p2 = new Produto("Notebook");
//        // Objetos
//        // p2.nome = "Notebook";
//        p2.preco = 5787.89;
//        p2.desconto = 0.25;
//
//        System.out.println(p1.nome);
//        System.out.println(p2.nome);
//
//        var testePreco = p2.precoComDesconto();
//        System.out.println(testePreco);

    }

}
