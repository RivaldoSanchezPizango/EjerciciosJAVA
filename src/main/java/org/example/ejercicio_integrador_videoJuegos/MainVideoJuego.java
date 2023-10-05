package org.example.ejercicio_integrador_videoJuegos;

import org.example.ejercicio_integrador_videoJuegos.logica.VideoJuego;

import java.util.ArrayList;
import java.util.List;

public class MainVideoJuego {
    public static void main(String[] args) {

        List <VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();

        VideoJuego juego1 = new VideoJuego(243, "Mario car", "Nintendo 64", 4, "Plataforma");
        VideoJuego juego2 = new VideoJuego(354, "Golden Eye 007", "Nintendo 64", 2, "Plataforma");
        VideoJuego juego3 = new VideoJuego(76, "Perfect Dark", "PC", 4, "Estrategia");
        VideoJuego juego4 = new VideoJuego(9876, "Droom 64", "Nintendo 64", 4, "Shooter");
        VideoJuego juego5 = new VideoJuego(167, "Star Fox 64", "PS", 4, "Adventure");

        listaVideojuegos.add(juego1);
        listaVideojuegos.add(juego2);
        listaVideojuegos.add(juego3);
        listaVideojuegos.add(juego4);
        listaVideojuegos.add(juego5);
        // recorremos
        for (VideoJuego  juego : listaVideojuegos) {
            System.out.println("Titulo" + juego.getTitulo() + "Consola" + juego.getConsola() + "CantidaJugadores"
                    + juego.getCantidadJugadores() + "Categoria" + juego.getCategoria());
        }
        // cambio de nombre y jugadores
        juego1.setTitulo("Banjo Kazooie");
        juego1.setCantidadJugadores(2);
        //
        for (VideoJuego  juego : listaVideojuegos) {
            if (juego.getConsola().equals("Nintendo 64")) {
                System.out.println(juego.toString());
            }
        }
    }
}
