package dao;

import java.util.HashSet;
import java.util.Set;

import model.Autor;

public class DaoAutor {

    private Set<Autor> autorSet = new HashSet<Autor>();

    public void addAutor(Autor autor) {

        // confere se o email existe na base
        if (!autorSet.add(autor)) {
            throw new RuntimeException("Email informado já existe!");
        }

        System.out.println("Cadastro realizado com sucesso!");
        System.out.println(autor);

    }
}
