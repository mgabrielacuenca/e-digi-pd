package dao;

import java.util.HashSet;
import java.util.Set;

import model.Autor;

public class AutorDao {

    private Set<Autor> autorSet = new HashSet<>();

    public void add(Autor autor) {

        // confere se o email existe na base
        if (autorSet.contains(autor)) {
            throw new RuntimeException("Email informado já existe!");
        }

        autorSet.add(autor);

    }
}
