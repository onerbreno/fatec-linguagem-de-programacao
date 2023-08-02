import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String palavra; 

        System.out.print("Digite uma palavra: ");
        palavra  = in.nextLine();

        System.out.print("Tamanho da String '" +palavra + "': " + palavra.length()+" caracteres\n");


        
    }
}