// 14) Leia do usuário o tempo em segundos e escreva em horas,minutos e segundos.
// Utilize cinco métodos, para a leitura e escritande dados e para obtenção de horas, minutos e segundos a partir
//do tempo em segundos. Ex: 7023 segundos equivalem a 1h57min3seg.

import java.util.Scanner;

public class ConversorDeTempo {
    public static void main(String[] args) {
        int segundos = lerSegundos();
        int horas = calcularHoras(segundos);
        int minutos = calcularMinutos(segundos);
        int segundosRestantes = calcularSegundos(segundos);

        exibirResultado(horas, minutos, segundosRestantes);
    }
    public static int lerSegundos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tempo em segundos: ");
        return scanner.nextInt();
    }

    public static int calcularHoras(int segundos) {
        return segundos / 3600;
    }

    public static int calcularMinutos(int segundos) {
        return (segundos % 3600) / 60;
    }

    public static int calcularSegundos(int segundos) {
        return segundos % 60;
    }

    public static void exibirResultado(int horas, int minutos, int segundos) {
        System.out.print("Resultado: ");
        System.out.println(horas + "h" + minutos + "min" + segundos + "seg");
    }
}
