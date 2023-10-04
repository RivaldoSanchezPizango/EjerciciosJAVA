package org.example.ejercicio_integrador_pokemon_poo;

public class Squirtle extends  Pokemon implements  InterfaceAgua{

    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Squirtle: Este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Squirtle: Este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Squirtle: Este es mi ataque Mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Squiertle: Ataque Hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Squiertle: Ataque Burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Squiertle: Ataque Pistola Agua");
    }
}
