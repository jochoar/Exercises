import java.util.Scanner;

public class CalculatorSwitch{

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
      System.out.println("_________________");
      System.out.println("Calculadora basica");
      System.out.println("_________________");
      System.out.println("Opciones:\n1)Suma\n2)Resta\n3)Multiplicacion\n4)Division");
      int option = sc.nextInt();
      double  total, value1, value2;

      switch (option) {
            case 1://suma
                System.out.println("Dar el primer valor");
                 value1 = sc.nextDouble();
                System.out.println("Dar el segundo valor");
                 value2 = sc.nextDouble();
                total = value1 + value2;
                System.out.println("El resultado de la suma es" + total);
                break;

            case 2://resta
                System.out.println("Dar el primer valor");
                 value1 = sc.nextDouble();
                System.out.println("Dar el segundo valor");
                 value2 = sc.nextDouble();
                total = value1 - value2;
                System.out.println("El resultado de la resta es" + total);
                break;

            case 3://multiplicacion
                System.out.println("Dar el primer valor");
                 value1 = sc.nextDouble();
                System.out.println("Dar el segundo valor");
                 value2 = sc.nextDouble();
                total = value1 * value2;
                System.out.println("El resultado de la multiplicacion es" + total);
                break;

            case 4://division
                System.out.println("Dar el primer valor");
                 value1 = sc.nextDouble();
                System.out.println("Dar el segundo valor");
                 value2 = sc.nextDouble();
                total = value1 / value2;
                System.out.println("El resultado de la division es" + total);
                break;
            
            default:
            System.out.println("La opcion no existe");
            
                
        }
    }
}