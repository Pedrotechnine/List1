//MesCorrespondente

import java.util.Scanner;

public class Exercicio12 {
    public static void Executar() {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite o número do mês
        System.out.print("Digite o número do mês (1 a 12): ");
        int numeroMes = scanner.nextInt();

        // Verifica se o número do mês está dentro do intervalo válido (1 a 12)
        if (numeroMes >= 1 && numeroMes <= 12) {
            // Converte o número do mês para o nome do mês correspondente
            String mesCorrespondente = "";
            switch (numeroMes) {
                case 1:
                    mesCorrespondente = "Janeiro";
                    break;
                case 2:
                    mesCorrespondente = "Fevereiro";
                    break;
                case 3:
                    mesCorrespondente = "Março";
                    break;
                case 4:
                    mesCorrespondente = "Abril";
                    break;
                case 5:
                    mesCorrespondente = "Maio";
                    break;
                case 6:
                    mesCorrespondente = "Junho";
                    break;
                case 7:
                    mesCorrespondente = "Julho";
                    break;
                case 8:
                    mesCorrespondente = "Agosto";
                    break;
                case 9:
                    mesCorrespondente = "Setembro";
                    break;
                case 10:
                    mesCorrespondente = "Outubro";
                    break;
                case 11:
                    mesCorrespondente = "Novembro";
                    break;
                case 12:
                    mesCorrespondente = "Dezembro";
                    break;
            }

            // Exibe o mês correspondente
            System.out.println("O mês correspondente é: " + mesCorrespondente);
        } else {
            // Se o número do mês estiver fora do intervalo válido, exibe uma mensagem de erro
            System.out.println("Número de mês inválido!");
        }

        // Fecha o scanner para liberar recursos
        scanner.close();
    }
}
