package model;

public class Livro {

    private String titulo;
    private String resumo;
    private String sumario;
    private int nropaginas;
    private String isbn;
    private Autor autor;
    private Categoria categoria;
    private int edicao;
    private double preco;

    public Livro(String titulo, String resumo, String sumario, int nropaginas, String isbn, Autor autor,
            Categoria categoria, int edicao, double preco) {
        this.titulo = titulo;
        this.resumo = resumo;
        this.sumario = sumario;
        this.nropaginas = nropaginas;
        this.isbn = isbn;
        this.autor = autor;
        this.categoria = categoria;
        this.edicao = edicao;
        this.preco = preco;
    }

}