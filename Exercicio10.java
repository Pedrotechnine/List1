//NumeroPorExtenso1-5

import java.util.Scanner;

public class Exercicio10 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número de 1 a 5
        System.out.print("Digite um número de 1 a 5: ");
        int numero = scanner.nextInt();

        // Verifica se o número está dentro do intervalo de 1 a 5
        switch (numero) {
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            default:
                System.out.println("Número inválido!");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
