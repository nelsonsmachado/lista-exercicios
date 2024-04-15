package agenda_telefonica;

import java.util.ArrayList;

public class AgendaTelefonica {
    private final ArrayList<Contato> contatos;

    public AgendaTelefonica() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String numero) {
        contatos.add(new Contato(nome, numero));
    }

    public void deletarContato(String nome) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getNome().equals(nome)) {
                contatos.remove(i);
                System.out.println("Contato removido com sucesso.");
                return;
            }
        }
        System.out.println("Contato não encontrado na agenda.");
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
            return;
        }
        System.out.println("Lista de Contatos:");
        for (Contato contato : contatos) {
            System.out.println(contato.getNome() + ": " + contato.getNumero());
        }
    }

    public Contato consultarContato(String nome) {
        for (Contato contato : contatos) {
            if (contato.getNome().equals(nome)) {
                return contato;
            }
        }
        System.out.println("Contato inexistente.");
        return null;
    }
}


