import java.util.Scanner;

public class TesteConversao {
    public static void main(String[] args) {
        Scanner meuScan = new Scanner(System.in);

        System.out.println("Digite o numero de protons: ");
        int v1 = meuScan.nextInt();

        System.out.println("Digite o numero de neutrons: ");
        int v2 = meuScan.nextInt();

        System.out.println("Digite o numero de eletrons: ");
        int v3 = meuScan.nextInt();

        double mp = 1.672621637E-27d;
        double mn = 1.6749286E-27d;
        double me = 9.10938215E-31d;
        double cteAvogadro = 6.02214179E23d;
        double massAto = (mp* v1) + (mn* v2) + (me* v3);
        double massMolkg = massAto* cteAvogadro;
        double massMolg = massMolkg* 1000;
        float massMolg1 = (float) massMolg;
        String unidade = "g/mol";
        meuScan.close();
        System.out.println("Massa molar: " + massMolg1 + unidade);
    }
    
}
