package dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import model.Livro;

public class DaoLivro {

    private static Set<Livro> livroSet = new HashSet<>();

    public void addLivro(Livro livro) {

        if (livroSet.contains(livro)) {
            throw new RuntimeException("Livro informado já existe!");
        }

        livroSet.add(livro);

    }

    public List<Livro> buscarTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty() || titulo.length() < 2) {
            throw new IllegalArgumentException("O título não pode estar vazio ou ter menos de dois caracteres.");
        }

        System.out.println("Resultado da busca:");
        return livroSet.stream().filter(livro -> livro.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());
    }

    public boolean temLivro(Livro livro) {
        return livroSet.contains(livro);
    }

    public void addLivroCarrinho(Livro livro){
        if (!temLivro(livro)){
            throw new RuntimeException("O livro precisa existir no catálogo!");
        }
    } 
}