//MaiorNumero

import java.util.Scanner;

public class Exercicio03 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o primeiro número
        System.out.print("Digite o primeiro número inteiro (A): ");
        int a = scanner.nextInt();

        // Solicita ao usuário que digite o segundo número
        System.out.print("Digite o segundo número inteiro (B): ");
        int b = scanner.nextInt();

        // Verifica se os números são iguais
        if (a == b) {
            System.out.println("A sequência de números informada é inválida, pois os números são iguais.");
        } else {
            // Determina e exibe o maior número
            int maior = (a > b) ? a : b;
            System.out.println("O maior número é: " + maior);
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
