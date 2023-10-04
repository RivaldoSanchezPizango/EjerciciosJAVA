package org.example.ejercicio_integrador_pokemon_poo;

public abstract class Pokemon {
    protected int numPokedex;
    protected  String nombrePokemon;
    protected double pesoPokemon;
    protected  String sexoPokemon;
    protected int temporada;

    // DECLARAMOS LOS METODOS ABSTRACTOS
    protected  abstract void  atacarPlacaje();
    protected  abstract void  atacarAraniazo();
    protected  abstract void  atacarMordisco();
}
