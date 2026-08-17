import java.util.List;
import java.util.ArrayList;

public class Perguntas {

    private List<String> opcoes;
    private String enunciado;
    private int respostaCorreta;

    // Construtor vazio
    public Perguntas() {
    }

    // Construtos com todos os atributos
    public Perguntas(List<String> opcoes, String enunciado, int respostaCorreta) {

        this.opcoes = opcoes;
        this.enunciado = enunciado;
        this.respostaCorreta = respostaCorreta;

    }

    // Construtor à escolha
    public Perguntas(String enunciado, int respostaCorreta) {

        this.opcoes = new ArrayList<>();
        this.enunciado = enunciado;
        this.respostaCorreta = respostaCorreta;

    }

}