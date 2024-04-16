package arvore;

public class Persona {
    private String nome;
    private Integer idade;
    private Object pai; // Alterado para Object para aceitar String ou Persona
    private Object mae; // Alterado para Object para aceitar String ou Persona

    public Persona(String nome, Integer idade, Object pai, Object mae) {
        this.nome = nome;
        this.idade = idade;
        this.pai = pai;
        this.mae = mae;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Object getPai() {
        return pai;
    }

    public Object getMae() {
        return mae;
    }

    @Override
    public String toString() {
        String paiNome = (pai != null && pai instanceof Persona) ? ((Persona) pai).getNome() : (String) pai;
        String maeNome = (mae != null && mae instanceof Persona) ? ((Persona) mae).getNome() : (String) mae;

        return "Persona{" +
                "nome='" + nome + '\'' +
                ", idade=" + (idade != null ? idade : "Desconhecida") +
                ", pai=" + (paiNome != null ? paiNome : "Desconhecido") +
                ", mae=" + (maeNome != null ? maeNome : "Desconhecida") +
                '}';
    }
}
