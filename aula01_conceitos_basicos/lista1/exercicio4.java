import java.util.Scanner;

public class exercicio4 {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double num1, num2, res = 0;
    int opt;

    System.out.print("Digite o primeiro número: ");
    num1 = in.nextDouble();
    System.out.print("Digite o segundo número: ");
    num2 = in.nextDouble();
    
    System.out.print("1 - Média\n2 - Diferença\n3 - Produto\n Digite a opção: ");
    opt = in.nextInt();

    switch (opt) {
        case 1:
            res = (num1 + num2)/2;
            break;
    
        case 2:
            res = num1 - num2;
            break;
        case 3:
            res = num1 * num2;
            break;
    
        default:
            System.out.println("Opção inválida:");
            break;
    }

    System.out.print("Resultado: "+res);

   } 
}
