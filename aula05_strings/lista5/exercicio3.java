import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nome; 
        int vogal = 0, espacos = 0;

        System.out.print("Digite seu nome: ");
        nome  = in.nextLine();

        for (int i = 0; i < nome.length(); i++) {
            System.out.println(nome.charAt(i));
            
            switch (nome.toUpperCase().charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vogal ++ ;             
                    
                    break;

                case ' ':
                    espacos ++;

                    break;
            }

        }

        System.out.println("Vogais: " + vogal + "\nEspaços: " + espacos);
    }
}
