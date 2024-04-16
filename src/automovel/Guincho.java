package automovel;

public class Guincho extends Automovel {
    public Guincho(String marca, String modelo, double velMax, int numRodas, String cor, boolean ligado) {
        super(marca, modelo, velMax, numRodas, cor, ligado);
    }

    public void carregar(Automovel automovel) {
        System.out.println("O guincho está carregando um " + automovel.getClass().getSimpleName());
    }
}

