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

        setTitulo(titulo);
        setResumo(resumo);
        setSumario(sumario);
        setNropaginas(nropaginas);
        setIsbn(isbn);
        setEdicao(edicao);
        setPreco(preco);
        setAutor(autor);
        setCategoria(categoria);

    }

    public String getTitulo() {
        return this.titulo;
    }

    private void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é permitido título em branco, por favor digite um título!");
        }

        this.titulo = titulo;
    }

    private void setResumo(String resumo) {
        if (resumo == null ||resumo.length() < 500) {
            throw new IllegalArgumentException("O resumo precisa ter pelo menos 500 caracteres!");
        }

        this.resumo = resumo;
    }

    private void setSumario(String sumario) {
        if (sumario == null || sumario.trim().isEmpty()) {
            throw new IllegalArgumentException("Sumário não pode estar vazio!");
        }

        this.sumario = sumario;
    }

    private void setNropaginas(int nropaginas) {
        if (nropaginas < 0) {
            throw new IllegalArgumentException("O número de páginas precisa ser maior que zero!");
        }

        this.nropaginas = nropaginas;
    }

    private void setIsbn(String isbn) {
        String regexIsbn = "^978-[0-9]{2}-[0-9]{5}-[0-9]{2}-[0-9]{1}$|^13$";

        if (!isbn.matches(regexIsbn)) {
            throw new IllegalArgumentException("ISBN informado não é válido!");
        }

        this.isbn = isbn;
    }

    private void setEdicao(int edicao) {
        if (edicao <= 0){
            throw new IllegalArgumentException("Edição não pode ser 0!");
        }

        this.edicao = edicao;
    }

    private void setPreco(double preco) {
        if (preco <= 0) {
            throw new IllegalArgumentException("O preço precisa ser maior que 0!");
        }

        this.preco = preco;
    }

    private void setAutor(Autor autor) {
        if (autor == null) {
            throw new RuntimeException("Autor não informado!");
        }

        this.autor = autor;
    }

    private void setCategoria(Categoria categoria) {
        if (categoria == null) {
            throw new RuntimeException("Categoria não informada!");
        }

        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        return this.titulo.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Livro livro = (Livro) obj;
        return this.titulo.equals(livro.titulo) || this.isbn.equals(livro.isbn);
    }

    @Override
    public String toString() {
        return "Título: " + this.titulo + "\n" + "Resumo: " + this.resumo + "\n" + "Sumário: " + this.sumario + "\n"
                + "Páginas: " + this.nropaginas + "\n" + "ISBN: " + this.isbn + "\n" + "Edição: " + this.edicao + "\n"
                + "Preço: " + this.preco + "\n" + this.autor + this.categoria;
    }

}