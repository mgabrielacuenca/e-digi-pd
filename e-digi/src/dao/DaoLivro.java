package dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import model.Livro;

public class DaoLivro {

    private Set<Livro> livroSet = new HashSet<Livro>();

    public void addLivro(Livro livro) {

        if (!livroSet.add(livro)) {
            throw new RuntimeException("Livro informado já existe!");
        }

        System.out.println("Livro cadastrado com sucesso!");
        System.out.println(livro);

    }

    public List<Livro> buscarTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty() || titulo.length() < 2) {
            throw new IllegalArgumentException("O título não pode estar vazio ou ter menos de dois caracteres.");
        }

        System.out.println("Resultado da busca:");
        return livroSet.stream().filter(livro -> livro.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                .collect(Collectors.toList());
    }
}