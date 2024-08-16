package br.com.alura.modelo;

import br.com.alura.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public Filme(String nome, int lancamento) {
        super(nome,lancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia()/2;

    }

    @Override
    public String toString() {
        return "Filme "+ this.getNome();
    }
}