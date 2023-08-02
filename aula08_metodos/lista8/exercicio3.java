import java.util.Scanner;

public class exercicio3 {

    static void somaDiagonalPrincipalLinhas(double[][] mat) {
        double diagPrinc = 0, somaLinha[] = new double[2];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (i == j) {
                    diagPrinc += mat[i][j];
                }
                
                somaLinha[i] += mat[i][j];
                 
            }
            System.out.println("\nSoma " + (i + 1) + "ª linha: " + somaLinha[i]);        
        }  

        System.out.println("\nSoma diagonal principal: " +diagPrinc);
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
        somaDiagonalPrincipalLinhas(matriz);

    }
}