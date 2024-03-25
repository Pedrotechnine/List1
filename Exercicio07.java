//VerificadorIntervalo100-200

import java.util.Scanner;

public class Exercicio07 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verifica se o número está dentro do intervalo entre 100 e 200
        if (numero >= 100 && numero <= 200) {
            System.out.println("O número está dentro do intervalo entre 100 e 200.");
        } else {
            System.out.println("O número está fora do intervalo entre 100 e 200.");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
