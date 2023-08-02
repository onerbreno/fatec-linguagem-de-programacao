import java.util.Scanner;

public class exercicio5 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sexo;
        double altura, peso;

        System.out.println("\nDigite o sexo: \n1 - Feminino\n2 - Masculino");
        sexo = in.nextInt();

        System.out.print("Digite a altura: ");
        altura = in.nextDouble();
        
        if (sexo == 1) {
            peso = (62.1 * altura) - 44.7;
            System.out.print("Seu peso ideal é: " + peso);
        } else {
            peso = (72.1 * altura) - 58;
            System.out.print("Seu peso ideal é: " + peso);
        }
    }
}