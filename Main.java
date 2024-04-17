public class Main {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("C++", "Stephen R. Davis", 2016);
        System.out.println(ebook.descricao());
        ebook.baixar();
        System.out.println("-----------------------------\n");
        Video video = new Video("Java-Guia do Programador", "Peter JANDL JUNIOR", 2010);
        System.out.println(video.descricao());
        video.baixar();
        video.visualizar();
        System.out.println("----------------------------\n");
    }
}
