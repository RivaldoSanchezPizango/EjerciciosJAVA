package org.example.ejercicio_plantas;

import org.example.ejercicio_plantas.logica.Arbol;
import org.example.ejercicio_plantas.logica.Arbusto;
import org.example.ejercicio_plantas.logica.Flor;

public class Plantas {
    public static void main(String[] args) {

        Arbol arbolito = new Arbol();
        Flor florcita = new Flor();
        Arbusto arbustito = new Arbusto();

        arbolito.decirLoQueSoy();
        florcita.decirLoQueSoy();
        arbustito.decirLoQueSoy();


    }
}
