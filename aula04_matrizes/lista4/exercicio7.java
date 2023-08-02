import java.util.Random;

public class exercicio7 {
    public static void main(String[] args) {

        Random gerador = new Random();
        
        int matriz[][] = new int[3][3], matrizFinal[][] = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(10);
                System.out.print("\t"+matriz[i][j]); 
            }
        }
        System.out.println();
        
        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {
                matrizFinal[i][j] = matriz[2-j][i];
                System.out.print("\t"+matrizFinal[i][j]); 
            }
        }
       
    
    }
}
