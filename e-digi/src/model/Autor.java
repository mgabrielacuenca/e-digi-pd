package model;

public class Autor {

    private String nome;
    private String email;

    public Autor(String nome, String email) {
        setNome(nome);
        setEmail(email);
    }

    private void setNome(String nome) {
        // valida campo em branco ou se apenas tem espaço.
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é permitido nomes em branco, por favor digite um nome válido!");
        }

        this.nome = nome;

    }

    private void setEmail(String email) {
        // valida se o valor digitado é um email
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        if (!email.matches(regex)) {
            throw new IllegalArgumentException("Email Inválido!");
        }

        this.email = email;

    }

    // método para sobrescrever o hash para que permita criar um objeto do mesmo tipo
    @Override
    public int hashCode() {
        return this.email.hashCode();
    }

    // método para sobrescrever o equals, para comparar se tem email duplicado
    @Override
    public boolean equals(Object obj) {
        Autor autor = (Autor) obj;
        return this.email.equals(autor.email);
    }

    @Override
    public String toString() {
        return "Autor: " + this.nome + "\n" + "Email: " + this.email + "\n";
    }
}
