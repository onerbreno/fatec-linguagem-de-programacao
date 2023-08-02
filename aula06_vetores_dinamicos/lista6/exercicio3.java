
import java.util.ArrayList;

import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        ArrayList<Character> letras = new ArrayList<>();
        Scanner entrada = new Scanner(System.in, "CP850");
        String palavra;
        char cont;

        System.out.println("\033\143");

        do {
            System.out.print("Digite uma palavra: ");
            palavra = entrada.next();
            for (int i = 0; i < palavra.length(); i++) {
                letras.add(palavra.charAt(i));

            }

            do {
                System.out.print("Deseja digitar mais uma palavra? (S ou N): ");
                cont = entrada.next().charAt(0);
                cont = Character.toLowerCase(cont);
            } while (cont != 's' && cont != 'n');

            if (cont == 's') {
                letras.add(' ');

            }

        } while (cont == 's');

        entrada.close();

        System.out.println("\033\143");
        System.out.print("Frase final: \"");
        for (int i = 0; i < letras.size(); i++) {
            System.out.print(letras.get(i));

        }
        System.out.print("\"\n\n");

    }

}
