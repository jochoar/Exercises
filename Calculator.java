import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("_________________");
      System.out.println("Calculadora basica");
      System.out.println("_________________");
      System.out.println("Opciones:\n1)Suma\n2)Resta\n3)Multiplicacion\n4)Division");
      
      int option = sc.nextInt();

      
      
     if (option > 4 || option <= 0){
          System.out.println("Opcion no es  posible");
      }else {

        System.out.println("Dar primer valor");
      double value1 = sc.nextDouble();
      System.out.println("Dar segundo valor");
      double value2 = sc.nextDouble();
      double total;

        if (option == 1){
            total = value1 + value2;
           System.out.println("La suma es " + total);   
   
         }else if(option == 2){
             total = value1 - value2;
            System.out.println("la resta es " + total);
   
         }else if(option == 3){
             total = value1 * value2;
             System.out.println("La multiplicacion es " + total);
   
         }else if(option == 4){
             total = value1 / value2;
             System.out.println("la multiplicacion es " + total);
   
         }
      }

     
      }
   
    }
