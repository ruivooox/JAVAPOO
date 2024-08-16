package br.com.junior.Principal;

import br.com.alura.calculos.CalculadoraDeMinutos;
import br.com.alura.modelo.Filme;
import br.com.alura.modelo.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 2007);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);

        Filme filmeFavorito=new Filme("Intocaveis ", 2012);
        filmeFavorito.setDuracaoEmMinutos(200);

        Filme sonhoPossivel=new Filme("Sonho Possivel", 2009);
        sonhoPossivel.setDuracaoEmMinutos(180);

        ArrayList<Filme> listaDeFilmes=new ArrayList<>();
        listaDeFilmes.add(sonhoPossivel);
        listaDeFilmes.add(filmeFavorito);
        listaDeFilmes.add(favorito);


//        favorito.exibeFichaTecnica();
//        favorito.avalia(9);
//        favorito.avalia(8);
//        favorito.avalia(9);

//        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");

        System.out.println("Tamanho da lista "+listaDeFilmes.size());
        System.out.println("Primeiro Filme da Lista: "+ listaDeFilmes.get(0).getNome());
        System.out.println("Filmes da Lista "+listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);

        Serie lost=new Serie("Lost", 2004);
//        lost.exibeFichaTecnica();
//        lost.setTemporadas(10);
//        lost.setEpisodiosPorTemporada(8);
//        lost.setMinutosPorEpisodio(60);
//        System.out.println("Duração em minutos da serie: "+ lost.getDuracaoEmMinutos());
//        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");

//        CalculadoraDeMinutos calculo=new CalculadoraDeMinutos();
//        calculo.inclui(favorito);
//        calculo.inclui(favorite);
//        System.out.println("Duração em Minutos: "+ calculo.getTempotTotal());

        


    }

}
