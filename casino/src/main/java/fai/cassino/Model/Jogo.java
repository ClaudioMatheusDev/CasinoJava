package fai.cassino.Model;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private String nome;
    private List<Jogador> jogadores;
    private List<Modalidade> modalidades;
    private List<Rodada> rodadas;
    private List<Mesa> mesas;

    public Jogo(String nome) {
        this.nome = nome;
        this.jogadores = new ArrayList<>();
        this.modalidades = new ArrayList<>();
        this.rodadas = new ArrayList<>();
        this.mesas = new ArrayList<>();
    }

    public void adicionarJogador(Jogador jogador) {
        if (!jogadores.contains(jogador)) {
            jogadores.add(jogador);
        }
    }

    public void adicionarModalidade(Modalidade modalidade) {
        modalidades.add(modalidade);
    }

    public void adicionarRodada(Rodada rodada) {
        rodadas.add(rodada);
    }

    public String getNome() {
        return nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public List<Modalidade> getModalidades() {
        return modalidades;
    }

    public List<Rodada> getRodadas() {
        return rodadas;
    }

    public void adicionarMesa(Mesa mesa) {
        mesas.add(mesa);
    }
    
    public List<Mesa> getMesas() {
        return mesas;
    }

}
