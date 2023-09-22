import java.util.Scanner;

/**
 * @authors Equipo: "BACKYARDIGANS"
 */
public class ONLINE_LIBRARY {

    public static void main(String[] args) {
        String firstName;
        String lastName;
        String Email;
        /*
        En la primera fase del proyecto, iniciaremos con lo básico,
        pedir nombre y correo, hacer que eso sea lo necesario para
        tomar prestado un libro de la biblioteca.
        */
         Scanner CPTR = new Scanner (System.in);
        //
        System.out.println("Introduce tu nombre:");
        firstName = CPTR.nextLine();
        System.out.println("Introduce tus apellidos:");
        lastName = CPTR.nextLine();
        System.out.println("Introduce tu E-mail Institucional:");
        Email = CPTR.nextLine();
        //
        System.out.println("  "); //Espacio en Blanco, aún no sabemos como.
        System.out.println(lastName);
        System.out.println(firstName);
        System.out.println(Email);
        
        /*
        Segunda Fase, darle valor a las variables de los diferentes libros disponibles.
        */
    }
}
