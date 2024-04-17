public abstract class ItemBibliotecaDigital {
    protected String titulo;
    protected String autor;
    protected int anoPublicacao;

    public ItemBibliotecaDigital(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public abstract String descricao();
}
