package model;

import java.util.HashSet;
import java.util.Set;

import controller.Autor;

public class DaoAutor {

   private Set<Autor> autor = new HashSet<Autor>();

    public void addAutor(Autor a) {
        
        // valida se o email existe na base
        if(!autor.add(a)){
            throw new IllegalArgumentException("Email informado já existe!");
        }else{
            System.out.println("Cadastro realizado com sucesso!");
            System.out.println(a);
        }
    }


}