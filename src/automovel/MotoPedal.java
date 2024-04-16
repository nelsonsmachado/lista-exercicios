package automovel;

public class MotoPedal extends Moto {
    public MotoPedal(String marca, String modelo, double velMax, int numRodas, String cor, boolean ligado) {
        super(marca, modelo, velMax, numRodas, cor, ligado);
    }

    public void ligar(boolean aceleradorPuxado) {
        if (aceleradorPuxado) {
            super.ligar();
        } else {
            System.out.println("Pressione o acelerador");
        }
    }
}
