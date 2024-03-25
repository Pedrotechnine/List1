//VerificadorNumero

import java.util.Scanner;

public class Exercicio08 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número é maior ou igual a 50
        if (numero >= 50) {
            System.out.println("O número é maior ou igual a 50.");
        } else {
            System.out.println("O número é menor que 50.");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
