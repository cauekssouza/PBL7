public class Ebook extends ItemBibliotecaDigital implements Baixavel{
    public Ebook(String titulo, String autor, int anoPublicacao){
        super(titulo, autor, anoPublicacao);
    }
    @Override
    public String descricao(){
        return "Ebook - Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao;
    }

    @Override
    public void baixando(){
        System.out.println("Baixando o ebook: " + titulo);
    }
}