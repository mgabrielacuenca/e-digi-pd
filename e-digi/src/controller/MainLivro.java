package controller;

import dao.DaoAutor;
import dao.DaoCategoria;
import dao.DaoLivro;
import model.Autor;
import model.Categoria;
import model.Livro;

public class MainLivro {
    public static void main(final String[] args) throws Exception {

        Autor autor = new Autor("Dan Brown", "danbrown@gmail.com");
        DaoAutor autoradd = new DaoAutor();
        autoradd.addAutor(autor);

        Categoria categoria = new Categoria("Suspense Tecnológico");
        DaoCategoria categoriaadd = new DaoCategoria();
        categoriaadd.addCategoria(categoria);

        Livro livro = new Livro("Fortaleza Digital",
                "Ensei Tankado, um ex-funcionário da Agência de Segurança Nacional (NSA) que jura vingar-se dos Estados Unidos, desenvolve um algoritmo de encriptação inquebrável, algo considerado impossível, que caso seja publicamente utilizado inutilizará o computador superpotente da NSA, TRANSLTR, na decodificação de mensagens. A este algoritmo dá o nome de Fortaleza Digital. Tankado conta com a ajuda de North Dakota, pessoa responsável por tornar o Fortaleza Digital público caso Tankado morra sem cumprir seu objetivo. Tankado sofre uma morte misteriosa, supostamente causada por um ataque cardíaco. Antes de morrer, Tankado tenta chamar a atenção das muitas pessoas que passavam ao seu redor numa praça publica da Espanha para o anel que trazia na sua mão esquerda, anel esse que seria a chave do Fortaleza Digital.",
                "Esse livro não possui sumário.", 331, "978-15-93973-59-9", autor, categoria, 1, 29.90);
        DaoLivro livroadd = new DaoLivro();
        livroadd.addLivro(livro);

        System.out.println(livroadd.buscarTitulo("FORTALEZA"));


    }
}