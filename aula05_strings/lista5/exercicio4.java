import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String palavra1, palavra2; 

        System.out.print("Digite a 1º palavra: ");
        palavra1  = in.nextLine();
        System.out.print("Digite a 2º palavra: ");
        palavra2  = in.nextLine();
        
        if (palavra1.length() != palavra2.length()){
            System.out.println("Tamanhos diferentes!");
        } else if (!palavra1.equalsIgnoreCase(palavra2)){
            System.out.println("Conteúdo com letras maiúsculas e minúsculas diferentes!");
        } else if (!palavra1.equals(palavra2)) {
            System.out.println("Conteúdos diferentes!");
        } else {
            System.out.println("Palavras exatamente iguais!");
        }
    }
}