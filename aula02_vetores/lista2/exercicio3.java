package lista2;
import java.util.Random;
import java.util.Arrays;

public class exercicio3 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int vetor1[] = new int[5], vetor2[] = new int[5], vetor3[] = new int[5];

        for (int i = 0; i < vetor1.length; i++) {
            vetor1[i] = gerador.nextInt(50);
            vetor2[i] = gerador.nextInt(50);         

            vetor3[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("Vetor1: " + Arrays.toString(vetor1) + " + Vetor2: " + Arrays.toString(vetor2) + " = " + Arrays.toString(vetor3));
    }
}
