import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "latin1");
        String ra, nome, n1, n2, n3, conteudo = "";
        double nota1, nota2, nota3, soma = 0.0, media, mediaGeral = 0.0, menorMedia = 0.0, maiorMedia = 0.0;
        int cont = 0;
        char continua;
        do {
            System.out.println("Digite as informações do aluno: ");

            do {
                System.out.println("Digite o RA do aluno: ");
                ra = entrada.nextLine();
            } while (ra.length() != 4);

            do {
                System.out.println("Digite o nome do aluno: ");
                nome = entrada.nextLine();
            } while (nome.length() > 30);

            do {
                System.out.println("Digite o nota 1: ");
                n1 = entrada.nextLine();
            } while (Double.parseDouble(n1) < 0 && Double.parseDouble(n1) > 10);

            do {
                System.out.println("Digite o nota 2: ");
                n2 = entrada.nextLine();
            } while (Double.parseDouble(n2) < 0 && Double.parseDouble(n2) > 10);

            do {
                System.out.println("Digite o nota 3: ");
                n3 = entrada.nextLine();
            } while (Double.parseDouble(n3) < 0 && Double.parseDouble(n3) > 10);

            conteudo = ra.concat(" ").concat(nome).concat(" ").concat(n1).concat(" ").concat(n2).concat(" ").concat(n3);

            try {
                // Cria arquivo no diretório do projeto
                File file = new File("alunos.txt");

                // Se o arquivo não existir, ele cria um novo
                if (!file.exists()) {
                    file.createNewFile();
                }

                // Instanciamos a escrita do arquivo todo
                // Adicionamos o 2º paramêtro 'true' para habilitar a gravação ao final do
                // arquivo
                FileWriter writer = new FileWriter(file.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(writer);

                // Escreve e fecha arquivo
                bw.write(conteudo);
                bw.newLine();
                bw.close();

                // Lê o arquivo
                FileReader ler = new FileReader("alunos.txt");
                BufferedReader reader = new BufferedReader(ler);
                String linha;
                String dados[];

                // Percorre as linhas enquanto houver texto
                while ((linha = reader.readLine()) != null) {
                    dados = linha.split(" ");

                    nota1 = Double.parseDouble(dados[2]);// Convertemos para double
                    nota2 = Double.parseDouble(dados[3]);// Convertemos para double
                    nota3 = Double.parseDouble(dados[4]);// Convertemos para double
                    soma = nota1 + nota2 + nota3;
                    System.out.println(linha);

                }

                media = soma / 3;

                mediaGeral += media;
                cont++;

                if (media > maiorMedia) {
                    maiorMedia = media;
                }

                if (media < menorMedia || menorMedia == 0) {
                    menorMedia = media;
                }

                System.out.println("Média: " + media);
                if (media >= 8.5) {
                    System.out.println("Conceito: excelente!");
                } else if (media >= 7.0) {
                    System.out.println("Conceito: bom!");
                } else if (media >= 5.0) {
                    System.out.println("Conceito: Regular!");
                } else {
                    System.out.println("Conceito: Preucupante!");
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Inserir mais um aluno? (s) ou (n): ");
            continua = entrada.nextLine().charAt(0);
        } while (continua != 'n');

        mediaGeral = mediaGeral / cont;

        System.out.println("Média geral da sala: " + mediaGeral);
        System.out.println("Menor média da sala: " + menorMedia);
        System.out.println("Maior média da sala: " + maiorMedia);
        System.out.println("Quantidade de alunos cadastrados: " + cont);

    }
}
