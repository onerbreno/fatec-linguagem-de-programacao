import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class exercicio2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ArrayList<Double> numeros = new ArrayList<Double>();

        double soma = 0.0, nums;

        char op;

        System.out.println("\033\143");

        do {
            System.out.println("Digite um número: ");
            nums = entrada.nextDouble();
            numeros.add(nums);
            System.out.print("Deseja inserir mais números? s/n: ");
            op = entrada.next().charAt(0);

        } while (op == 's' || op == 'S');

        System.out.print("\033\143");

        System.out.print("Ordenação crescente dos números inseridos:\n");

        Collections.sort(numeros);

        for (Double numero : numeros) {
            System.out.println("-> " + numero);

        }

        System.out.print("\nNúmeros digitados: " + "[ " + numeros.size() + " ]");

        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);

            System.out.println("-> " + (i + 1) + "° Número " + numeros.get(i));

        }

        System.out.println("A soma de todos os números é: " + soma);

        System.out.println(("Média dos números inseridos: " + soma / numeros.size()));

        System.out.println("\n");

    }

}