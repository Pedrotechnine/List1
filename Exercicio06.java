//ConversorTemperatura

import java.util.Scanner;

public class Exercicio06 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite a temperatura em Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        // Calcula a temperatura em Fahrenheit usando a fórmula de conversão
        double fahrenheit = (9 * celsius + 160) / 5;

        // Exibe a temperatura convertida em Fahrenheit
        System.out.println("Temperatura em graus Fahrenheit: " + fahrenheit);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
