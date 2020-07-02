package dao;

import java.util.HashSet;
import java.util.Set;

import model.Autor;

public class DaoAutor {

    private Set<Autor> autor = new HashSet<Autor>();

    public void addAutor(Autor aut) {

        // confere se o email existe na base
        if (!autor.add(aut)) {
            throw new RuntimeException("Email informado já existe!");
        }

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println(aut);

    }
}
