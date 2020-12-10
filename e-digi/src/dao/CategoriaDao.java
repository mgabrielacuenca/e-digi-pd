package dao;

import java.util.HashSet;
import java.util.Set;

import model.Categoria;

public class CategoriaDao {

    private Set<Categoria> categoriaSet = new HashSet<>();

    public void add(Categoria categoria) {

        if (!categoriaSet.add(categoria)) {
            throw new RuntimeException("Categoria informada já existe!");
        }


    }
}