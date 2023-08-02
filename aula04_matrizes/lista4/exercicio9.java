import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        char matriz[][] = new char[5][5], letra;
        int letraExiste = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite o caracter da linha " + i + ", coluna " + j + ": ");
                matriz[i][j] = in.next().charAt(0);
            }
        }

        System.out.println("Digite uma letra: ");
        letra = in.next().charAt(0);

        for (int i = 0; i < matriz.length; i++) {
            System.out.println();
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("\t "+matriz[i][j]);

                if (matriz[i][j] == letra) {
                    System.out.println("Letra na linha " + i + " coluna " + j );
                    letraExiste++;
                }
            }
        }

        if (letraExiste == 0) {
            System.out.println("\n Caracter não encontrada :(");
        }
    }    
}
