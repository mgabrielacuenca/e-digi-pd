package model;

public class Categoria {

    private String nome;

    public Categoria(String nome) {
        setNome(nome);
    }

    private void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é permitido categoria em branco, por favor digite uma categoria!");
        }

        this.nome = nome;

    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        Categoria categoria = (Categoria) obj;
        return this.nome.equals(categoria.nome);
    }

    @Override
    public String toString() {
        return "Categoria: " + this.nome + "\n";
    }

}