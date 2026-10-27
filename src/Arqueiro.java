public class Arqueiro extends Personagem {
    private int qtdeFlechas;
    private int precisao;

    public Arqueiro (String nome, int vidaMaxima, int qtdeFlechas, int precisao) {
        super(nome, "Arqueiro", vidaMaxima);
        this.qtdeFlechas = qtdeFlechas;
        this.precisao = precisao;
    }

    public void atirar() {
        if (qtdeFlechas > 0) {
            System.out.println("Flecha atirada com precisão " + precisao);
            qtdeFlechas -= 1;
        }
        else {
            System.out.println("Você não tem flechas para atirar");
        }
    }
}
