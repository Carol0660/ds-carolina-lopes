import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Digite o comprimento do lado a: ");
        int a = myObj.nextInt();
        System.out.println("Digite o comprimento do lado b: ");
        int b = myObj.nextInt();
        System.out.println("Digite o comprimento do lado c: ");
        int c = myObj.nextInt();
        String v = ", ";
        int d = b + c;
        int p = b* b + c* c;
        
        myObj.close();

        if (a >= b && b > c){
            System.out.println("A ordem decresente dos valores e: " + a + v + b + v + c );
        }
        else if (c >= b && b > a){
            System.out.println("A ordem decresente dos valores e: " + c + v + b + v + a);
        }
        else if (b >= a && a > c){
            
             System.out.println("A ordem decresente dos valores e: " + b + v + a + v + c);
        }
        else if (b > c && c >= a){
            System.out.println("A ordem decresente dos valores e: " + b + v + c + v + a);
        }
        else if (c > a && a >= b){
            System.out.println("A ordem decresente dos valores e: " + c + v + a + v + b);
        }
        else if (a > c && c >= b){
            System.out.println("A ordem decresente dos valores e: " + a + v + c + v + b);
        }
        else if (a == b && b == c){
            System.out.println("A ordem decresente dos valores e: " + a + v + c + v + b);
        }
        
        if (a > d){
            System.out.println("Os lados dados não formam um triangulo");
        }
        else { 
            if (a != b && b != c){
            if (a* a == p){
            System.out.println("Os lados formam um triângulo retângulo");
        }
        else if (a* a > p){
            System.out.println("Os lados formam um triangulo obtusangulo");
        }
        else if (a * a < p){
            System.out.println("Os lados formam um triângulo acutangulo");
        }
                }
            }
        if (a == b && b == c){
            System.out.println("Os lados formam um triangulo equilatero");
        }
        else if (a == b || a == c || b == c) {
            System.out.println("Os lados formam um triangulo isosceles");
        }
    }
    
}
