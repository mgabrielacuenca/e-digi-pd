package model;

import java.util.HashMap;
import java.util.Map;

import dao.LivroDao;
import model.Livro;

public class CarrinhoCompras {

    private LivroDao daolivro = new LivroDao();

    private Map<Livro, Integer> vendas = new HashMap<>();

    private void verificaqtd(int qtd) {
        if (qtd <= 0) {
            throw new RuntimeException("Você deve comprar ao menos um livro!");
        }
    }

    public void add(Livro livro, int qtdLivro) {

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

    public double valorTotalCompra() {

        return vendas.keySet().stream().mapToDouble(livro -> vendas.get(livro) * livro.getPreco()).sum();

    }

    public void finalizarCompra() {

        if (!vendas.keySet().isEmpty()) {

            System.out.println("Venda Finalizada!");

            for (Livro livro : vendas.keySet()) {

                System.out.println("Título: " + livro.getTitulo() + "\n" + "Quantidade: " + vendas.get(livro) + "\n"
                        + "Preço da Unidade: " + livro.getPreco() + "\n");
            }

            System.out.println("Valor total da Compra: R$ " + valorTotalCompra());
        } else {
            throw new RuntimeException("É necessário adicionar um livro no carrinho para fechar a compra!");
        }
    }

}