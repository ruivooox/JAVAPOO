package br.com.junior.Principal;

import br.com.alura.modelo.Filme;
import br.com.alura.modelo.Serie;
import br.com.alura.modelo.Titulo;

import java.util.ArrayList;

import java.util.Collections;


public class ListaPrincipal {
    public static void main(String[] args) {

        Filme favorito = new Filme("The Matrix", 2007);
        favorito.avalia(9);
        Filme filmeFavorito=new Filme("Intocaveis ", 2012);
        filmeFavorito.avalia(8);
        Filme sonhoPossivel=new Filme("Sonho Possivel", 2009);
        sonhoPossivel.avalia(5);
        Serie lost=new Serie("Lost", 2004);
        ArrayList<Titulo> listaTitulos=new ArrayList<>();
        listaTitulos.add(favorito);
        listaTitulos.add(filmeFavorito);
        listaTitulos.add(sonhoPossivel);
        listaTitulos.add(lost);
        for (Titulo item : listaTitulos) {
            System.out.println(item.getNome());
            if(item instanceof Filme item1){

                System.out.println("Classificação "+ item1.getClassificacao());

            }

        }
        ArrayList<String> buscaDeTitulos=new ArrayList<>();
        buscaDeTitulos.add("Naruto");
        buscaDeTitulos.add("Death Note");
        buscaDeTitulos.add("Demon Slayer");
        System.out.println(buscaDeTitulos);
        Collections.sort(buscaDeTitulos);
        System.out.println("Após a ordenação: "+ buscaDeTitulos);
        Collections.sort(listaTitulos);
        System.out.println(listaTitulos);

    }
}
