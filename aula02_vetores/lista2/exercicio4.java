package lista2;

import java.util.Scanner;
import java.util.Arrays;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double notas[] = new double[100], notasInversa[] = new double[100], entrada, soma = 0, media;
        
        int i = 0, qtdLidos = 0, qtdAcima = 0;
        do {

            System.out.print("Digite a " + (i + 1) + "ª nota: ");
            entrada = in.nextDouble();

            if (entrada != -1) {
                notas[i] = entrada;
                notasInversa[99 - i] = entrada;
                i++;
                qtdLidos++;
                soma += entrada;
            } else {
                System.out.println("TCHAU:)");
                i = 99;
            }

        } while (i != 99);

        System.out.print("Qtd de valores lidos: " + qtdLidos + "\n");
        System.out.print("Valores informados: \n");
        
        for (int j = 0; j < notas.length; j++) {
            if (notas[j] != 0) {
                System.out.println(notas[j]);
            }
        }
        
        System.out.print("Valores informados na ordem inversa: \n");
        for (int j = 0; j < notasInversa.length; j++) {
            if (notasInversa[j] != 0) {
                System.out.println(notasInversa[j]);
            }
        }
        
        System.out.print("Soma dos valores: " + soma + "\n");

        media = soma / qtdLidos;
        System.out.println("Media dos valores: " + media+ "\n"); 

        for (int j = 0; j < notas.length; j++) {
            if (notas[j] > media) {
                qtdAcima++;
            }
        }

        System.out.println("Quantidades de valores acima da média: " + qtdAcima
        );
    }
}
