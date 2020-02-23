import java.util.Scanner;

public class Ifsyntax {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Cual es tu calificacion? ");
        double calificacion = leer.nextDouble();
    
        if(calificacion >= 6){
            System.out.println("Has aprobado");
        }
        
        if (calificacion < 6){
            System.out.println("Has reprobado");
        }

    }

}