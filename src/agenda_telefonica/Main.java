package agenda_telefonica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AgendaTelefonica agenda = new AgendaTelefonica();

        boolean executando = true;
        while (executando) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Deletar Contato");
            System.out.println("3 - Listar Contatos");
            System.out.println("4 - Consultar Contato por Nome");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o número do contato: ");
                    String numero = scanner.nextLine();
                    agenda.adicionarContato(nome, numero);
                    break;
                case 2:
                    System.out.print("Digite o nome do contato que deseja deletar: ");
                    String nomeDeletar = scanner.nextLine();
                    agenda.deletarContato(nomeDeletar);
                    break;
                case 3:
                    agenda.listarContatos();
                    break;
                case 4:
                    System.out.print("Digite o nome do contato que deseja consultar: ");
                    String nomeConsultar = scanner.nextLine();
                    Contato contato = agenda.consultarContato(nomeConsultar);
                    if (contato != null) {
                        System.out.println("Contato encontrado:");
                        System.out.println("Nome: " + contato.getNome());
                        System.out.println("Número: " + contato.getNumero());
                    }
                    break;
                case 5:
                    executando = false;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}

