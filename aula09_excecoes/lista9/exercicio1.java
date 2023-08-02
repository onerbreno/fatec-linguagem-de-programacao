import java.util.Scanner;

public class exerc1 {

  public static void verifica(String op) throws Exception {
    if (
      op.equals("/") || op.equals("+") || op.equals("*") || op.equals("-")
    ) {} else {
      throw new Exception("Operador invalido");
    }
  }

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int a, b, resultado = 0;
    String op;
    System.out.println("Qual Operador?");
    op = entrada.nextLine();
    try {
      verifica(op);
    } catch (Exception e) {
      System.out.println(e);
    }
    try {
      System.out.println("Digite um número: ");
      a = entrada.nextInt();
      System.out.println("Digite um número: ");
      b = entrada.nextInt();
      if (op.equals("/")) {
        resultado = a / b;
        System.out.println("Resultado:" + resultado);
      }
      if (op.equals("+")) {
        resultado = a + b;
        System.out.println("Resultado:" + resultado);
      }
      if (op.equals("-")) {
        resultado = a - b;
        System.out.println("Resultado:" + resultado);
      }
      if (op.equals("*")) {
        resultado = a * b;
        System.out.println("Resultado:" + resultado);
      }
    } catch (Exception e) {
      System.out.println("Número inválido!");
    }
  }
}
