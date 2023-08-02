import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double notas[] = new double[10], media = 0, maiornota = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite a " + (i + 1) + "º nota: ");
            notas[i] = in.nextDouble();

            if (notas[i] > maiornota) {
                maiornota = notas[i];
            }
            media += notas[i];
        }

        media = media / 10;

        for (int i = 0; i < 10; i++) {
            System.out.println(notas[i]);
        }

        System.out.println("Media geral: " + media);
        System.out.println("Maior nota: " + maiornota);
    }
}
