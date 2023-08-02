import java.util.Scanner;

public class exercicio5 {

    static int calcularSegundos(int horas) {
        return horas * 3600;
    }

    static int calcularSegundos(int horas, int minutos) {
        return (horas * 3600) + (minutos * 60);
    }

    static int calcularSegundos(int horas, int minutos, int segundos) {
        return (horas * 3600) + (minutos * 60) + segundos;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hora, minuto, segundo, formato;

        System.out.print("Digite o formato a ser inserido: \n(1) hora \n(2) hora e min \n(3) hora, min e seg");
        formato = in.nextInt();
        switch (formato) {
            case 1:
                System.out.println("Digite qtd de horas: ");
                hora = in.nextInt();
                System.out.print("Segundos: " + calcularSegundos(hora));
                break;
            case 2:
                System.out.println("Digite qtd de horas: ");
                hora = in.nextInt();
                System.out.println("Digite qtd de minutos: ");
                minuto = in.nextInt();
                System.out.print("Segundos: " + calcularSegundos(hora, minuto));
                break;
            case 3:
                System.out.println("Digite qtd de horas: ");
                hora = in.nextInt();
                System.out.println("Digite qtd de minutos: ");
                minuto = in.nextInt();
                System.out.println("Digite qtd de segundos: ");
                segundo = in.nextInt();
                System.out.print("Segundos: " + calcularSegundos(hora, minuto, segundo));
                break;

            default:
                System.out.println("Formato inválido! >:(");
                break;
        }

    }
}
