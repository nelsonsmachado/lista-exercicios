public class AvalieEAproveAluno {
    public double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) { //for each
            soma += nota;
        }
        return soma / notas.length;
    }

    public String getStatus(double media) {
        if (media > 6) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Verificação Suplementar/ Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public static void main(String[] args) {
        AvalieEAproveAluno calculadora = new AvalieEAproveAluno();
        double[] notas = {8.0, 7.0, 5.5, 7.5};
        double media = calculadora.calcularMedia(notas);
        String status = calculadora.getStatus(media);
        System.out.println("Média das notas: " + media);
        System.out.println("Status de Aprovação: " + status);
    }
}

