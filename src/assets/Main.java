package assets;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Genre genre = new Genre();

        System.out.println("Introduce el id de un genero");
        genre.setId(1);

        System.out.println("Introduce el nombre de un genero");
        genre.setName("Fantasía");

        System.out.println("Introduce la descripcion del genero");
        genre.setDescription("Descripcion del Genero");

        System.out.println("El id introducido es "+ genre.getId());
        System.out.println("El nombre introducido es " + genre.getName());
        System.out.println("La descripción introducida es " + genre.getDescription());

        Autor autor = new Autor();

        System.out.println("Introduce el nombre del actor");
        autor.setName("Paco");

        System.out.println("Introduce un apellido del autor");
        autor.setSurname("Martinez");

        System.out.println("Introduce el lugar de nacimiento del autor");
        autor.setBirthplace("Madrid");

        System.out.println("Introduce la fecha de nacimiento del autor");
        autor.setDayofbirth("12 DE ABRIL DE 1976");

        System.out.println("El nombre introduciodo es " + autor.getName());
        System.out.println("El apellido introducido es "+ autor.getSurname());
        System.out.println("El lugar introducido es "+ autor.getBirthplace());
        System.out.println("La fecha introducida es "+autor.getDayofbirth());


        Loan loan = new Loan();

        System.out.println("Introduce el nombre del libro a prestar");
        loan.setBook(loan.getBook());

        System.out.println("Introduce el usuario que toma prestado el libro");
        loan.setUser(loan.getUser());

        System.out.println("Introduce el dia en el que se presta el libro");
        loan.setLoandate("3 de febrero de 2022");

        System.out.println("Introduce que dia se devuelve el libro");
        loan.setReturndate("21 de febrero de 2022");

        System.out.println("El nombre del libro introducido es "+ loan.getBook());
        System.out.println("El usuario introducido es "+ loan.getUser());
        System.out.println("El dia que se pestó es "+ loan.getLoandate());
        System.out.println("El dia que se devuelve es "+loan.getReturndate());

        Book book = new Book();

        System.out.println("Introduce el isbn de un libro");
        book.setIsbn("FE-47678348876");


        System.out.println("Introduce el titulo de un libro");
        book.setTitle("Don Quijote");

        System.out.println("Introduce el genero de un libro");
        book.setGenre(genre);

        System.out.println("Introduce el autor del libro");
        book.setAutor(autor);

        System.out.println("Introduce la fecha de publicacion de un libro");
        book.setPublicationDate("4 de agosto de 2008");

        System.out.println("El isbn introducido es "+ book.getIsbn());
        System.out.println("El titulo introducido es "+ book.getTitle());
        System.out.println("El genero introducido es "+ book.getGenre());
        System.out.println("El autor introducido es "+ book.getAutor());
        System.out.println("La fecha de publicacion es " + book.getPublicationDate());

        User user = new User();

        System.out.println("Introduce el id de un usuario");
        user.setId(3);

        System.out.println("Introduce el nombre de un usuario");
        user.setName("Ines");

        System.out.println("Introduce el apellido de un usuario");
        user.setSurname("Suárez");

        System.out.println("Introduce el telefono de un usuario");
        user.setPhone("678328955");

        System.out.println("Introduce una direccion del usuario");
        user.setAdress("Calle lozano numero 8");

        System.out.println("Introduce la localidad de un usuario");
        user.setLocality("Avila");

        System.out.println("EL id introducido es "+user.getId());
        System.out.println("El nombre de ususario introducido es " + user.getName());
        System.out.println("El apellido introducido es " + user.getSurname());
        System.out.println("El teléfono introducido es "+ user.getPhone());
        System.out.println("La direccion introducida es "+ user.getAdress());
        System.out.println("La localidad introducida es "+ user.getLocality());
    }
    }


