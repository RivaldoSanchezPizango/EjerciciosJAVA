package org.example.ejercicio_plantas.logica;

public class Arbol extends Planta  {

    private  String variedad;
    private  String tipoTronco;
    private  double radioTronco;
    private  String color;
    private  String tipoHojas;

    public Arbol() {
    }

    public Arbol(String variedad, String tipoTronco, double radioTronco, String color, String tipoHojas, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.tipoHojas = tipoHojas;
    }


    public String getVariedad() {
        return variedad;
    }
    public Arbol setVariedad(String variedad) {
        this.variedad = variedad;
        return this;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }
    public Arbol setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
        return this;
    }

    public double getRadioTronco() {
        return radioTronco;
    }
    public Arbol setRadioTronco(double radioTronco) {
        this.radioTronco = radioTronco;
        return this;
    }

    public String getColor() {
        return color;
    }
    public Arbol setColor(String color) {
        this.color = color;
        return this;
    }

    public String getTipoHojas() {
        return tipoHojas;
    }
    public Arbol setTipoHojas(String tipoHojas) {
        this.tipoHojas = tipoHojas;
        return this;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un ARBOL");
    }
}
