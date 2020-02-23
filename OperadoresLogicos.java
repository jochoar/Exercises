import java.util.Scanner;

public class OperadoresLogicos{

    public static void main(String[] args) {
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Cual es tu edad?");
    int edad = sc.nextInt();
    
   if (edad >= 1 && edad <=10){
       System.out.println("Eres un niño");
   }

   if (edad >= 11 && edad <=17){
       System.out.println("Eres un adolescente");
   }
    
   if (edad >= 18 && edad <=30){
        System.out.println("Eres un adulto");
    }

    if (edad >= 31 && edad <=80){
        System.out.println("Eres mayor");
    }

    if (edad <= 0 || edad >80){
        System.out.println("Esta edad no es posible");
    }
 
 
    }
}
