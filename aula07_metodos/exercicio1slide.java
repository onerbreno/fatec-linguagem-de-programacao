import java.util.Scanner;

public class exercicio1slide {

    public static void calcularImc(int peso, double altura) {

        double imc = peso / (altura * altura);

        System.out.println("IMC: " +imc);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int peso;
        double altura;

        System.out.print("Digite seu peso: ");
        peso = in.nextInt();

        System.out.println("Digite sua altura: ");
        altura = in.nextDouble();

        calcularImc(peso, altura);
    }
}
