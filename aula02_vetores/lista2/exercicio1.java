package lista2;

import java.util.Random;
import java.util.Arrays;
public class exercicio1 {

    public static void main(String[] args) {
        Random gerador = new Random();
        
        int vetor[] = new int[15];
        double media = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(50);
            media = media + vetor[i];
        }
        
        System.out.println(Arrays.toString(vetor) + "\nSoma dos valores: " + media + "\nMedia: " + media/15);
    }
}