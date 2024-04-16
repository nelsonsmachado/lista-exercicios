package automovel;

public abstract class Automovel {
    private String marca;
    private String modelo;
    private String cor;
    private int numRodas;
    private int velMax;
    private boolean ligado;

    public Automovel(String marca, String modelo, double velMax, int numRodas, String cor, boolean ligado) {
    }

    public Automovel(String marca, String modelo, String cor, int numRodas, int velMax, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.numRodas = numRodas;
        this.velMax = velMax;
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public int getVelMax() {
        return velMax;
    }

    public void setVelMax(int velMax) {
        this.velMax = velMax;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        System.out.println("Ligado.");
    }
    public void desligar() {
        System.out.println("Desligado.");
    }
}
