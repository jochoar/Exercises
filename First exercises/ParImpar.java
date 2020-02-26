import java.util.Scanner;

public class ParImpar {

public static void main(String[] args) {

   Scanner sc = new Scanner(System.in);
   System.out.println("Ingrese el numero");
  
   int numero = sc.nextInt();

   if (numero % 2 == 0 ){
       System.out.println("El numero es par");
   }
   
   if (numero % 2 != 0 ){
       System.out.println("El numero es impar");
   }
   
   if (numero > 10){
       System.out.println("El numero es mayor a 10");
   }
}    
}

