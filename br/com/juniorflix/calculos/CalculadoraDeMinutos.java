package br.com.alura.calculos;

import br.com.alura.modelo.Titulo;

public class CalculadoraDeMinutos {
    private int tempotTotal;

    public int getTempotTotal() {
        return tempotTotal;
    }
    public void inclui(Titulo titulo){
        tempotTotal+=titulo.getDuracaoEmMinutos();
    }
}
