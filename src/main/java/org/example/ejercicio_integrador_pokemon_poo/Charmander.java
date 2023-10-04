package org.example.ejercicio_integrador_pokemon_poo;

public class Charmander extends  Pokemon implements InterfaceFuego{

    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Charmander: Este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Charmander: Este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Charmander: Este es mi ataque Mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Charmander: Ataque Puño Fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Charmander: Ataque Lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Charmander: Ataque Ascuas");
    }
}
