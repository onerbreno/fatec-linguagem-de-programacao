import java.util.Scanner;
import java.util.Arrays;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double vetor1[] = new double[10], vetor2[] = new double[3];
        int indice;

        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Digite o " + ( i + 1 ) +"º valor: ");
            vetor1[i] = in.nextDouble();
        }

        do {            
            System.out.print("Digite o valor do índice: ");
            indice = in.nextInt();
        } while (indice >= 8 );


        for (int i = 0; i < vetor1.length; i++) {
            if (i == indice) {
                System.arraycopy(vetor1, indice, vetor2, 0, vetor2.length);
            }
        }
        System.out.println(Arrays.toString(vetor2));
    }
}
