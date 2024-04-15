package emprestimo_livro;

import java.time.LocalDate;

public interface Emprestavel {
    String emprestar();
    String devolver(LocalDate dataDevolucao);
    String consultarDisponibilidade();
    String getDescricao();
}


