//MediaPonderada

import java.util.Scanner;

public class Exercicio17 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite as três notas do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Digite o peso da primeira nota: ");
        double peso1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Digite o peso da segunda nota: ");
        double peso2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();
        
        System.out.print("Digite o peso da terceira nota: ");
        double peso3 = scanner.nextDouble();

        // Calcula a média ponderada das três notas
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);

        // Exibe a média ponderada
        System.out.printf("Média ponderada: %.2f%n", mediaPonderada);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
