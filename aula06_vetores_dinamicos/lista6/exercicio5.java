import java.util.ArrayList;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> fibonacci = new ArrayList<>();
        int quant = 0;

        System.out.println("\033\143");
        System.out.print("Digite a quantidade de elementos para a sequência: ");
        quant = entrada.nextInt();

        if (quant >= 1) {
            fibonacci.add(0);

        }

        if (quant >= 2) {
            fibonacci.add(1);
            for (int i = 2; i < quant; i++) {
                fibonacci.add(fibonacci.get(i - 1) + fibonacci.get(i - 2));

            }

        }

        entrada.close();
        System.out.print("Sequência de Fibonacci: ");
        for (int i = 0; i < fibonacci.size(); i++) {
            System.out.print(fibonacci.get(i));
            if (i != fibonacci.size() - 1) {
                System.out.print(", ");

            }

        }

    }

}