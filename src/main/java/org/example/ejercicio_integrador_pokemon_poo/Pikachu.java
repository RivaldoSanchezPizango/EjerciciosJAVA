package org.example.ejercicio_integrador_pokemon_poo;

public class Pikachu extends Pokemon implements InterfaceElectrico{


    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Pikachu: Este es mi ataque Placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pikachu: Este es mi ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Pikachu: Este es mi ataque Mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Pikachu: Ataque ImpacTrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Pikachu: Ataque Puño Trueno");
    }
}
