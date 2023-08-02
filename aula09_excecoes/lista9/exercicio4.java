import java.util.Scanner;

public class exerc4 {

  static double depositar(double saldo, double valor) {
    saldo += valor;
    System.out.println("Depositado: " + valor);
    System.out.println("Novo saldo: " + saldo + "\n");
    double a;
    a = saldo;
    return a;
  }

  static double sacar(double valor, double saldo, double saques) {
    if (saldo >= valor) {
      saldo -= valor;
      System.out.println("Sacado: " + valor);
      System.out.println("Novo saldo: " + saldo + "\n");
    } else {
      System.out.println("Saldo insuficiente. Faça um depósito\n");
    }
    double a;
    a = saldo;
    return a;
  }

  static void extrato(double saldo, double saques, double valor) {
    System.out.println("\tEXTRATO");
    System.out.printf("Saldo atual: \n" + saldo);
    System.out.println("\tSaques realizados hoje: " + saques + "\n");
  }

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int opcao = 0;
    double valor = 0;
    double saldo = 1000;
    double saques = 0;
    System.out.println("\t Escolha a opção desejada");
    System.out.println("1 - Depositar");
    System.out.println("2 - Sacar");
    System.out.println("3 - Consultar Extrato");
    System.out.println("4 - Sair\n");
    try {
      while (opcao != 4) {
        System.out.print("Opção: ");
        opcao = entrada.nextInt();

        switch (opcao) {
          case 1:
            System.out.print("Quanto deseja depositar: ");
            valor = entrada.nextDouble();
            depositar(valor, saldo);
            saldo = depositar(saldo, valor);
            break;
          case 2:
            System.out.print("Quanto deseja sacar: ");
            valor = entrada.nextDouble();
            sacar(valor, saldo, saques);
            saldo = sacar(valor, saldo, saques);
            saques += 1;
            break;
          case 3:
            extrato(saldo, saques, valor);
            break;
          case 4:
            System.out.println("Sistema encerrado.");
            break;
          default:
            System.out.println("Opção inválida");
        }
      }
    } catch (Exception e) {
      System.out.println("Caractere inválido");
    }
  }
}
