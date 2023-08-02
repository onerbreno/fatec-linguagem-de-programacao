import java.util.Scanner;

public class exercicio3 {
    static double calculaIMC(int peso, double altura){
        double imc;
       
        imc = peso /(altura*altura);

        return imc;

    }

    public static void vericaCondicao(int peso, double altura, char sexo) {
        double imcCalculado = calculaIMC(peso, altura);

        if (sexo == 'f' || sexo =='F') {
            if (imcCalculado < 19.1) {
                System.out.println("Abaixo do peso");
            } else if (imcCalculado < 25.8) {
                System.out.println("No peso normal");                
            } else if (imcCalculado < 27.3) {
                System.out.println("Marginalmente acima do peso");                
            }else if (imcCalculado < 31.1) {
                System.out.println("Acima do peso ideal");                
            }else if (imcCalculado > 31.1) {
                System.out.println("Obeso");
            } 

        }else if (sexo == 'm' || sexo =='M') {
            if (imcCalculado < 20.7) {
                System.out.println("Abaixo do peso");
            } else if (imcCalculado < 26.4) {
                System.out.println("No peso normal");                
            } else if (imcCalculado < 27.8) {
                System.out.println("Marginalmente acima do peso");                
            }else if (imcCalculado < 32.3) {
                System.out.println("Acima do peso ideal");                
            }else if (imcCalculado > 32.3) {
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
        
        vericaCondicao(peso, altura, sexo);
       
    }
}
