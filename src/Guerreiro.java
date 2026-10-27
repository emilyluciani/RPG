public class Guerreiro extends Personagem{
    private  int forca;
    private String armadura;

    public Guerreiro (String nome, int vidaMaxima, int forca, String armadura) {
        super(nome, "Guerreiro", vidaMaxima);
        this.forca = forca;
        this.armadura = armadura;
    }

    public void golpear () {
        System.out.println("O personagem realizou um golpe de força" + forca);
    }
}
