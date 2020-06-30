package dao;

import java.util.HashSet;
import java.util.Set;

import model.Categoria;

public class DaoCategoria {

    private Set<Categoria> categoria = new HashSet<Categoria>();

    public void addCategoria(Categoria c) {

        if (!categoria.add(c)) {
            throw new RuntimeException("Categoria informada já existe!");
        }

        System.out.println("Categoria cadastrada com sucesso!");
        System.out.println(c);

    }
}