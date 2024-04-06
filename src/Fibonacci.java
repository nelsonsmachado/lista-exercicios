//  7) Calcule a série de Fibonacci para um número inteiro não negativo
//  informado pelo usuário. A série de Fibonacci inicia com os
//  números F0 = 0 e F1 = 1, e cada número posterior equivale à soma
//  dos dois números anteriores (Fn = Fn-1 + Fn-2). Por exemplo, caso
//  o usuário informe o número 9, o resultado seria 0, 1, 1, 2, 3, 5, 8, 13, 21

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        // Caso especial para o primeiro número da série
        if (numero >= 1) {
            System.out.print("0");
        }

        // Caso especial para os dois primeiros números da série
        if (numero >= 2) {
            System.out.print(", 1");
        }

        // Calcula e imprime os números da série de Fibonacci
        int fib0 = 0;
        int fib1 = 1;
        for (int i = 2; i < numero; i++) {
            int fibAtual = fib0 + fib1;
            System.out.print(", " + fibAtual);
            fib0 = fib1;
            fib1 = fibAtual;
        }

        scanner.close();
    }
}

