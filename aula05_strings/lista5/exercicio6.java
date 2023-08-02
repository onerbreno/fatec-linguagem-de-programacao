import java.util.Scanner;

public class exercicio6 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String frase; 
        char letra;
        int ultimaPosicao = 0;

        System.out.print("Digite uma frase: ");
        frase  = in.nextLine();
        System.out.print("\nDigite uma letra: ");
        letra  = in.next().charAt(0);

        for (int i = 0; i < frase.length(); i++) {
            int posicao = frase.indexOf(letra, ultimaPosicao);
            
            if (posicao != -1) {
                System.out.println("\nLetra '" + letra + "' na posição: " + posicao);
            }
            ultimaPosicao++;

        }

        
    }
}