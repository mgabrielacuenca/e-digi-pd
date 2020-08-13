package dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
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
        if (titulo.length() < 2 || titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O título não pode estar vazio ou ter menos de dois caracteres.");
        }

        return livroSet.stream().filter(livro -> livro.getTitulo()).collect(Collectors.toList());
    }
}
