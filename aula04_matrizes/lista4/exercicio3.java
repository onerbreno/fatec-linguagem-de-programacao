import java.util.Random;

public class exercicio3 {
    public static void main(String[] args) {
        Random gerador = new Random();
        int matriz[][] = new int[2][4], par = 0, media = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = gerador.nextInt(10);

                if (matriz[i][j] % 2 == 0){
                    par ++;
                    media = media + matriz[i][j];
                }
                
            }
        }

        media = media / par;

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();

            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("\t"+matriz[i][j]);      
            }
        }

        System.out.print("\nQtd de valores par: " + par +"\nMedia dos valores: " +media);


    }
}
