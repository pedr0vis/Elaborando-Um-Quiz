import java.util.ArrayList;
import java.util.List;

public class Ranking {
    
    private List<User> usuarios;

    // Construtor vazio
    public Ranking() {
        this.usuarios = new ArrayList<>();
    }

    // Construtor com todos os atributos
    public Ranking(List<User> usuarios) {
        this.usuarios = usuarios;
    }

    // Getter e Setter
    public List<User> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<User> usuarios) {
        this.usuarios = usuarios;
    }

    // Método para adicionar um novo jogador à lista
    public void adicionarJogador(User user) {
        if (this.usuarios == null) {
            this.usuarios = new ArrayList<>();
        }
        this.usuarios.add(user);
    }

    // Método para exibir o ranking no console
    public void exibirRanking() {
        System.out.println("\n========== RANKING GERAL ==========");
        if (usuarios == null || usuarios.isEmpty()) {
            System.out.println("Nenhum jogador registrado ainda.");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                User u = usuarios.get(i);
                System.out.println((i + 1) + "º lugar: " + u.getNome() + " - " + u.getPontuacao() + " pontos");
            }
        }
        System.out.println("====================================\n");
    }
}