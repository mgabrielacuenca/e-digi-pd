package controller;

import dao.DaoAutor;
import model.Autor;

public class MainAutor {
    public static void main(final String[] args) throws Exception {

        // criando autor
        Autor autor = new Autor("Gabriela", "mariagabitsi@gmail.com");
        Autor autor1 = new Autor("Gabriela", "mariagabi@gmail.com");

        // realizando as inserções e imprimindo no caso de sucesso
        DaoAutor autoradd = new DaoAutor();
        autoradd.addAutor(autor);
        autoradd.addAutor(autor1);

    }
}
