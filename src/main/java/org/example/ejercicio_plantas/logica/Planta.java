package org.example.ejercicio_plantas.logica;

public abstract class Planta {
    private  String nombre;
    private  double altoTallo;
    private  boolean tieneHoja;
    private  String climaIdeal;

    public Planta() {
    }
    public Planta(String nombre, double altoTallo, boolean tieneHoja, String climaIdeal) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.tieneHoja = tieneHoja;
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }
    public Planta setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public double getAltoTallo() {
        return altoTallo;
    }
    public Planta setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
        return this;
    }

    public boolean isTieneHoja() {
        return tieneHoja;
    }
    public Planta setTieneHoja(boolean tieneHoja) {
        this.tieneHoja = tieneHoja;
        return this;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }
    public Planta setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
        return this;
    }

    public  abstract void decirLoQueSoy();
}
