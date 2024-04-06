// 1) Definir a idade de uma pessoa e verificar se ela é maior de idade ou não.

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        // Solicita ao usuário que insira a data de nascimento
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe aqui a sua data de nascimento (aaaa/mm/dd): ");
        String dataNascimentoStr = scanner.nextLine();
        scanner.close();

        // Define um DateTimeFormatter personalizado para lidar com o formato da data fornecido pelo usuário
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");

        // Converte a string da data de nascimento em um objeto LocalDate usando o formatter personalizado
        LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

        // Obtém a data atual do sistema
        LocalDate dataAtual = LocalDate.now();

        // Calcula a idade
        int idade = dataAtual.getYear() - dataNascimento.getYear();

        // Verifica se já fez aniversário neste ano
        if (dataNascimento.getMonthValue() > dataAtual.getMonthValue() ||
                (dataNascimento.getMonthValue() == dataAtual.getMonthValue() &&
                        dataNascimento.getDayOfMonth() > dataAtual.getDayOfMonth())) {
            idade--;
        }

        // Verifica se a pessoa é maior de idade
        if (idade >= 18) {
            System.out.print("Você é maior de idade. \n");
        } else {
            System.out.print("Você é menor de idade. \n");
        }

        // Exibe a idade e a data de nascimento
        System.out.println("E de acordo com a data de nascimento informada " + dataNascimentoStr +
                ",\nsua idade é de " + idade + " anos.");

    }
}
