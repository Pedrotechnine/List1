//CalculoCombustivel

import java.util.Scanner;

public class Exercicio20 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o tempo da viagem em horas
        System.out.print("Digite o tempo da viagem em horas: ");
        double tempoViagemHoras = scanner.nextDouble();

        // Solicita ao usuário que digite a velocidade média da viagem em km/h
        System.out.print("Digite a velocidade média da viagem em km/h: ");
        double velocidadeMedia = scanner.nextDouble();

        // Define o consumo de combustível em km/l
        double consumoCombustivel = 12.0;

        // Calcula a quantidade de litros de combustível gasta na viagem
        double litrosCombustivel = (tempoViagemHoras * velocidadeMedia) / consumoCombustivel;

        // Exibe a quantidade de litros de combustível gasta na viagem
        System.out.printf("Quantidade de litros de combustível gasta na viagem: %.2f%n", litrosCombustivel);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
