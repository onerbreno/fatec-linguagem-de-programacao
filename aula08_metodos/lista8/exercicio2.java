import java.util.Scanner;

public class exercicio2 {

    static void somaValorMatriz(double[][] mat) {
        double soma = 0.00;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                soma += mat[i][j];
            }
        }

        System.out.println(soma);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[][] matriz = new double[2][2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.err.print("Digite o valor da linha " + (i + 1) + " coluna " + (j + 1) + ": ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        somaValorMatriz(matriz);

    }
}