package automovel;

    public class TesteAutomovel {
        public static void main(String[] args) {
            // Criando instâncias das classes
            CarroAutomatico carroAutomatico = new CarroAutomatico("Toyota", "Corolla", 200, 4, "Prata", false, false);
            MotoPedal motoPedal = new MotoPedal("Honda", "CBR500R", 180, 2, "Vermelho", false);
            Guincho guincho = new Guincho("Scania", "R620", 100, 4, "Amarelo", false);

            // Testando os métodos
            carroAutomatico.ligar();
            motoPedal.ligar(false);
            motoPedal.ligar(true);

            guincho.carregar(carroAutomatico);
            guincho.carregar(motoPedal);
        }
    }

