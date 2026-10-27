
public class Main {
    public static void main(String[] args) {

        // 1. Criar os personagens
        Guerreiro guerreiro = new Guerreiro("Aragorn", 120, 20, "Aço");

        Mago mago = new Mago("Gandalf", 80, 100, 30);

        Arqueiro arqueiro = new Arqueiro("Legolas", 90, 20, 25);


        // 2. Exibir informações dos personagens
        System.out.println("===== GUERREIRO =====");
        guerreiro.exibirStatus();

        System.out.println("\n===== MAGO =====");
        mago.exibirStatus();

        System.out.println("\n===== ARQUEIRO =====");
        arqueiro.exibirStatus();


        // 3. Executar as ações específicas
        System.out.println("\n===== AÇÕES DOS PERSONAGENS =====");

        guerreiro.golpear();

        mago.lancarMagia();

        arqueiro.atirar();


        // 4. Fazer o mago lançar magias até a mana ser insuficiente
        System.out.println("\n===== MAGIAS DO MAGO =====");

        for (int i = 0; i < 11; i++) {
            mago.lancarMagia();
        }


        // 5. Fazer o arqueiro atirar até ficar sem flechas
        System.out.println("\n===== FLECHAS DO ARQUEIRO =====");

        for (int i = 0; i < 21; i++) {
            arqueiro.atirar();
        }


        // 6. Utilizar ações da classe Personagem
        System.out.println("\n===== AÇÕES GERAIS =====");

        // Guerreiro recebe dano e recupera vida
        guerreiro.receberDano(30);
        guerreiro.recuperarVida(10);
        guerreiro.receberMoedas(50);

        // Mago recebe dano e recupera vida
        mago.receberDano(20);
        mago.recuperarVida(15);
        mago.receberMoedas(25);

        // Arqueiro recebe dano e recupera vida
        arqueiro.receberDano(15);
        arqueiro.recuperarVida(5);
        arqueiro.receberMoedas(10);


        // 7. Exibir os status finais
        System.out.println("\n===== STATUS FINAL DO GUERREIRO =====");
        guerreiro.exibirStatus();

        System.out.println("\n===== STATUS FINAL DO MAGO =====");
        mago.exibirStatus();

        System.out.println("\n===== STATUS FINAL DO ARQUEIRO =====");
        arqueiro.exibirStatus();
    }
}
