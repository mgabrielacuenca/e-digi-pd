package dao;

import java.util.HashSet;
import java.util.Set;

import model.Livro;

public class DaoLivro {
    
    private Set<Livro> livro = new HashSet<Livro>();

    public void addCategoria(Livro l) {

        if (!livro.add(l)) {
            throw new RuntimeException("Livro informado já existe!");
        }

        System.out.println("Livro cadastrado com sucesso!");
        System.out.println(l);

    }
}
}