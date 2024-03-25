import java.util.Scanner;

public class Exercicio01 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número
        System.out.println("Digite um número:");
        
        // Lê o número digitado pelo usuário
        int numero = scanner.nextInt();

        // Verifica se o número é maior que 10
        if (numero > 10) {
            System.out.println("Número maior do que 10!");
        } else {
            System.out.println("Número menor ou igual a 10!");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}

