package arvore;

public class Main {
    public static void main(String[] args) {

        Persona avoPaterno = new Persona("Shigueo Sasaki", null, null, null);
        Persona avoMaterno = new Persona("Hatsuse Sasaki", null, null, null);

        Persona avoPaternoPai = new Persona("Joao Machado", null, null, null);
        Persona avoMaternoPai = new Persona("Maria Machado", null, null, null);

        Persona pai = new Persona("Nelson Gomes", 85, avoPaternoPai, avoMaternoPai);
        Persona mae = new Persona("Mizue Sasaki", 75, avoPaterno, avoMaterno);

        Persona filho = new Persona("Nelson Sasaki Machado", 55, pai, mae);

        System.out.println("**Árvore genealógica**");
        System.out.println(filho);
        System.out.println("Pai: " + filho.getPai());
        System.out.println("Mãe: " + filho.getMae());
        System.out.println("Avô Paterno: " + (filho.getPai() != null ? ((Persona)filho.getPai()).getPai() : "Desconhecido"));
        System.out.println("Avó Materna: " + (filho.getMae() != null ? ((Persona)filho.getMae()).getMae() : "Desconhecida"));
        System.out.println("Avô Materno: " + (filho.getMae() != null ? ((Persona)filho.getMae()).getPai() : "Desconhecido"));
        System.out.println("Avó Paterna: " + (filho.getPai() != null ? ((Persona)filho.getPai()).getMae() : "Desconhecida"));

    }
}
