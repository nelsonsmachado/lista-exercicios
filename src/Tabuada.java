// 5) Construa a tabuada de um número. (ex: 1x1=1 1x2=2,...,1x10=10).


import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o númeral para a impressão de sua taboada:  ");
        int numero = scanner.nextInt();

        // Loop para multiplicar o número de 1 a 10
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}



