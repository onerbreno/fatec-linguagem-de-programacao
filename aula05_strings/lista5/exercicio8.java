import java.util.Scanner;

public class exercicio8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in, "latin1");

        String disciplina, disciplinaChange; 

        System.out.print("Digite o nome da disciplina: ");
        disciplina  = in.nextLine();


        disciplinaChange = disciplina.toLowerCase().replace("ã", "a");
        disciplinaChange = disciplina.replace("ç", "c");

        if(disciplinaChange.startsWith("programacao") || disciplinaChange.endsWith("programacao")) {
            System.out.println("É da categoria de Programação");
        } else {
            System.out.println("Não é da categoria de Programação");
        }
        


        
    }
}