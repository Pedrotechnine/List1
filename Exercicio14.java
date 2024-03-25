import java.util.Scanner;

public class Exercicio14 {
  public static void fPa(int a, int n, int r) {
    int formula = a + (n - 1) * r;

    System.out.println("Resultado: " + formula);
  }

  public static void Executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o valor de a1: ");
    int a = leitor.nextInt();

    System.out.println("Insira o valor de n: ");
    int n = leitor.nextInt();

    System.out.println("Insira o valor de r: ");
    int r = leitor.nextInt();

    fPa(a, n, r);

    leitor.close();
  }
}