import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int vetor[] = new int[5], busca, noempty = 0 ;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i +1) + "º valor: ");
            vetor[i] = in.nextInt();
        }
        System.out.println("Digite o valor que deseja buscar: ");
        busca = in.nextInt();

        for (int i = 0; i < 5; i++) {
            if (vetor[i] == busca) {
               System.out.print("Posição do número " + busca + ": " +i+"\n");
               noempty++;

            }
        }

        if (noempty == 0 ) {
            System.out.print("Valor inexistente no vetor");
        }
        
    }
}
