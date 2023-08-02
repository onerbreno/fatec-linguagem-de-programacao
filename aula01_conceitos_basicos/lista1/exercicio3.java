import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        double nota1, nota2, media;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = in.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        nota2 = in.nextDouble();

        media = (nota1 + nota2)/2;

        if(media>=7){
            System.out.println("Aprovado!");
        }else if(media>=4){
            System.out.println("Exame '-'");
        }else{
            System.out.println("Reprovado :(");

        }
    }
}
