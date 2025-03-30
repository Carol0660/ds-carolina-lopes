
import java.util.Scanner;

public class Exercicio01 {
     public static void main(String[] args) {
    
        Scanner myObj = new Scanner(System.in);
    
    System.out.println ("Escreva o nome do funcionario");
    String nome = myObj.nextLine();  
    
    System.out.println("Escreva o numero de horas trabalhadas: ");
    int v1 = myObj.nextInt();

    System.out.println("Escreva o valor recebido por hora trabalhada: ");
    float v2 = myObj.nextFloat();

    System.out.println("Escreva quantos filhos o funcionario tem menores de 14 anos: ");
    int v3 = myObj.nextInt();

    System.out.println("Escreva a idade do funcionario: ");
    int v4 = myObj.nextInt();

    System.out.println("Tempo de serviço em anos: ");
    int v6 = myObj.nextInt();
    
    float salBruto = v1* v2;
    double descont = (salBruto * 8.5) / 100;
    float salFami = v3* 65;
    float ir = 0;
    double adic;

    myObj.close();

    if (salBruto > 1500){
        ir = (salBruto* 15) / 100;
    }
    else if (salBruto > 500){
        ir = (salBruto* 8) / 100;
    }
    else if (salBruto <= 500){
        ir = 0;
    }

    if (v4 > 40){
        adic = (salBruto* 2) / 100;
    }
    else if (v6 > 15){
        adic = (salBruto* 3.5) / 100;
    }
    else if (v6 <= 15 && v6 > 5 && v4 > 30){
        adic = (salBruto* 1.5) / 100;
    }
    else {
        adic = 0;
    }
    double salLiquido = salBruto + adic + salFami - descont - ir;
    double descontos = ir + descont;
    System.out.println("Nome do funcionario: " + nome);
    System.out.println("Salario Bruto: R$" + salBruto);
    System.out.println("Descontos: R$" + descontos);
    System.out.println("Adicionais: R$" + adic);
    System.out.println("Salario liquido: R$" + salLiquido);
    
}
}