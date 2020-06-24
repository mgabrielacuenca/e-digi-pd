package controller;

import model.DaoAutor;

public class Main {
    public static void main(final String[] args) throws Exception {

        // criando autor
        Autor autor = new Autor("Gabriela", "mariagabitsi@gmail.com");
        Autor autor1 = new Autor("Gabriela", "mariagabitsi@gmail.com");

        // realizando as validações e imprimindo no caso de sucesso
        DaoAutor autoradd = new DaoAutor();
        autoradd.addAutor(autor);
        autoradd.addAutor(autor1);

    }
}
