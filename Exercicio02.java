import java.util.Scanner;

public class  Exercicio02 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o primeiro número
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        // Solicita ao usuário que digite o segundo número
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        // Calcula a soma dos dois números
        int soma = numero1 + numero2;

        // Exibe o resultado da soma
        System.out.println("A soma dos números é: " + soma);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
