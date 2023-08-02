import java.util.Scanner;
import java.lang.Math;
public class exercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double raio, comprimento, area, volume, pi = 3.14;
        

        System.out.print("Digite o valor do raio da esfera: ");
        raio = entrada.nextDouble();

        comprimento = 2 *pi * raio;
        area = pi * Math.pow(raio, 2);
        volume = (3.0/4.0) * pi * Math.pow(raio, 3);

        System.out.println("Comprimento: "+ comprimento + "\nÁrea: "+ area +"\nVolume: "+volume);


    }
}