package assets;

import com.sun.source.tree.UsesTree;

import java.util.Random;
import java.util.Scanner;
import java.util.jar.Attributes;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {


        Scanner gen = new Scanner(System.in);
        Genre genre = new Genre();
        String name, description;
        String id;
        System.out.print("Introduce el id de un genero");
        genre.setId(scanner.nextInt());

        System.out.print("Introduce el nombre de un genero");
        genre = setName(scanner.next());

        System.out.println("Introduce la descripcion del genero");
        genre = setDescription(scanner.next());

        Autor autor = new Autor();
        Scanner aut = new Scanner(System.in);
        String surname, birthplace;
        Integer dayofbirth;

        System.out.print("Introduce el nombre del actor");
        autor = setName(scanner.next());

        System.out.println("Introduce un apellido del autor");
        autor = setSurname(scanner.next());

        System.out.println("Introduce el lugar de nacimiento del autor");
        autor = setBirthplace(scanner.next());

        System.out.println("Introduce el dia de nacimiento del autor");
        autor = setDayofbirth(scanner.nextInt());


        Loan loan = new Loan();
        Scanner loa = new Scanner(System.in);
        String book, user;
        Integer loandate, returndate;

        System.out.println("Introduce el libro a prestar");
        loan = setBook(scanner.next());

        System.out.println("Introduce el usuario que toma prestado el libro");
        loan = setUser(scanner.next());

        System.out.print("Introduce el dia en el que se presta el libro");
        loan = setLoandate(scanner.nextInt());

        System.out.print("Introduce que dia se devuelve el libro");
        loan = setReturndate(scanner.nextInt());


        Book book = new Book();




    }
    }


