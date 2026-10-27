public class Mago extends Personagem{
    private  int mana;
    private int poderMagico;

    public Mago (String nome, int vidaMaxima, int mana, int poderMagico) {
        super(nome, "Mago", vidaMaxima);
        this.mana = mana;
        this.poderMagico = poderMagico;
    }

    public void lancarMagia() {
        if (mana >= 10) {
            System.out.println("Magia lançada com poder " + poderMagico);
            mana -= 10;
        } else {
            System.out.println("Mana insuficiente");
        }
    }
}
