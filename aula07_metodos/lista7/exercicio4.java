import java.util.Scanner;

public class exercicio4 {
    static int calculaFatorial(int n, int x) {
        if (n > 0) {
            do {

                n = n * (x - 1);
                x--;

            } while (x > 1);

            return n;

        } else {

            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num, x, res;

        System.out.print("Digite um número: ");
        num = in.nextInt();

        x = num;


        if (calculaFatorial(num, x) > 0 ) {

            System.out.print("Fatorial de " + num + ": " + calculaFatorial(num, x) + "\n");
            
        } else {
            System.out.print("Valor invalido!\n");
        }

    }
}
