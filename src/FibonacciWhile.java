//  9) Altere o exercício 7 para o algoritmo contar a série Fibonacci até
//  um determinado número. Por exemplo, caso declarado o número
//  25, o resultado seria: 0, 1, 1, 2, 3, 5, 8, 13, 21.

import java.util.Scanner;

public class FibonacciWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para limitar a série de Fibonacci: ");
        int limite = scanner.nextInt();

        int fib0 = 0;
        int fib1 = 1;

        // Caso especial para imprimir o primeiro número da série
        if (limite >= 0) {
            System.out.print(fib0);
        }

        // Caso especial para imprimir o segundo número da série
        if (limite >= 1) {
            System.out.print(", " + fib1);
        }

        // Calcula e imprime os números da série de Fibonacci usando um while
        int fibAtual = fib0 + fib1;
        while (fibAtual <= limite) {
            System.out.print(", " + fibAtual);
            fib0 = fib1;
            fib1 = fibAtual;
            fibAtual = fib0 + fib1;
        }

        scanner.close();
    }
}
