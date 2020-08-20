package dao;

public class VendaLivro {
    

    
    public void addLivroCarrinho(Livro livro){
        if (!temLivro(livro)){
            throw new RuntimeException("Livro selecionado não existe no catálogo!");
        }
    } 
}