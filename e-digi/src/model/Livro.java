package model;

import sun.security.util.Length;

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

    public Livro(String titulo, String resumo, String sumario, int nropaginas, String isbn, Autor autor, Categoria categoria, int edicao, double preco) {
        setTitulo(titulo);
        setResumo(resumo);

    }

    private void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Não é permitido título em branco, por favor digite um título!");
        }

        this.titulo = titulo;
    }

    private void setResumo(String resumo) {
        if (resumo.length() < 500){
            
        }
        
    }

}