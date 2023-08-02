import java.util.Scanner;

public class exerc2 {

  static void imprimePosicao(int i, int j, int[][] m) {
    System.out.println("O valor é: " + m[i][j] + "\n");

    return;
  }

  public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    int[][] m = new int[2][2];
    int i = 0, j = 0;
    try {
      for (i = 0; i < m.length; i++) {
        System.out.println(
          "Informe a " + (i + 1) + "a. linha da primeira matriz:"
        );
        for (j = 0; j < m[i].length; j++) {
          System.out.println("m[" + i + "][" + j + "] = ");
          m[i][j] = leia.nextInt();
        }
      }
      System.out.println("Informe a linha:");
      i = leia.nextInt();
      System.out.println("Informe a coluna:");
      j = leia.nextInt();
      imprimePosicao(i, j, m);
    } catch (Exception e) {
      System.out.println("O índice não é válido para a matriz");
    }
  }
}
