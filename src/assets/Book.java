package assets;

public class Book {

//pedir al usuario que introduzca lo que hemos creado en la clase

    private String isbn;
    private String title;
    private Genre genre;
    private Autor autor;
    private String publicationDate;

    /**
     * Metdos, funciones , comportamiento
     */

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getTitle(){
        return title;
    }
    public void setAutor(Autor autor) {this.autor = autor;}
    public Autor getAutor(){return autor;}
    public void setTitle(String title){
        this.title = title;
    }
    public void setGenre(Genre genre) {this.genre = genre;}
    public Genre getGenre(){return genre;}
    public String getPublicationDate(){
        return publicationDate;
    }
    public void setPublicationDate(String publicationDate){
        this.publicationDate = publicationDate;
    }


}