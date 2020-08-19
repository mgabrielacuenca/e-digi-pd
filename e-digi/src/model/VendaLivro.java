package model;

import dao.DaoLivro;

public class VendaLivro {

    private DaoLivro daolivro = new DaoLivro();

    public void addLivroCarrinho(Livro livro){
        if (!daolivro.temLivro(livro)){
            throw new RuntimeException("O livro precisa existir no catálogo!");
        }
    } 

}