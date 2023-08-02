import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1 {

    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        char op;
        double media, soma = 0;

        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Digite um valor real: ");
            numbers.add(in.nextDouble());
            System.out.println("Deseja digitar outro? (S/n) ");
            op = in.next().charAt(0);

        } while (op == 's' || op == 'S');

        for (int i = 0; i < numbers.size(); i++) {
            soma += numbers.get(i);
        }

        media = soma / numbers.size();

        System.out.println("Soma: " + soma + "\nMédia: " + media);
    }
}