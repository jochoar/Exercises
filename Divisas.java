import java.util.Scanner;

public class Divisas{

    public static void main( String[] args) {
     Scanner sc = new Scanner(System.in);
      System.out.println("_________________");
      System.out.println("Calculadora divisas");
      System.out.println("_________________");
      System.out.println("1)Dolares a Pesos COP");
      System.out.println("2)Pesos COP a Dolares");

      int option = sc.nextInt();
      double amount;
      double pesos = 3395;
      double dollars = 1;


      switch(option){
        
        case 1:
        System.out.println("Dolares a Pesos COP");
        System.out.println("Cuantos dolares tienes?");
        amount = sc.nextDouble();
        amount = (amount * pesos)/ dollars;
        System.out.printf(" tienes %.2f pesos COP", amount);
        break;

        case 2:
        System.out.println("Pesos COP a Dolares");
        System.out.println("Cuantos pesos COP tienes?");
        amount = sc.nextDouble();
        amount = (amount * dollars)/ pesos;
        System.out.printf(" tienes %.2f Dolares", amount);
        break;


      }
     
    }
}