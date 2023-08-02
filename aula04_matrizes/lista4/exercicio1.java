import java.util.Scanner;
import java.util.Random;
public class exercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gerador = new Random();

        int  matriz[][] = new int[3][5];
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(9); 
                System.out.print("\t"+matriz[i][j]);      
            }
        }
        System.out.print("\n");         

    }
}