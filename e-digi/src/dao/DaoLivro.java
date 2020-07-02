package dao;

import java.util.HashSet;
import java.util.Set;

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
}
