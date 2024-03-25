//VerificadorNumerosMaior

import java.util.Scanner;

public class Exercicio09 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o valor de A
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();

        // Solicita ao usuário que digite o valor de B
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();

        // Verifica se os números são iguais
        if (a == b) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("Os números são diferentes.");

            // Determina o maior número entre A e B
            int maior = (a > b) ? a : b;
            System.out.println("O maior número é: " + maior);
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
