import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Jogo {
    private List<Perguntas> perguntas;
    private User jogadorAtual;
    private Ranking ranking;

    // Construtor
    public Jogo() {
        this.perguntas = new ArrayList<>();
        this.ranking = new Ranking();
        carregarPerguntas();
    }

    public void carregarPerguntas() {
        // As opções são passadas primeiro para respeitar o seu construtor em Perguntas.java
        perguntas.add(new Perguntas(
            Arrays.asList("1) Rio de Janeiro", "2) Brasília", "3) São Paulo", "4) Salvador"),
            "Qual é a capital do Brasil?",
            2 // Resposta correta: Opção 2
        ));

        perguntas.add(new Perguntas(
            Arrays.asList("1) 24", "2) 25", "3) 26", "4) 27"),
            "Quantos estados tem o Brasil?",
            3 // Resposta correta: Opção 3 (26 estados + DF)
        ));

        perguntas.add(new Perguntas(
            Arrays.asList("1) C++", "2) Python", "3) Java", "4) JavaScript"),
            "Qual linguagem é conhecida por 'Write Once, Run Anywhere'?",
            3 // Resposta correta: Opção 3
        ));
    }

    public void processarResposta(Perguntas p, int resposta) {
        // Valida comparando diretamente com a resposta correta
        if (p.getRespostaCorreta() == resposta) {
            System.out.println("-> Resposta CORRETA! +10 pontos.");
            // Soma os pontos usando o getPontuacao e setPontuacao da sua classe User
            jogadorAtual.setPontuacao(jogadorAtual.getPontuacao() + 10);
        } else {
            System.out.println("-> Resposta INCORRETA!");
        }
    }

    public void iniciarJogo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do jogador: ");
        String nome = scanner.nextLine();
        jogadorAtual = new User(nome);

        System.out.println("\n--- INICIANDO O QUIZ ---");

        for (Perguntas p : perguntas) {
            System.out.println("\n" + p.getEnunciado());
            for (String opcao : p.getOpcoes()) {
                System.out.println(opcao);
            }

            System.out.print("Sua resposta (digite o número): ");
            int resposta = scanner.nextInt();

            processarResposta(p, resposta);
        }

        System.out.println("\nFim da rodada! Pontuação final de " + jogadorAtual.getNome() + ": " + jogadorAtual.getPontuacao());
        
        // Salva o jogador no ranking
        ranking.adicionarJogador(jogadorAtual);
        
        // Exibe o ranking atualizado
        ranking.exibirRanking();
    }
}