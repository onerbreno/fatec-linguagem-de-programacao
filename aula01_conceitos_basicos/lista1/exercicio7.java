import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        double num = 0, soma = 0, media, controle = 0;
        Scanner in = new Scanner(System.in);
        
        do {
            System.out.print("Digite um valor qualquer: ");
            num = in.nextDouble();
            if (num > 0) {
                soma = num + soma;
                controle++;
            }
        } while (num > 0);
        media = soma/controle;
        
        System.out.print("Somatória dos valores digitados: " + soma + "\nMédia: " + media);

    }
}
