Exercício 3:
import java.util.Scanner;
public class exerc3 {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int num;
    String str;
    try{
    System.out.print("Digite um número:");
    str = entrada.nextLine();
    num = Integer.parseInt(str);
    System.out.println("Num: "+ num);
    }
    catch(Exception e){
        System.out.println("Não foi digitado um número"); 
    }
}
}
