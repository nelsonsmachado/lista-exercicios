package automovel;

public class CarroAutomatico extends Carro {
    private boolean isFreiado;

    public CarroAutomatico(String marca, String modelo, double velMax, int numRodas, String cor, boolean ligado, boolean isFreiado) {
        super(marca, modelo, velMax, numRodas, cor, ligado);
        this.isFreiado = isFreiado;
    }

    public void setFreiado(boolean isFreiado) {
        this.isFreiado = isFreiado;
    }

    @Override
    public void ligar() {
        if (isFreiado) {
            super.ligar();
        } else {
            System.out.println("Pressione o freio para ligar");
        }
    }
}
