package emprestimo_livro;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando pessoas
        Pessoa pessoa1 = new Pessoa(1, "Nelson Machado", LocalDate.now());
        Pessoa pessoa2 = new Pessoa(2, "Ana Raquel", LocalDate.now());

        // Criando livros
        Livro livro1 = new Livro("Java para iniciantes", "Autor Desconhecido", "Editora XYZ", 2022);
        Livro livro2 = new Livro("Python para iniciantes", "Autor Desconhecido", "Editora XYZ", 2023);

        // Criando um empréstimo para a primeira pessoa
        Emprestavel emprestimo1 = new Emprestimo(pessoa1, livro1, LocalDate.now(), LocalDate.now().plusDays(14));

        // Tentando emprestar o livro para a primeira pessoa
        String resultado1 = emprestimo1.emprestar();

        // Exibindo o resultado
        System.out.println(emprestimo1.getDescricao());
        System.out.println(resultado1);

        // Devolvendo o livro
        String resultadoDevolucao1 = emprestimo1.devolver(LocalDate.now());
        System.out.println(resultadoDevolucao1);

        // Criando um novo empréstimo para a segunda pessoa
        Emprestavel emprestimo2 = new Emprestimo(pessoa2, livro2, LocalDate.now(), LocalDate.now().plusDays(14));

        // Tentando emprestar o livro para a segunda pessoa
        String resultado2 = emprestimo2.emprestar();

        // Exibindo o resultado
        System.out.println(emprestimo2.getDescricao());
        System.out.println(resultado2);

        // Consultando disponibilidade
        String disponibilidade = emprestimo2.consultarDisponibilidade();
        System.out.println(disponibilidade);
    }
}




