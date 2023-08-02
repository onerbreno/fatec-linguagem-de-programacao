import java.util.Scanner;

public class exercicio2slide {

    public static double calcularImc(int peso, double altura) {

        double imc = peso / (altura * altura);

        return imc;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int peso;
        double altura;

        System.out.print("Digite seu peso: ");
        peso = in.nextInt();

        System.out.println("Digite sua altura: ");
        altura = in.nextDouble();

        System.out.print("IMC: "+calcularImc(peso, altura)); 
    }
}
