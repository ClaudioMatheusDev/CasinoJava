package fai.casino.app;

import fai.casino.Model.Jogador;
import fai.casino.Model.Jogo;
import fai.casino.Model.Mesa;
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
        Mesa mesa1 = new Mesa("Mesa Alta Risco", "Aposta mínima de 100 fichas");
        mesa1.adicionarModalidade(poker);
        mesa1.adicionarJogador(jogador1);

        jogo.adicionarMesa(mesa1);

        System.out.println("Mesas no jogo " + jogo.getNome() + ":");
        for (Mesa mesa : jogo.getMesas()) {
        System.out.println("- " + mesa.getNome() + " (Regras: " + mesa.getRegras() + ")");
        }
        System.out.println("Modalidades disponíveis:");
        for (Modalidade modalidade : jogo.getModalidades()) {
            System.out.println("- " + modalidade.getNome());
        }
        System.out.println("Rodadas disponíveis:");
        for (Rodada rodada : jogo.getRodadas()) {
            System.out.println("- Rodada " + rodada.getNumero() + ": " + rodada.getTipo());
        }
        System.out.println("Jogadores na mesa " + mesa1.getNome() + ":");
        for (Jogador j : mesa1.getJogadores()) {
            System.out.println("- " + j.getNome());
        }
        System.out.println("Modalidades na mesa " + mesa1.getNome() + ":");
        for (Modalidade modalidade : mesa1.getModalidades()) {
            System.out.println("- " + modalidade.getNome());
        }
    }
}