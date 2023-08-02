import java.util.Scanner;


public class exercicio6 {
    public static void main(String[] args) {
        
        int idade, maior = 0, menor = 0; 
        double media = 0;
        
        Scanner in = new Scanner(System.in);

        for(int i=1; i<=10; i++){
            System.out.print("Digite a idade da " + i + "º pessoa: ");
            idade = in.nextInt();

            if(idade>=18){
                maior++;
            }else{
                menor++;
            }

            media = idade + media; 
        }

        media = media / 10;

        System.out.println("Maiores de idade: " +maior+" pessoas;\nMenores de idade: "+menor+" pessoas; \nMedia das idades: "+media);
     
        

    }
    
}