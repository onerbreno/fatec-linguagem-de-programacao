import java.util.Scanner;

public class exercicio4 {

    public static void buscarValorVetor(int[] vetor, int valor) {
      for (int i = 0; i < vetor.length; i++) {
        if(vetor[i] == valor) {
            System.out.println("Valor encontrado: indíce " + i);
        } else System.out.println("Valor não encontrado."); 
      }  
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int vet[] = new int[4];
        int valor;

        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o " + (i + 1) + " valor: ");
            vet[i] = in.nextInt();
        }
        
        System.out.println("Digite o valor a ser buscado: ");
        valor = in.nextInt();

        buscarValorVetor(vet, valor);
    }
}