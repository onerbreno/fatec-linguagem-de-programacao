import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        double op, media, soma = 0, acima_media = 0;

        Scanner in = new Scanner(System.in);

        do {
            int counter = 1;
            System.out.println("Digite uma nota: ");
            op = in.nextDouble();
            if (op != -1) {
                notas.add(op);
            }

            counter++;
        } while (op != -1);

        System.out.println("Qtd de notas lidas: " + notas.size());

        for (int i = 0; i < notas.size(); i++) {
            int size = (notas.size() - 1) - i;
            System.out.println(notas.get(size));
            soma += notas.get(i);
        }

        media = soma / notas.size();

        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) > media) {
                acima_media++;
            }
        }

        System.out.println("Soma: " + soma + "\nMédia: " + media + "\nQtd de valores acima da média: " + acima_media);
    }
}