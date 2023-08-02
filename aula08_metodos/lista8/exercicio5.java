import java.util.Scanner;
import java.util.Arrays;
public class exercicio5 {

    static void ordenarVetorCrescente(int[] vet) {
        int aux = 0; 
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(vet));
    
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            System.err.print("Digite o " + (i+ 1) +"° valor: ");
            vetor[i] = entrada.nextInt();
        }

       ordenarVetorCrescente(vetor);       
        
       
    }
}