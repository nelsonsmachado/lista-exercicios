// Implemente um jogo Jokenpo (Pedra, papel ou tesoura). 
// Será o jogador contra a máquina. O código tem que gerar as posições 
// aleatoriamente e comparar com o que escolhemos.


import java.util.Random;
import java.util.Scanner;

public class Janken {
    public static void main(String[] args) {
        String[] itens = { "Pedra", "Papel", "Tesoura" };
        Random random = new Random();
        Scanner jogadaScanner = new Scanner(System.in);
        String entrada = ""; // Inicialização da variável entrada

        do {
            int computador = random.nextInt(3);
            int jogador;

            System.out.println("Faça sua escolha:");
            System.out.println("[0]PEDRA [1]PAPEL [2]TESOURA");

            jogador = jogadaScanner.nextInt();
            while (jogador < 0 || jogador > 2) {
                System.out.println("Jogada inválida. Escolha novamente:");
                jogador = jogadaScanner.nextInt();
            }

            System.out.println("=".repeat(45));
            System.out.println("Você jogou " + itens[jogador]);
            System.out.println("O computador jogou " + itens[computador] + ".");

            if (computador == jogador) {
                System.out.println("Jogada Empatada!");
                continue; // Vai para a próxima iteração do loop sem executar o código abaixo
            } else if ((computador == 0 && jogador == 2) ||
                    (computador == 1 && jogador == 0) ||
                    (computador == 2 && jogador == 1)) {
                System.out.println("Que pena! Você PERDEU esta partida, TENTE OUTRA VEZ!");
            } else {
                System.out.println("Parabéns! Você GANHOU esta jogada!");
            }

            System.out.println("=".repeat(45));
            System.out.println("Digite [000] para sair ou qualquer outra tecla para continuar jogando:");
            entrada = jogadaScanner.next();

        } while (!entrada.equals("000"));

        jogadaScanner.close();
    }
}

