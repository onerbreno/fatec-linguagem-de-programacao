import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int idade;
        double altura, peso;

        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.println("Digite sua altura: ");
        altura = entrada.nextDouble();

        System.out.println("Digite seu peso: ");
        peso = entrada.nextDouble();
        
        System.out.println("Você tem "+ idade +" anos");
        System.out.println("Você tem "+ altura +" metros");
        System.out.println("Você pesa "+ peso +"kg");
    }
}