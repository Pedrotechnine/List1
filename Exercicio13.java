//Calculadora 

import java.util.Scanner;

public class Exercicio13 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o valor de A
        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        // Solicita ao usuário que digite o valor de B
        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        // Solicita ao usuário que digite o operador
        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado = 0;

        // Realiza a operação com base no operador fornecido
        switch (operador) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b != 0) {
                    resultado = a / b;
                } else {
                    System.out.println("Erro: divisão por zero.");
                    // Retorna para evitar a impressão do resultado
                    return;
                }
                break;
            default:
                System.out.println("Operador não definido.");
                // Retorna para evitar a impressão do resultado
                return;
        }

        // Imprime o resultado da operação
        System.out.println("O resultado da operação é: " + resultado);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
