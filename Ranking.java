import java.util.List;

public class Ranking {
    
    private List<User> usuarios;

    // Construtor vazio
    public Ranking() {
    }

    // Construtor com todos os atributos
    public Ranking(List<User> usuarios) {

        this.usuarios = usuarios;
        
    }

    // Getter e Setter
    public List<User> getUsuarios() {

        return usuarios;

    }

    public void setUsuarios(List<User> usuariis) {

        this.usuarios = usuarios;

    }

}


