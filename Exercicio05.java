 //TrocaValoresDasVariaveis 

import java.util.Scanner;

public class Exercicio05 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o valor de A
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        // Solicita ao usuário que digite o valor de B
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        // Exibe os valores originais das variáveis A e B
        System.out.println("Valor original de A: " + a);
        System.out.println("Valor original de B: " + b);

        // Troca dos valores das variáveis A e B
        int temp = a;
        a = b;
        b = temp;

        // Exibe os valores trocados das variáveis A e B
        System.out.println("Valor de A após a troca: " + a);
        System.out.println("Valor de B após a troca: " + b);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
