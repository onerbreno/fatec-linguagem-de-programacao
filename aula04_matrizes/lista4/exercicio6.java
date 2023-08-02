import java.util.Random;

public class exercicio6 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int matriz[][] = new int[3][3], diagPrinc = 0, diagSec = 0, somaLinha[] = new int[3], somaColuna[] = new int[3];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(10);
                System.out.print("\t"+matriz[i][j]);      
            }
        }
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    diagPrinc += matriz[i][j];
                }
                if (2 - i == j) {
                    diagSec += matriz[i][j];
                }
                somaLinha[i] += matriz[i][j];
                somaColuna[j] += matriz[i][j];   
            }
            System.out.println("\nSoma " + (i + 1) + "ª linha: " + somaLinha[i]);
            System.out.println("\nSoma " + (i + 1) + "ª coluna: " + somaColuna[i]);
            
        }  
        
        System.out.println("\nDiagonal principal: " + diagPrinc + "\nDiagonal secundária: " + diagSec);

    }
}
