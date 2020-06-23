package controller;


public class Autor {

    private String nome;
    private String email;


    public Autor(String nome, String email) {
        setNome(nome);
        setEmail(email);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if(nome.equals(" ") || nome.equals("")){
            throw new IllegalArgumentException("Não é permitido nomes em branco, por favor digite um nome válido.");
        }else{
            this.nome = nome;
        }
           
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        String regex = "^(.+)@(.+)$";
        
        if(email.matches(regex)){
            this.email = email;
        }else{
            throw new IllegalArgumentException("Email inválido!");
        }
 
    }
  
}