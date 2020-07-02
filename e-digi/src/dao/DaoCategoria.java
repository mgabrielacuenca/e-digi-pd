package dao;

import java.util.HashSet;
import java.util.Set;

import model.Categoria;

public class DaoCategoria {

    private Set<Categoria> categoriaSet = new HashSet<Categoria>();

    public void addCategoria(Categoria categoria) {

        if (!categoriaSet.add(categoria)) {
            throw new RuntimeException("Categoria informada já existe!");
        }

        System.out.println("Categoria cadastrada com sucesso!");
        System.out.println(categoria);

    }
}