package controller;

import dao.AutorDao;
import dao.CategoriaDao;
import dao.LivroDao;
import model.CarrinhoCompras;
import model.Autor;
import model.Categoria;
import model.Livro;


public class MainLivro {
    public static void main(final String[] args) throws Exception {

        Autor autor = new Autor("Dan Brown", "danbrown@gmail.com");
        AutorDao autoradd = new AutorDao();
        autoradd.add(autor);
        System.out.println(autor);

        Categoria categoria = new Categoria("Suspense Tecnológico");
        CategoriaDao categoriaadd = new CategoriaDao();
        categoriaadd.add(categoria);
        System.out.println(categoria);

        Livro livro = new Livro("Fortaleza Digital",
                "Ensei Tankado, um ex-funcionário da Agência de Segurança Nacional (NSA) que jura vingar-se dos Estados Unidos, desenvolve um algoritmo de encriptação inquebrável, algo considerado impossível, que caso seja publicamente utilizado inutilizará o computador superpotente da NSA, TRANSLTR, na decodificação de mensagens. A este algoritmo dá o nome de Fortaleza Digital. Tankado conta com a ajuda de North Dakota, pessoa responsável por tornar o Fortaleza Digital público caso Tankado morra sem cumprir seu objetivo. Tankado sofre uma morte misteriosa, supostamente causada por um ataque cardíaco. Antes de morrer, Tankado tenta chamar a atenção das muitas pessoas que passavam ao seu redor numa praça publica da Espanha para o anel que trazia na sua mão esquerda, anel esse que seria a chave do Fortaleza Digital.",
                "Esse livro não possui sumário.", 331, "978-15-93973-59-9", autor, categoria, 1, 29.90);
        LivroDao livroadd = new LivroDao();
        livroadd.add(livro);
        System.out.println(livro);

        //livroadd.buscarTitulo("Fortaleza");

        CarrinhoCompras venda = new CarrinhoCompras();
        venda.addLivroCarrinho(livro, 4);
        venda.addLivroCarrinho(livro, 7);
        venda.finalizarCompra();


    }
}