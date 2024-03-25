//VolumeCilindro

import java.util.Scanner;

public class Exercicio19 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o raio do cilindro
        System.out.print("Digite o raio do cilindro: ");
        double raio = scanner.nextDouble();

        // Solicita ao usuário que digite a altura do cilindro
        System.out.print("Digite a altura do cilindro: ");
        double altura = scanner.nextDouble();

        // Calcula o volume do cilindro utilizando a fórmula: volume = 3.14 * raio^2 * altura
        double volume = 3.14 * Math.pow(raio, 2) * altura;

        // Exibe o volume do cilindro
        System.out.println("Volume do cilindro: " + volume);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
