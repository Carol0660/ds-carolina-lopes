import java.util.Scanner;

public class Exercicio02 {
        public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Escreva o codigo do funcionario: ");
        String cod = myObj.nextLine();
        System.out.println("Digite F se seu sexo for feminino e M para o caso de ser masculino: ");
        String sexo = myObj.nextLine();
        System.out.println("Escreva quantos anos o funcionario trabalha na empresa: ");
        int v1 = myObj.nextInt();
        System.out.println("Escreva o salario do funcionario: ");
        float v2 = myObj.nextFloat();
        float bonus = 0;
        


        myObj.close();

        if (sexo == ("M") && v1 > 15){
            bonus = (v2 * 20) / 100;
        }
        else if (sexo == ("F") && v1 > 10){
            bonus = (v2 * 25) / 100;
        }
        else if (sexo != ("M") && sexo != ("F")) {
            System.out.println("Sexo invalido");
        }
        else {
            bonus = 100;
        }

        System.out.println("O bonus sera: R$" + bonus);
        
        

    }
    
}
