public class Personagem {
    // Atributos com valores definidos automaticamente
    private int nivel;
    private int moedas;
    private int vidaMaxima;
    private int vidaAtual;

    // Atributos definidos pelo usuário
    private String nome;
    private String classe;

    // Construtor
    public Personagem(String nome, String classe, int vidaMaxima) {
        this.nome = nome;
        this.classe = classe;
        this.vidaMaxima = vidaMaxima;
        this.vidaAtual = vidaMaxima;
        this.nivel = 1;
        this.moedas = 100;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getClasse() {
        return classe;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getVidaAtual() {
        return vidaAtual;
    }

    public int getNivel() {
        return nivel;
    }

    public int getMoedas() {
        return moedas;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    // Subir de nível
    public void subirNivel() {
        nivel++;
    }

    // Receber dano
    public void receberDano(int dano) {
        if (dano < 0) {
            return;
        }

        vidaAtual -= dano;

        if (vidaAtual < 0) {
            vidaAtual = 0;
        }
    }

    // Recuperar vida
    public void recuperarVida(int quantidade) {
        if (quantidade < 0) {
            return;
        }

        vidaAtual += quantidade;

        if (vidaAtual > vidaMaxima) {
            vidaAtual = vidaMaxima;
        }
    }

    // Receber moedas
    public void receberMoedas(int valor) {
        if (valor < 0) {
            return;
        }

        moedas += valor;
    }

    // Gastar moedas
    public void gastarMoedas(int valorGasto) {
        if (valorGasto < 0) {
            return;
        }

        if (valorGasto > moedas) {
            return;
        }

        moedas -= valorGasto;
    }

    // Exibir informações
    public void exibirStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Vida: " + vidaAtual + "/" + vidaMaxima);
        System.out.println("Nível: " + nivel);
        System.out.println("Moedas: " + moedas);
    }
}
