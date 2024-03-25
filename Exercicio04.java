//OperacoesAritmeticas
import java.util.Scanner;

public class Exercicio04 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o primeiro número
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        // Solicita ao usuário que digite o segundo número
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcula a soma dos números
        double soma = numero1 + numero2;
        System.out.println("Soma: " + soma);

        // Calcula a subtração dos números
        double subtracao = numero1 - numero2;
        System.out.println("Subtração: " + subtracao);

        // Calcula a multiplicação dos números
        double multiplicacao = numero1 * numero2;
        System.out.println("Multiplicação: " + multiplicacao);

        // Verifica se o segundo número é diferente de zero antes de calcular a divisão
        if (numero2 != 0) {
            // Calcula a divisão dos números
            double divisao = numero1 / numero2;
            System.out.println("Divisão: " + divisao);
        } else {
            System.out.println("Divisão por zero não é permitida.");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}