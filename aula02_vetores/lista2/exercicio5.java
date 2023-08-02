import java.util.Scanner;
import java.util.Arrays;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int vetor_original[] = new int[5], vetor_copia[] = new int[vetor_original.length];

        for (int i = 0; i < vetor_original.length; i++) {
            System.out.print("Digite o " + (i +1) + "º valor: ");
            vetor_original[i] = in.nextInt();
        }
        System.arraycopy(vetor_original, 0, vetor_copia, 0, vetor_copia.length);
        System.out.print("Vetor original: " + Arrays.toString(vetor_original) + "\nVetor cópia: " + Arrays.toString(vetor_copia));
    }
}
