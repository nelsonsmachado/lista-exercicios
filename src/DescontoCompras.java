// 2) Para cada produto informado (nome, preço e quantidade), escreva o 
// nome do produto comprado e o valor total a ser pago, considerando 
// que são oferecidos descontos pelo número de unidades compradas, 
// segundo a tabela abaixo:
// a. Até 10 unidades: valor total
// b. De 11 a 20 unidades: 10% de desconto
// c. De 21 a 50 unidades: 20% de desconto
// d. Acima de 50 unidades: 25% de desconto

import java.util.Scanner;

public class DescontoCompras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Informe o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        System.out.print("Informe a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double valorTotal = precoProduto * quantidade;

        // Chamando o método Desconto para calcular o desconto
        double desconto = Desconto(precoProduto, quantidade);

        // Aplicando o desconto ao valor total
        double valorComDesconto = valorTotal - desconto;


        System.out.println("O valor bruto da compra do(a)(s) " + quantidade + " " + nomeProduto  + " ficou em: R$ " + valorTotal);
        System.out.println("O valor final de sua(s) compra(s) (" + nomeProduto  + ") com desconto ficou em: R$ " + valorComDesconto);
        System.out.println("Sua economia nesta compra foi de: R$ " + desconto);

        scanner.close();
    }

    public static double Desconto(double precoProduto, int quantidade) {
        double desconto;

        if (quantidade <= 10) {
            desconto = 0;
        } else if (quantidade <= 20) {
            desconto = precoProduto * quantidade * 0.1; // 10% de desconto
        } else if (quantidade <= 50) {
            desconto = precoProduto * quantidade * 0.2; // 20% de desconto
        } else {
            desconto = precoProduto * quantidade * 0.25; // 25% de desconto
        }
        return desconto;
    }
}
