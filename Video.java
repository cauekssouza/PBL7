public class Video extends ItemBibliotecaDigital implements Baixavel, Visualizar{
    public Video(String titulo, String autor, int anoPublicacao){
        super(titulo, autor, anoPublicacao);
    }
    @Override
    public String descricao(){
        return "Vídeo Digital - Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao; 
    }
    @Override
    public void baixando(){
        System.out.println("Baixando o Vídeo Digital: " + titulo);
    }
    @Override
    public void visualizando(){
        System.out.println("Visualizando o vídeo digital: " + titulo);
    }
}