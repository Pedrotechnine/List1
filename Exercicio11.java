//OrdenadorCrescente

import java.util.Scanner;

public class Exercicio11 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite três valores inteiros distintos
        System.out.println("Digite três valores inteiros distintos:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Ordena os valores em ordem crescente
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Exibe os valores em ordem crescente
        System.out.println("Os valores em ordem crescente são:");
        System.out.println(a + ", " + b + ", " + c);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
