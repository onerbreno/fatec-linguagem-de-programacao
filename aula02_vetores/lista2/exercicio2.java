package lista2;

import java.util.Scanner;
public class exercicio2 {

    public static void main(String[] args) {
        
        int qtd = 0, par = 0, impar = 0;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite quantos valores deseja inserir: ");
        qtd = in.nextInt();
        
        int vetor[] = new int[qtd];
        
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = in.nextInt();
            if (vetor[i] % 2 == 0) {
                par++;
            } else impar++;
        }
        
        System.out.print("Quantidade de números pares: " + par + "\nQuantidade de números ímpares: " + impar + "\n");
    }
}