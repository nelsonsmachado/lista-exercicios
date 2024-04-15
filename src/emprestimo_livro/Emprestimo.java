package emprestimo_livro;
import java.time.LocalDate;

public class Emprestimo implements Emprestavel {
    private Pessoa pessoa;
    private Livro livro;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Pessoa pessoa, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao) {
        this.pessoa = pessoa;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    @Override
    public String emprestar() {
        // Lógica para emprestar o livro
        // Se estiver disponível, empresta e retorna "Emprestado com sucesso"
        // Caso contrário, retorna "Indisponível no momento"
        if (livro.isDisponivel()) {
            livro.setDisponivel(false);
            return "Emprestado com sucesso";
        } else {
            return "Indisponível no momento";
        }
    }

    @Override
    public String devolver(LocalDate dataDevolucao) {
        // Lógica para devolver o livro e atualizar datas, etc.
        livro.setDisponivel(true);
        this.dataDevolucao = dataDevolucao;
        return "Devolvido com sucesso!";
    }

    @Override
    public String consultarDisponibilidade() {
        // Lógica para verificar se o livro está disponível para empréstimo
        // Se estiver disponível, retorna "Disponível para empréstimo"
        // Caso contrário, retorna "Indisponível para empréstimo"
        if (livro.isDisponivel()) {
            return "Disponível para empréstimo";
        } else {
            return "Indisponível para empréstimo";
        }
    }

    @Override
    public String getDescricao() {
        return "Pessoa: " + pessoa.getNome() + "\nLivro: " + livro.getNome();
    }
}


