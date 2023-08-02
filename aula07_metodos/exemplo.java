import java.util.Scanner;
public class exemplo {
    
    
    public static void mostraValor(int x){
       System.out.println("Valor de x:"+x);
        
    }

    public static void ola() {
        System.out.println("Olá");       
    }

    public static void calcularMedia(double n1, double n2) { //assinatura
      
      double media ; 

      media = (n1 + n2) / 2;

      System.out.println("Média: " + media);
    }
        
    public static void main(String[] args) {
      try (Scanner in = new Scanner(System.in)) {
        double n1, n2;

        System.out.println("Nota 1: ");
        n1 = in.nextDouble();
        
        System.out.println("Nota 2: ");
        n2 = in.nextDouble();

        calcularMedia(n1, n2);
      }  
    }
}