
import java.util.Scanner;

public class Exercicio01 {
     public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    String nome;
    
    System.out.println("Escreva o nome do funcionario");
    String nome = myObj.nextLine();  
    
    System.out.println("Escreva o numero de horas trabalhadas: ");
    int v1 = myObj.nextInt();

    System.out.println("Escreva o valor recebido por hora trabalhada: ");
    int v2 = myObj.nextInt();

    System.out.println("Escreva quantos filhos o funcionario tem menores de 14 anos: ");
    int v3 = myObj.nextInt();

    System.out.println("Escreva a idade do funcionario: ");
    int v4 = myObj.nextInt();

    System.out.println("Escreva o valor do salário família por filho: ");
    int v5 = myObj.nextInt();

    System.out.println("Tempo de serviço em anos: ");
    int v6 = myObj.nextInt();
    
    float salBruto = v1* v2;
    double descont1 = (salBruto * 8.5) / 100;
    float salFami = v3* 65;


    String real = "R$"; 

    myObj.close();

    if (salBruto > 1500);{
        float ir1 = (salBruto* 15) / 100;
    }
    else if (500 < salBruto){
        float ir2 = salBruto / 8*100;
    }
    else if (salBruto <= 500){
        System.out.println("IR é: 0");
    }

    if (v4 > 40){
        float adic = (salBruto* 2) / 100;
    }
    else if (v6 > 15){
        double adic2 = (salBruto* 3.5) / 100;
    }
    else if (v6 <= )

    }
}
