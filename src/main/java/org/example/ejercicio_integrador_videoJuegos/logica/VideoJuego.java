package org.example.ejercicio_integrador_videoJuegos.logica;

public class VideoJuego {
    private int codigo;
    private   String titulo;
    private  String consola;
    private  int cantidadJugadores;
    private  String categoria;

    public VideoJuego() {
    }

    public VideoJuego(int codigo, String titulo, String consola, int cantidadJugadores, String categoria) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.consola = consola;
        this.cantidadJugadores = cantidadJugadores;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }
    public VideoJuego setCodigo(int codigo) {
        this.codigo = codigo;
        return this;
    }

    public String getTitulo() {
        return titulo;
    }
    public VideoJuego setTitulo(String titulo) {
        this.titulo = titulo;
        return this;
    }

    public String getConsola() {
        return consola;
    }
    public VideoJuego setConsola(String consola) {
        this.consola = consola;
        return this;
    }

    public int getCantidadJugadores() {
        return cantidadJugadores;
    }
    public VideoJuego setCantidadJugadores(int cantidadJugadores) {
        this.cantidadJugadores = cantidadJugadores;
        return this;
    }

    public String getCategoria() {
        return categoria;
    }
    public VideoJuego setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }

    @Override
    public String toString() {
        return "VideoJuego{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", consola='" + consola + '\'' +
                ", cantidadJugadores=" + cantidadJugadores +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
