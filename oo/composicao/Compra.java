package oo.composicao;

import java.util.ArrayList;

public class Compra {

    // Nome do cliente associado à compra
    String cliente;

    // Lista de itens da compra, representada por objetos do tipo Item
    ArrayList<Item> itens = new ArrayList<>();

    /**
     * Método para adicionar um item à compra.
     * Recebe os detalhes do item (nome, quantidade, preço) e cria um objeto Item para adicioná-lo à lista.
     * Este método é uma forma prática de adicionar itens sem precisar instanciar o objeto Item manualmente.
     */
    void addItem(String nome, int quantidade, double preco) {
        // Cria um novo objeto Item com os parâmetros fornecidos e chama o outro metodo addItem
        this.addItem(new Item(nome, quantidade, preco));
    }

    /**
     * Método sobrecarregado para adicionar um objeto Item diretamente à lista.
     * Também atualiza a referência bidirecional para vincular o item à compra atual.
     *
     * @param item Objeto Item que será adicionado à lista de itens.
     */
    void addItem(Item item) {
        // Adiciona o item à lista de itens
        this.itens.add(item);
        // Estabelece a relação bidirecional: o item sabe a qual compra pertence
        item.compra = this;
    }

    /**
     * Calcula o valor total da compra somando o custo de todos os itens.
     *
     * @return Valor total da compra.
     */
    double obterValorTotal() {
        double total = 0;

        // Itera sobre cada item na lista de itens
        for (Item item : itens) {
            // Soma o custo total (quantidade * preço) de cada item ao total
            total += item.quantidade * item.preco;
        }

        // Retorna o valor total da compra
        return total;
    }
}
