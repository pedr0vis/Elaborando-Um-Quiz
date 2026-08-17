public class User {

    private String nome;
    private int pontuacao;

    // Construtor vazio
    public User() {
    }

    // Construtor com todos os atributos
    public User(String nome, int pontuacao) {
        this.nome = nome;
        this.pontuacao = pontuacao;
    }

    // Construtor à escolha
    public User(String nome) {
        this.nome = nome;
        this.pontuacao = 0; // valor padrão
    }

}