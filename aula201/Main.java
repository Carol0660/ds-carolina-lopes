package aula201;
public class Main {
    public static void main(String[] args) {

        //Cria um novo objeto Usuario usando o construtor
        Usuario usuarioi1 = new Usuario("João", "joao@email.com", 37 );
        
        //Exibe as informações do usuario
        usuarioi1.exibirInfo();
        
        //Altera o nome usando o setter
        usuarioi1.setNome("João Siles");
        
        //Exibe novamente após alteração
        System.out.println("\nApós alteração de nome:");
        usuarioi1.exibirInfo();
    }

    
}