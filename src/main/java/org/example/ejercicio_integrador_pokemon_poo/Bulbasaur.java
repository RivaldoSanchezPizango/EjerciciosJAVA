package org.example.ejercicio_integrador_pokemon_poo;

public class Bulbasaur extends  Pokemon implements InterfacePlanta  {

    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Bulbasaur: Este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Bulbasaur: Este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Bulbasaur: Este es mi ataque Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Bulbasur: Este es mi ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("BUlbasur: este es mi ataque paralizar");
    }
}
