import java.util.Scanner;
import java.util.Arrays;
public class exercicio1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double vetor1[] = new double[3], vetor2[] = new double[3], vetor3[] = new double[6], soma1 = 0, soma2 = 0;

        for (int i = 0; i < vetor1.length; i++) {

            System.out.print("Digite o " + (i+1) + "º valor do vetor 1: ");
            vetor1[i] = in.nextInt();
            soma1 = soma1 + vetor1[i];           
            
            
        }

        for (int i = 0; i < vetor2.length; i++) {

            System.out.print("Digite o " + (i+1) + "º valor do vetor 2: ");
            vetor2[i] = in.nextInt();
            soma2 = soma2 + vetor2[i];
        }

        if (soma1 > soma2) {
            System.arraycopy(vetor1, 0, vetor3, 0, vetor1.length);
            System.arraycopy(vetor2, 0, vetor3, 3, vetor2.length);

        } else {
            System.arraycopy(vetor2, 0, vetor3, 0, vetor1.length);
            System.arraycopy(vetor1, 0, vetor3, 3, vetor2.length);

        }
        
        System.out.println("Vetor 3: " + Arrays.toString(vetor3));
    }
}