package automovel;


public class Carro extends Automovel {

    protected boolean isFreiado;

    public Carro(String marca, String modelo, double velMax, int numRodas, String cor, boolean ligado) {
        super(marca, modelo, velMax, numRodas, cor, ligado);
    }
}
