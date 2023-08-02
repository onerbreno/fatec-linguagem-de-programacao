import java.util.Scanner;
import java.util.Arrays;

public class exercicio2 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8};
        int meio = vetor.length / 2;

        System.out.print("Vetor: " + Arrays.toString(vetor) + "\n");
        
        for (int inicio = 0, fim = vetor.length - 1; inicio < meio; inicio++, fim--) {
            int numero = vetor[inicio];
            vetor[inicio] = vetor[fim];
            vetor[fim] = numero;
        }
        System.out.print("Vetor invertido: " + Arrays.toString(vetor));

    }
}
