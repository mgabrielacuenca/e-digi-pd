package controller;

import dao.CategoriaDao;
import model.Categoria;

public class MainCategoria {
    public static void main(final String[] args) throws Exception {

        // criando categoria
        Categoria categoria = new Categoria(null);
        Categoria categoria1 = new Categoria("Ficção");

        // realizando as inserções e imprimindo no caso de sucesso
        CategoriaDao categoriaadd = new CategoriaDao();
        categoriaadd.add(categoria);
        categoriaadd.add(categoria1);

    }
}