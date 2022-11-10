package assets;

import java.sql.SQLSyntaxErrorException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {


        Scanner gen = new Scanner(System.in);
        Genre genre = new Genre();

        System.out.print("Introduce el id de un genero");
        genre.setId(gen.nextInt());

        System.out.print("Introduce el nombre de un genero");
        genre.setName(gen.nextLine());

        System.out.println("Introduce la descripcion del genero");
        genre.setDescription(gen.nextLine());

        System.out.println("El id del genero introducifo es ");
        System.out.println("EL nombre introducido es " + genre.getName());
        System.out.println("La descripcion que se ha introducido es " + genre.getDescription());

        Autor autor = new Autor();
        Scanner aut = new Scanner(System.in);

        System.out.print("Introduce el nombre del actor");
        autor.setName(aut.nextLine());

        System.out.println("Introduce un apellido del autor");
        autor.setSurname(aut.nextLine());

        System.out.println("Introduce el lugar de nacimiento del autor");
        autor.setBirthplace(aut.nextLine());

        System.out.println("Introduce el dia de nacimiento del autor");
        autor.setDayofbirth(aut.nextLine());

        System.out.println("El nombre introducido del autor es " + autor.getName());
        System.out.println("EL apellido introducido del autot es " + autor.getSurname());
        System.out.println("El lugar de nacimiento introducido es "+ autor.getBirthplace());
        System.out.println("El dia de nacimiento introducido es " + autor.getDayofbirth());

        Loan loan = new Loan();
        Scanner loa = new Scanner(System.in);

        System.out.println("Introduce el nombre del libro a prestar");
        loan.setBook(loa.nextLine());

        System.out.println("Introduce el usuario que toma prestado el libro");
        loan.setUser(loa.nextLine());

        System.out.print("Introduce el dia en el que se presta el libro");
        loan.setLoandate(loa.nextLine());

        System.out.print("Introduce que dia se devuelve el libro");
        loan.setReturndate(loa.nextLine());

        System.out.println("El nombre del libro a prestar introducido es " + loan.getBook());
        System.out.println("El usuario que presta el libro introducido es "+ loan.getUser());
        System.out.println("El dia introducido es "+ loan.getLoandate());
        System.out.println("El dia que se devuelve el libro introducido es "+ loan.getReturndate());

        Book book = new Book();
        Scanner bok = new Scanner(System.in);

        System.out.println("Introduce el isbn de un libro");
        book.setIsbn(bok.nextInt());


        System.out.println("Introduce el titulo de un libro");
        book.setTitle(bok.nextLine());

        System.out.println("Introduce el genero de un libro");
        book.setGenre(bok.nextLine());

        System.out.println("Introduce la fecha de publicacion de un libro");
        book.setPublicationDate(bok.nextLine());

        System.out.println("El isbn introducido es " + book.getIsbn());
        System.out.println("El titulo del libro introducido es "+ book.getTitle());
        System.out.println("EL genero introducido es " + book.getGenre());

        User user = new User();
        Scanner use = new Scanner(System.in);

        System.out.println("Introduce el id de un usuario");
        user.setId(use.nextInt());

        System.out.println("Introduce el nombre de un usuario");
        user.setName(use.nextLine());

        System.out.println("Introduce el apellido de un usuario");
        user.setSurname(use.nextLine());

        System.out.println("Introduce el telefono de un usuario");
        user.setPhone(use.nextInt());

        System.out.println("Introduce una direccion del usuario");
        user.setAdress(use.nextLine());

        System.out.println("Introduce la localidad de un usuario");
        user.setLocality(use.nextLine());

        System.out.println("El id introdsucido es " + user.getId());
        System.out.println("El nombre introducido es " + user.getName());
        System.out.println("El apellido del ususario introducido es " + user.getSurname());
        System.out.println("El telefono del usuario introducido es "+ user.getPhone());
        System.out.println("La direccion del usuario introducida es "+ user.getAdress());
        System.out.println("La localidad del usuario introducido es "+ user.getLocality());
    }
    }


