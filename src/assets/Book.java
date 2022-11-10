package assets;

public class Book {

//pedir al usuario que introduzca lo que hemos creado en la clase

    private Integer isbn;
    private String title;
    private String autor;
    private String genre;
    private Integer publicationDate;

    /**
     * Metdos, funciones , comportamiento
     */

    public Integer getIsbn(){
        return isbn;
    }
    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }

    public  String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public Integer getPublicationDate(){
        return publicationDate;
    }
    public void setPublicationDate(Integer publicationDate){
        this.publicationDate = publicationDate;
    }
}