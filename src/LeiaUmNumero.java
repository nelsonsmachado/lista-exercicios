// 8) Leia um número até que o usuário digite 10.

import java.util.Scanner;

public class LeiaUmNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número inteiro qualquer ou digite '10' para sair:  ");
            numero = scanner.nextInt();
            System.out.println("Voce digitou o número " + numero);

        } while (numero != 10);

        System.out.println("Você digitou 10. \nEncerrando o programa...\nAté a proxima!");

        scanner.close();
    }
}

