package fai.casino.app;

import fai.casino.Model.Jogador;
import fai.casino.Model.Jogo;
import fai.casino.Model.Modalidade;
import fai.casino.Model.Rodada;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Claudio");
        Jogador jogador2 = new Jogador("Matheus");

        Jogo jogo = new Jogo("Cassino Royale");

        Modalidade poker = new Modalidade("Pôquer");
        Modalidade roleta = new Modalidade("Roleta");

        jogo.adicionarModalidade(poker);
        jogo.adicionarModalidade(roleta);

        jogador1.participarDoJogo(jogo);
        jogador2.participarDoJogo(jogo);

        jogo.adicionarRodada(new Rodada(1, "cartas"));
        jogo.adicionarRodada(new Rodada(2, "dados"));

        System.out.println("Jogadores em " + jogo.getNome() + ":");
        for (Jogador j : jogo.getJogadores()) {
            System.out.println("- " + j.getNome());
        }
    }
}