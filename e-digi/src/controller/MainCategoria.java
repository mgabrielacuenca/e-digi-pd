package controller;

import dao.DaoCategoria;
import model.Categoria;

public class MainCategoria {
    public static void main(final String[] args) throws Exception {

        // criando categoria
        Categoria categoria = new Categoria(null);
        Categoria categoria1 = new Categoria("Ficção");

        // realizando as inserções e imprimindo no caso de sucesso
        DaoCategoria categoriaadd = new DaoCategoria();
        categoriaadd.addCategoria(categoria);
        categoriaadd.addCategoria(categoria1);

    }
}