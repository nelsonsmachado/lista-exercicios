import java.util.Scanner;

public class CalculadoraMetodos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        char operacao;
        double resultado = 0;

        do {
            System.out.println("Escolha a operação: +, -, *, / ou ^ (ou 'q' para sair)");
            operacao = scanner.next().charAt(0);

            switch (operacao) {
                case '+':
                    resultado = soma(num1, num2);
                    break;
                case '-':
                    resultado = subtracao(num1, num2);
                    break;
                case '*':
                    resultado = multiplicacao(num1, num2);
                    break;
                case '/':
                    resultado = divisao(num1, num2);
                    break;
                case '^':
                    resultado = potenciacao(num1, num2);
                    break;
                case 'q':
                    System.out.println("Programa encerrado.");
                    return;
                default:
                    System.out.println("Operação inválida. Por favor, escolha novamente.");
            }

            System.out.println("O resultado é: " + resultado);
        } while (true); // Loop infinito, o usuário pode escolher operações repetidamente

        //scanner.close(); // Não é necessário fechar o scanner, pois estamos usando System.in
    }

    public static double soma(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public static double divisao(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Não é possível dividir por zero.");
            return Double.NaN;
        }
    }

    public static double potenciacao(double base, double expoente) {
        return Math.pow(base, expoente);
    }
}
