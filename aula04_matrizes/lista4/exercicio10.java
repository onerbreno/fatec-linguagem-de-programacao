import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double matriz[][] = new double[3][4];

        for (int i = 2; i >= 0; i--) {
            for (int j = 3; j >= 0; j--) {
                System.out.print("Digite o valor para linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = in.nextDouble();
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t"+matriz[i][j]);      
            }
        }

        System.out.println();
    }
}
