
import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double notas[][] = new double[10][5], media[] = new double[10], mediaGeral = 0;

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                
                System.out.print("Digite a nota do " + (i + 1) + "º aluno: ");
                notas[i][j] = in.nextDouble();
                media[i] += notas[i][j]; 
                mediaGeral += notas[i][j];
            }
            media[i] = media[i] / 5;
            if (media[i] > 6) {
                System.out.println("Média do " + (i + 1) + "º aluno: " + media[i] + ". Aluno aprovado :) ");
            }else{
                System.out.println("Média do " + (i + 1) + "° aluno: " + media[i] + ". Aluno reprovado :O ");

            }
        }

        mediaGeral /= 50;

        System.out.println("Média da turma: "+mediaGeral);

        for (int i = 0; i < notas.length; i++) {
            System.out.println();

            for (int j = 0; j < notas[i].length; j++) {
                System.out.print("\t"+notas[i][j]);      
            }
        }
        
        
    }
}
