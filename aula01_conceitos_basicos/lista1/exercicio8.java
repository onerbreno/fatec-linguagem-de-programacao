import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int divisor, dividendo, c, a, b;

        System.out.print("Digite o primeiro número: ");
        a = in.nextInt();
        System.out.print("Digite o segundo número: ");
        b = in.nextInt();

        if (b > a) {
            dividendo = b;
            divisor = a;
        } else {
            dividendo = a;
            divisor = b; 
        }

        while (dividendo % divisor != 0) {
            c = dividendo % divisor;
            dividendo = divisor;
            divisor = c;
        }

        System.out.print("Divisor: "+divisor);

    }
}
