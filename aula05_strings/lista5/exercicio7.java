import java.util.Scanner;

public class exercicio7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nome, sobrenome; 

        System.out.print("Digite seu nome e sobrenome: ");
        nome  = in.nextLine();

        String [] nomeSeparados = nome.split(" ");

        sobrenome = nomeSeparados[nomeSeparados.length - 1];

        System.out.println(sobrenome);
    }
}