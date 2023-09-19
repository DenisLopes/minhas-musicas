package br.com.denislopes.minhasmusicas.principal;

import br.com.denislopes.minhasmusicas.modelos.MinhasPreferidas;
import br.com.denislopes.minhasmusicas.modelos.Musica;
import br.com.denislopes.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("These Days");
        musica.setCantor("Bon Jovi");

        for (int i = 0; i < 200; i++) {
            musica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setApresentador("Joao Santos");
        podcast.setTitulo("Fala Dev");

        for (int i = 0; i < 200; i++) {
            podcast.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            podcast.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(musica);
        minhasPreferidas.inclui(podcast);

    }
}
