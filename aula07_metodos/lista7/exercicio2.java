import java.util.Scanner;

public class exercicio2 {
    static void calculaIMC(int peso, double altura, char sexo){
        double imc;
       
        imc = peso /(altura*altura);

        if (sexo == 'f' || sexo =='F') {
            if (imc < 19.1) {
                System.out.println("Abaixo do peso");
            } else if (imc < 25.8) {
                System.out.println("No peso normal");                
            } else if (imc < 27.3) {
                System.out.println("Marginalmente acima do peso");                
            }else if (imc < 31.1) {
                System.out.println("Acima do peso ideal");                
            }else if (imc > 31.1) {
                System.out.println("Obeso");
            } 

        }else if (sexo == 'm' || sexo =='M') {
            if (imc < 20.7) {
                System.out.println("Abaixo do peso");
            } else if (imc < 26.4) {
                System.out.println("No peso normal");                
            } else if (imc < 27.8) {
                System.out.println("Marginalmente acima do peso");                
            }else if (imc < 32.3) {
                System.out.println("Acima do peso ideal");                
            }else if (imc > 32.3) {
                System.out.println("Obeso");
            }
        }
    
    
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int peso;
        double altura;
        char sexo;

        System.out.print("Digite seu sexo, F - Feminino , M - Masculino: ");
        sexo = entrada.next().charAt(0);

        System.out.print("Digite seu peso: ");
        peso = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        altura = entrada.nextDouble(); 
        
        calculaIMC(peso, altura, sexo);
       
    }
}
