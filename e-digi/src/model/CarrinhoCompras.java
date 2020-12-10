package model;

import java.util.HashMap;
import java.util.Map;

import dao.LivroDao;

public class CarrinhoCompras {

    private LivroDao daolivro;

    public CarrinhoCompras(LivroDao daolivro) {

        this.daolivro = daolivro;

    }

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
        }
        if (vendas.containsKey(livro)) {
            vendas.put(livro, vendas.get(livro) + qtdLivro);
        } else {
            vendas.put(livro, qtdLivro);
        }
    }

    public double valorTotalCompra() {

        return vendas.keySet().stream().mapToDouble(livro -> vendas.get(livro) * livro.getPreco()).sum();

    }

    public void finalizarCompra() {

        StringBuilder sb = new StringBuilder("Venda Finalizada!\n");

        if (vendas.keySet().isEmpty()) {
            throw new RuntimeException("É necessário adicionar um livro no carrinho para fechar a compra!");

        }

        for (Livro livro : vendas.keySet()) {

            sb.append("Título: ").append(livro.getTitulo())
            .append("\nQuantidade: ").append(vendas.get(livro))
            .append("\nPreço da Unidade: ").append(livro.getPreco());
        }

        sb.append("\nValor total da Compra: R$ " + valorTotalCompra());

        System.out.println(sb.toString());

    }

}