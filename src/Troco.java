import java.util.HashMap;
import java.util.Map;

public class Troco {
    // Método para calcular o troco
    public double calcularTroco(double valorCompra, double valorPago) {
        return valorPago - valorCompra;
    }

    // Método para calcular a quantidade mínima de notas
    public Map<String, Integer> calcularNotas(double troco) {
        Map<String, Integer> notas = new HashMap<>();

        int[] valoresNotas = {100, 50, 20, 10, 5, 2, 1}; // Valores das notas em reais
        String[] tiposNotas = {"R$100", "R$50", "R$20", "R$10", "R$5", "R$2", "R$1"}; // Tipos das notas

        // Iterar sobre os valores das notas em ordem decrescente
        for (int i = 0; i < valoresNotas.length; i++) {
            int quantidadeNotas = (int) (troco / valoresNotas[i]); // Quantidade de notas necessárias
            if (quantidadeNotas > 0) {
                notas.put(tiposNotas[i], quantidadeNotas); // Adiciona a quantidade de notas ao mapa
                troco %= valoresNotas[i]; // Atualiza o valor do troco
            }
        }

        return notas;
    }

    public static void main(String[] args) {
        Troco troco = new Troco();

        // Testar calcularTroco
        double valorCompra = 7.0;
        double valorPago = 10.0;
        double trocoCalculado = troco.calcularTroco(valorCompra, valorPago);
        System.out.println("Troco calculado: " + trocoCalculado);

        // Testar calcularNotas
        double trocoParaNotas = trocoCalculado;
        Map<String, Integer> notas = troco.calcularNotas(trocoParaNotas);
        System.out.println("Quantidade mínima de notas:");
        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


