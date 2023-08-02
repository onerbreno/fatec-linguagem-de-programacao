import java.util.Scanner;
public class exercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor, taxa, prest;
        int tempo;

        System.out.print("Digite o valor total: ");
        valor = entrada.nextDouble();
        
        System.out.print("Digite a taxa de juros (%): ");
        taxa = entrada.nextDouble();
        
        System.out.print("Digite quantos dias de atraso: ");
        tempo = entrada.nextInt();
        
        prest = valor + (valor * (taxa/100) * tempo);
        
        System.out.println("O valor da prestação: " + prest);
    }
}