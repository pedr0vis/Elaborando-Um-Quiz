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

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public int getPontuacao() {

        return pontuacao;

    }

    public void setPontuacao(int pontuacao) {

        this.pontuacao = pontuacao;

    }

}