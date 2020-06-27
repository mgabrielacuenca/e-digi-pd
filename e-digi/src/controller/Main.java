package controller;

import model.DaoAutor;
import model.DaoCategoria;

public class Main {
    public static void main(final String[] args) throws Exception {

        // criando autor
        Autor autor = new Autor("Gabriela", "mariagabitsi@gmail.com");
        Autor autor1 = new Autor("Gabriela", "mariagabi@gmail.com");

        // realizando as inserções e imprimindo no caso de sucesso
        DaoAutor autoradd = new DaoAutor();
        autoradd.addAutor(autor);
        autoradd.addAutor(autor1);

        // criando categoria
        Categoria categoria = new Categoria("Suspense");
        Categoria categoria1 = new Categoria("Ficção");

        // realizando as inserções e imprimindo no caso de sucesso
        DaoCategoria categoriaadd = new DaoCategoria();
        categoriaadd.addCategoria(categoria);
        categoriaadd.addCategoria(categoria1);

    }
}
