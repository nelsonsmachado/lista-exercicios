// 6) Gere 10 números aleatórios entre 0 e 100; mostre todos na tela
// (em uma única linha); identifique o menor e o maior deles.

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int menor = 100; // Inicializado com um valor alto para garantir que seja substituído pelo menor número gerado
        int maior = 0; // Inicializado com um valor baixo para garantir que seja substituído pelo maior número gerado

        System.out.print("Números gerados: ");
        for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(101); // Gera um número aleatório entre 0 e 100
            System.out.print(numero);

            // Imprime o traço (-) se não for o último número
            if (i < 9) {
                System.out.print(" - ");
            }

            // Verifica se o número atual é o menor encontrado até agora
            if (numero < menor) {
                menor = numero;
            }

            // Verifica se o número atual é o maior encontrado até agora
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("\nMenor número: " + menor);
        System.out.println("Maior número: " + maior);
    }
}

