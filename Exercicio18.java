//MediaHarmonica

import java.util.Scanner;

public class Exercicio18 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite as três notas do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média harmônica das três notas
        double mediaHarmonica = 3 / ((1 / nota1) + (1 / nota2) + (1 / nota3));

        // Exibe a média harmônica
        System.out.printf("Média harmônica: %.2f%n", mediaHarmonica);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
