
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args){
       Scanner V1 = new Scanner (System.in); 
        System.out.println("Digite um numero: ");
        int N1 = V1.nextInt();
        V1.close();
        
        Scanner V2 = new Scanner(System.in);
        System.out.println("Digite outro numero: ");
        int N2 = V2.nextInt();
        V2.close();
        
        if (N1 > N2) {
            System.out.println(N1 + " e maior que " + N2);
        } else if (N1 < N2) {
            System.out.println(N1 + " e menor que " + N2);
        } else {
            System.out.println("Os dois numeros sao iguais");
        }

    }
    
}
