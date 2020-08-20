package dao;

import java.util.HashSet;
import java.util.Set;

import model.Categoria;

public class DaoCategoria {

    private static Set<Categoria> categoriaSet = new HashSet<>();

    public void addCategoria(Categoria categoria) {

        if (categoriaSet.contains(categoria)) {
            throw new RuntimeException("Categoria informada já existe!");
        }

        categoriaSet.add(categoria);

    }
}