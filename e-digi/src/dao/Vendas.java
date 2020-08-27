package dao;

import java.util.HashMap;
import java.util.Map;

import model.Livro;

public class Vendas {

    private LivroDao daolivro = new LivroDao();

    private Map<Livro, Integer> vendas = new HashMap<>();

    private void verificaqtd(int qtd) {
        if (qtd <= 0) {
            throw new RuntimeException("Você deve comprar ao menos um livro!");
        }
    }

    public void addLivroCarrinho(Livro livro, int qtdLivro) {

        verificaqtd(qtdLivro);

        if (!daolivro.temLivro(livro)) {
            throw new RuntimeException("O livro não existe em nosso catálogo!");
        } else {
            if (vendas.containsKey(livro)) {
                vendas.put(livro, vendas.get(livro) + qtdLivro);
            } else {
                vendas.put(livro, qtdLivro);
            }
        }
    }

    public void compraFinalizada() {

        // isso aqui é pra caso alguem nao chame o método de add livro e chame o
        // vendaFinalizada logo de cara
        if (!vendas.keySet().isEmpty()) {
            double valorTotal = 0.0;

            System.out.println("Venda Finalizada!");

            for (Livro livro : vendas.keySet()) {
                valorTotal += vendas.get(livro) * livro.getPreco();

                System.out.println("Título: " + livro.getTitulo() + "\n" + "Quantidade: " + vendas.get(livro) + "\n"
                        + "Preço da Unidade: " + livro.getPreco() + "\n");
            }

            System.out.println("Valor total da Compra: R$ " + valorTotal);
        } else {
            throw new RuntimeException("É necessário adicionar um livro no carrinho para fechar a compra!");
        }
    }

}