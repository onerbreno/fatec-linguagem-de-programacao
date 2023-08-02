import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double maiormedia = 0, menormedia = 0, media, freq, nota1, nota2, nota3, mediageral = 0;
        int matricula, apro = 0, repro = 0;
        
        for(int i=1; i<=10; i++){
            System.out.print("\nDigite a matricula do "+i+"º aluno: ");
            matricula = in.nextInt();
            System.out.print("Digite a 1º nota: ");
            nota1 = in.nextDouble();
            System.out.print("Digite a 2º nota: ");
            nota2 = in.nextDouble();
            System.out.print("Digite a 3º nota: ");
            nota3 = in.nextDouble();
            System.out.print("Digite a frequência do aluno em %: ");
            freq = in.nextDouble();
            
            media = (nota1 + nota2 + nota3)/3;
          
            System.out.print("\nMatricula: " + matricula + "\nFrequência: " + freq + "\nNota final: " + media);
            if (media >= 6 && freq >= 75 ) {
                System.out.println("Aluno(a): Aprovado :)");
                apro++;
                
            } else {
                System.out.println("Aluno(a): Reprovado :(");
                repro++;
            }

            if (media > maiormedia) {
                maiormedia = media;
            } 
            
            if (media < menormedia || menormedia == 0){
                menormedia = media;
            }

            mediageral = media + mediageral;


        }

        mediageral = mediageral / 10;

        System.out.println("Maior media da turma: "+ maiormedia+ "\nMenor media da turma: " + menormedia+"\nMedia geral: " +mediageral+ "\nNúmero de alunos reprovados: "+repro+"Número de alunos aprovados: "+apro);

    }    
}
