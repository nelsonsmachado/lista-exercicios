// 4) Implemente o programa da calculadora utilizando uma instrução 
// switch-case para determinar a operação que deve ser executada, 
// conforme o usuário escolheu no menu de opções.

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();
        
        char operacao;
        double resultado = 0;
        
        do {
            System.out.println("Escolha a operação: +, -, * ou /");
            operacao = scanner.next().charAt(0);
            
            switch (operacao) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Não é possível dividir por zero.");
                        return;
                    }
                    break;
                default:
                    System.out.println("Operação inválida. Por favor, escolha novamente.");
            }
        } while (operacao != '+' && operacao != '-' && operacao != '*' && operacao != '/');
        
        System.out.println("O resultado é: " + resultado);

        scanner.close();
    
    }
}


