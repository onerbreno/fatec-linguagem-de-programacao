import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int matriz[][] = new int[3][3];

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.print("Digite o " + (i + 1) + "º valor da coluna " + j + ": ");
                matriz[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t"+matriz[i][j]);      
            }
        }

        System.out.print("\n");

    }
}