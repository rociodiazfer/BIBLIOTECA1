package assets;

public class Book {

//pedir al usuario que introduzca lo que hemos creado en la clase

    private Integer isbn;
    private String title;
    private String genre;
    private String publicationDate;

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

    public  String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public String getPublicationDate(){
        return publicationDate;
    }
    public void setPublicationDate(String publicationDate){
        this.publicationDate = publicationDate;
    }
}