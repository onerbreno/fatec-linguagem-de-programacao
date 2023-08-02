import java.util.Random;
import java.util.Arrays;

public class exercicio4 {
    public static void main(String[] args) {
        int matriz[][] = new int[3][6], maiorElemento = 0, menorElemento = 0, indexMaior[] = new int[2], indexMenor[] = new int[2];
        Random gerador = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(10);
                int m = matriz[i][j];
                if (m > maiorElemento) {
                    maiorElemento = m;
                    indexMaior[0] = i;
                    indexMaior[1] = j;
                }
                
                if (m < menorElemento || m == 0) {
                    menorElemento = m;
                    indexMenor[0] = i;
                    indexMenor[1] = j;
                }
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t"+matriz[i][j]);      
            }
        }

        System.out.println("\nMaior elemento da matriz: " + maiorElemento + "\nNa posição: " + "i" + indexMaior[0] + " j" + indexMaior[1]);
        System.out.println("\n\nMenor elemento da matriz: " + menorElemento + "\nNa posição: " + "i" + indexMenor[0] + " j" + indexMenor[1] + "\n");

    }
}
