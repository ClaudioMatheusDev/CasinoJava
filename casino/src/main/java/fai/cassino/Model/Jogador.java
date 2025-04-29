package fai.cassino.Model;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private int fichas;
    private List<Jogo> jogos;

    public Jogador(String nome) {
        this.nome = nome;
        this.fichas = 0;
        this.jogos = new ArrayList<>();
    }

    public void participarDoJogo(Jogo jogo) {
        if (!jogos.contains(jogo)) {
            jogos.add(jogo);
            jogo.adicionarJogador(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public int getFichas() {
        return fichas;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public void adicionarFichas(int quantidade) {
        this.fichas += quantidade;
    }
}
