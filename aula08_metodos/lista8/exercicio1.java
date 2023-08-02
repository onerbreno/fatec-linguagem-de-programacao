import java.util.Scanner;
public class exercicio1 {

    static int somaValorVetor(int[] vet) {
        int soma = 0;

        for (int i = 0; i < vet.length; i++) {
            soma += vet[i];
        }

        return soma;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[5];
        for (int i = 0; i < vetor.length; i++) {
            System.err.print("Digite o " + (i+ 1) +"° valor: ");
            vetor[i] = entrada.nextInt();
        }

        System.out.println("Soma dos valores: " + somaValorVetor(vetor)); 


        
        
       
    }
}