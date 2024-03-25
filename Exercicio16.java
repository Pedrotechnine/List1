//MediaAritmetica

import java.util.Scanner;

public class Exercicio16 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite as três notas do aluno
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calcula a média aritmética das três notas
        double media = (nota1 + nota2 + nota3) / 3;

        // Exibe a média aritmética
        System.out.printf("Média: %.2f%n", media);

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
