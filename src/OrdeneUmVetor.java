import java.util.Arrays;

public class OrdeneUmVetor {
    public static void main(String[] args) {
        int[] vetor = new int[100];

        System.out.print("Vetor aleatório: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
            if (i < vetor.length - 1) {
                System.out.print(vetor[i] + ", ");
            } else {
                System.out.print(vetor[i]); // Não imprime vírgula após o último número
            }
        }
        System.out.println();
        System.out.println();


        Arrays.sort(vetor); // Ordena o vetor
        System.out.print("Vetor ordenado: " + Arrays.toString(vetor)); // Imprime o vetor ordenado
        System.out.println();
        System.out.println();

        int tamanho = vetor.length;
        System.out.println("O indice do vetor é de: " + tamanho + " posições.");
        System.out.println(); // Pula uma linha
    }
}

