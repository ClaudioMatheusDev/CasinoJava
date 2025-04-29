package fai.casino.Model;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    private String nome;
    private String regras;
    private List<Jogador> jogadores;
    private List<Modalidade> modalidades;

    public Mesa(String nome, String regras) {
        this.nome = nome;
        this.regras = regras;
        this.jogadores = new ArrayList<>();
        this.modalidades = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        if (!jogadores.contains(jogador)) {
            jogadores.add(jogador);
        }
    }

    public void adicionarModalidade(Modalidade modalidade) {
        if (!modalidades.contains(modalidade)) {
            modalidades.add(modalidade);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getRegras() {
        return regras;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public List<Modalidade> getModalidades() {
        return modalidades;
    }
}
