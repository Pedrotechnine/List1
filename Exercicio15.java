public class Exercicio15 {

    public static void Executar() {
        // Exemplo de pontos
        double x1 = 0, y1 = 5;
        double x2 = 10, y2 = 20;
        
        double distancia = calcularDistancia(x1, y1, x2, y2);
        
        System.out.printf("Distância: %.2f%n", distancia);
    }
    
    public static double calcularDistancia(double x1, double y1, double x2, double y2) {
        double distancia;
        
        distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        return distancia;
    }
}