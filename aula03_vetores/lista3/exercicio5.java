import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class exercicio5 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int vetor[] = new int[10], maior = 0, menor = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(50);

            if (vetor[i] > maior ) {
                maior = vetor[i];
            } 
            
            if (vetor[i] < menor || menor == 0 ) {
                menor = vetor[i];            
            }
        }
        System.out.print(Arrays.toString(vetor)+"\nMaior: "+maior+"\nMenor: "+menor);
    }
}
