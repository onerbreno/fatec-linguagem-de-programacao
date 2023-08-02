import java.util.Scanner;
import java.util.Arrays;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String numero;
        String [] numExtenso = {"zero","um","dois","três","quatro","cinco","seis","sete","oito","nove"};

        System.out.print("Digite um número: ");
        numero  = in.nextLine();

        String [] extenso = new String[numero.length()];

        for (int i = 0; i < numero.length(); i++) {
            int index = 0;
            switch (numero.charAt(i)) {
                case '0':
                    index = 0;
                    break;
                case '1':
                    index = 1;
                    break;
                
                case '2':
                    index = 2;
                    break;
                    
                case '3':
                    index = 3;
                    break;
                    
                case '4':
                    index = 4;
                    break;
                    
                case '5':
                    index = 5;
                    break;
                    
                case '6':
                    index = 6;
                    break;
                    
                case '7':
                    index = 7;
                    break;
                    
                case '8':
                    index = 8;
                    break;
                    
                case '9':
                    index = 9;
                    break;        
                
                default:
                    break;
            }

            extenso[i] = numExtenso[index];

        }
        System.out.println(Arrays.toString(extenso));

    }
}
