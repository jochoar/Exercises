import java.util.Scanner;

public class Ifchained {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Que sexo eres?\n1)hombre\n2)mujer");
        int sexo = sc.nextInt();

        if (sexo == 1){
            System.out.println("Eres un macho alfa lomo plateado");
       
        }else if(sexo == 2){
            System.out.println("Eres una linda señorita");
        
        }else {
            System.out.println("Esta opcion no es posible");

        }
    
       
    }


    


}
