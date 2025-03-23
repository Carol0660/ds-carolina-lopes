
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Scanner meuScan = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int v1 = meuScan.nextInt();

        System.out.println("Digite um numero: ");
        int v2 = meuScan.nextInt();

        meuScan.close();

        if (v1 > v2){
            System.out.println(v1 + " e maior que " + v2);
        }
        else if (v1 == v2){
            System.out.println(v1 + " e igual a " + v2);
        }
        else{
            System.out.println(v1 + " e menor que " + v2);
        }   
    }
}