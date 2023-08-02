import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int voto, joao = 0, josefa = 0, gabriela = 0, liwya = 0, nulo = 0, branco = 0;
        
        System.out.print("1 - João\n2 - Joséfa\n3 - Gabriela\n4 - Liwya\n5 - Nulo\n6 - Branco\n\n0 - Finalizar votação :o\n");
        do {
            System.out.print("Digite o seu voto: ");
            voto = in.nextInt();

            switch (voto) {
                case 1:
                    joao++;
                    break;
                case 2:
                    josefa++;
                    break;
                case 3:
                    gabriela++;

                    break;
                case 4:
                    liwya++;
                    break;
                case 5:
                    nulo++;
                    break;
                case 6:
                    branco++;
                    break;
            
                default:
                    System.out.print("Opção inválida!\n");
                    break;
            }

        } while (voto > 0);
        System.out.println("\n1 - João: " + joao +"\n2 - Joséfa: " + josefa + "\n3 - Gabriela: " + gabriela + "\n4 - Liwya: " + liwya + "\n5 - Nulo: " + nulo  + "\n6 - Branco: " + branco);
    }
}
