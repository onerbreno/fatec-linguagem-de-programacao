import java.util.Random;
public class exercicio8 {
    public static void main(String[] args) {
        int A[][] = new int[4][4], B[][] = new int[4][4], result[][] = new int[4][4];
        
        Random gerador = new Random();
        
        for (int i = 0; i < A.length; i++) {
            System.out.println();
            
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = gerador.nextInt(10);
                B[i][j] = gerador.nextInt(10);
                System.out.print("\t"+A[i][j]);      
            }
        }
        System.out.println();
        
        for (int i = 0; i < A.length; i++) {
            System.out.println();
            
            for (int j = 0; j < A[i].length; j++) {    
                System.out.print("\t"+B[i][j]);      
            }
        }
        System.out.println();
        
        for (int i = 0; i < result.length; i++) {
            System.out.println();
            for (int j = 0; j < result.length; j++) {
                result[i][j] = A[i][j] + B[i][j];
                System.out.print("\t"+result[i][j]);      
            }
        }
    }
}
