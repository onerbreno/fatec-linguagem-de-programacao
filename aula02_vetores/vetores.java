import java.util.Scanner;
public class vetores {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int vetor[] = new int[5];

               
        for (int i = 0; i < 5; i++) {

            System.out.println("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = in.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            
            System.out.println(vetor[i]);
        }
    }
}