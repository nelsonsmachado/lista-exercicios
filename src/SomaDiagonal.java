// 10) Leia uma matriz quadrada e determine a soma da diagonal principal.
import java.util.Scanner;

public class SomaDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz quadrada: ");
        int tamanho = scanner.nextInt();

        int[][] matriz = new int[tamanho][tamanho];

        System.out.println("Digite os elementos da matriz separados por vírgula:");
        scanner.nextLine(); // Limpar o buffer do scanner antes de ler a linha completa
        String entrada = scanner.nextLine();
        String[] elementos = entrada.split(",\\s*");

        if (elementos.length != tamanho * tamanho) {
            System.out.println("Número incorreto de elementos. Por favor, insira exatamente " + (tamanho * tamanho) + " elementos.");
            return;
        }

        scanner.close();

        int contador = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = Integer.parseInt(elementos[contador++]);
            }
        }

        System.out.println("Matriz inserida:");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matriz[i][j]);
                if (j < tamanho - 1) {
                    System.out.print(" - ");
                }
            }
            System.out.println(); // Adiciona uma quebra de linha para a próxima linha da matriz
        }

        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < tamanho; i++) {
            somaDiagonalPrincipal += matriz[i][i];
        }

        System.out.println("A soma da diagonal principal é: " + somaDiagonalPrincipal);
    }
}


