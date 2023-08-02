import java.util.Scanner;
public class exercicio1 {
    public static void verificaNumParImparNulo(int num) {
        String estado;
        if (num == 0) {
            estado = "nulo.";
        } else if (num % 2 == 0) {
            estado = "par.";
        } else estado = "ímpar.";

        System.out.println(num + " é: " + estado);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num;
        System.out.print("Digite um número: "); 
        num = in.nextInt();

        verificaNumParImparNulo(num);
    }
}