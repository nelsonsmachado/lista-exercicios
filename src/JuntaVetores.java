import java.util.Arrays;
import java.util.Random;

public class JuntaVetores {
    public static void main(String[] args) {

        int[] vetor1 = gerarVetorAleatorio(50);
        int[] vetor2 = gerarVetorAleatorio(50);


        Arrays.sort(vetor1);
        Arrays.sort(vetor2);


        int[] novoVetor = new int[100];
        System.arraycopy(vetor1, 0, novoVetor, 0, vetor1.length);
        System.arraycopy(vetor2, 0, novoVetor, vetor1.length, vetor2.length);


        Arrays.sort(novoVetor);


        System.out.println("Vetor 1:");
        exibirVetor(vetor1);
        System.out.println("\nVetor 2:");
        exibirVetor(vetor2);
        System.out.println("\nNovo Vetor:");
        exibirVetor(novoVetor);
    }


    public static void exibirVetor(int[] vetor) {
        for (int j : vetor) {
            System.out.print(j + " ");
        }
        System.out.println(); // Adicionar uma nova linha após exibir o vetor
    }

    // Método para gerar um vetor de tamanho especificado com valores inteiros aleatórios
    public static int[] gerarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(100); // Intervalo de valores aleatórios de 0 a 99
        }
        return vetor;
    }
}

