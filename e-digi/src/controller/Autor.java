package controller;

public class Autor {

    private String nome;
    private String email;

    public Autor(String nome, String email) {
        setNome(nome);
        setEmail(email);
    }

    public void setNome(String nome) {
        // valida campo em branco ou se apenas tem espaço.
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Não é permitido nomes em branco, por favor digite um nome válido!");
        } else {
            this.nome = nome;
        }

    }

    public void setEmail(String email) {
        // valida se o valor digitado é um email
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

        if (email.matches(regex)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Email inválido!");
        }

    }

    // método para sobrescrever o hash para que permita criar um objeto do mesmo
    // tipo
    @Override
    public int hashCode() {
        return this.email.charAt(0);
    }

    // método para sobrescrever o equals, para comparar se tem email duplicado
    @Override
    public boolean equals(Object obj) {
        Autor novo = (Autor) obj;
        return this.email.equals(novo.email);
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\n" + "Email: " + this.email + "\n";
    }
}
